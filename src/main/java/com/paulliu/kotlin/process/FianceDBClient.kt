package com.paulliu.kotlin.process

import io.vertx.core.file.OpenOptions
import io.vertx.core.json.JsonArray
import io.vertx.core.json.JsonObject
import io.vertx.ext.asyncsql.MySQLClient
import io.vertx.rxjava.core.AbstractVerticle
import io.vertx.rxjava.core.buffer.Buffer
import io.vertx.rxjava.ext.asyncsql.AsyncSQLClient
import rx.Single
import java.io.BufferedReader
import java.io.InputStreamReader
import java.nio.file.Files
import java.nio.file.Paths
import java.util.concurrent.atomic.AtomicLong
import java.util.concurrent.atomic.LongAdder

/**
 * usage:
 * <p>
 * </p>
 * User:liusonglin; Date:2018/2/5;ProjectName:vertxguide;
 */
class FianceDBClient: AbstractVerticle() {
    var config = JsonObject();

    override fun start() {
        val put = config.put("url", "jdbc:mysql://127.0.0.1:3306")
                .put("database", "test")
                .put("max_pool_size", 30)
                .put("username", "root")
                .put("password", "111111")

        val sql = "INSERT into t_fiance_temp (prod_offer_name,prod_offer_id,finish_time,acc_nbr,cust_order_id,order_item_id,rn)" +
                "VALUES(?,?,?,?,?,?,?)"

        var client = AsyncSQLClient(MySQLClient.createShared(vertx.delegate,put))

        val path = Paths.get("/Users/liusonglin/Documents/电信/红包/1月红包发展清单.txt")

        val fs = vertx.fileSystem()

        fs.rxReadFile("/Users/liusonglin/Documents/电信/红包/1月红包发展清单.txt")
                .flatMap { Single.just(it) }
                .map {
                    fs.rxWriteFile("/Users/liusonglin/Documents/电信/红包/001.txt",it)
                            .subscribe()
                }.subscribe({},{ println(it)})

        Files.newInputStream(path).use {
            val reader = InputStreamReader(it, "GBK")
            val bufreader = BufferedReader(reader);
            bufreader.lines().skip(1).forEach({
                val str = it.split("|")
                val para = JsonArray(str)
                client.rxGetConnection()
                        .flatMap { Single.just(it).doOnUnsubscribe(it::close) }
                        .flatMap { it.rxUpdateWithParams(sql,para) }
                        .subscribe({println("success")},{
                                println("```````${it}")
                        })
            })
        }
    }
}
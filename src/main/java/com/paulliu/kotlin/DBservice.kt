package com.paulliu.kotlin

import com.paulliu.kotlin.dataService.DataService
import com.paulliu.kotlin.dataService.DataServiceImpl
import com.paulliu.kotlin.dataService.SecondService
import com.paulliu.kotlin.dataService.SecondServiceImpl
import io.vertx.core.AbstractVerticle
import io.vertx.core.json.JsonObject
import io.vertx.ext.asyncsql.AsyncSQLClient
import io.vertx.ext.asyncsql.MySQLClient
import io.vertx.serviceproxy.ServiceBinder

/**
 * usage:
 * <p>
 * </p>
 * User:liusonglin; Date:2017/12/1;ProjectName:vertxguide;
 */
class DBservice: AbstractVerticle(){
    var config = JsonObject();

    private var client: AsyncSQLClient?= null

    override fun start() {

        val put = config.put("url", "jdbc:mysql://127.0.0.1:3306")
                .put("database", "test")
                .put("max_pool_size", 30)
                .put("username", "root")
                .put("password", "111111")

        client = MySQLClient.createShared(vertx,put)
        val service = DataServiceImpl(client!!)
        val second = SecondServiceImpl(client!!)
        val binder = ServiceBinder(vertx).setAddress(que)
        binder.register(DataService::class.java,service)
        val binder2 = ServiceBinder(vertx).setAddress(que2)
        binder2.register(SecondService::class.java,second)
    }
}
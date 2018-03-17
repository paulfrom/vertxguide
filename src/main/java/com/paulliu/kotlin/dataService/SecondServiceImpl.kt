package com.paulliu.kotlin.dataService

import io.vertx.core.AsyncResult
import io.vertx.core.Handler
import io.vertx.core.json.JsonArray
import io.vertx.ext.asyncsql.AsyncSQLClient
import io.vertx.rx.java.RxHelper
import io.vertx.rxjava.ext.sql.SQLConnection
import rx.Single

/**
 * usage:
 * <p>
 * </p>
 * User:liusonglin; Date:2017/12/22;ProjectName:vertxguide;
 */
 class SecondServiceImpl(jdbcClient: AsyncSQLClient):SecondService{

    var client = io.vertx.rxjava.ext.asyncsql.AsyncSQLClient(jdbcClient)

    private fun connection(): Single<SQLConnection> {
        return client.rxGetConnection().flatMap {
            Single.just(it).doOnUnsubscribe(it::close)
        }
    }

    override fun insertOther(para: JsonArray, resultHandle: Handler<AsyncResult<Boolean>>): SecondService{
        println("in other fun ${para}")

        connection().flatMap {
            println("excute sql ${para}")
            it.rxUpdateWithParams("insert into t_other (other_name,other_thing) VALUES(?,?)",para)
        }.map {
            it.updated > 0
        }.subscribe(RxHelper.toSubscriber(resultHandle))

        return this
    }

}
package com.paulliu.kotlin.dataService

import com.paulliu.kotlin.Demo
import io.vertx.core.AsyncResult
import io.vertx.core.Handler
import io.vertx.core.json.JsonArray
import io.vertx.core.json.JsonObject
import io.vertx.rx.java.RxHelper
import io.vertx.rxjava.ext.asyncsql.AsyncSQLClient
import io.vertx.rxjava.ext.sql.SQLConnection
import rx.Observable
import rx.Single
import java.math.BigDecimal

/**
 * usage:
 * <p>
 * </p>
 * User:liusonglin; Date:2017/12/18;ProjectName:vertxguide;
 */
class DataServiceImpl(jdbcClient : io.vertx.ext.asyncsql.AsyncSQLClient):DataService{
    private var client = AsyncSQLClient(jdbcClient)
    private fun connection(): Single<SQLConnection> {
        return client.rxGetConnection().flatMap {
            Single.just(it).doOnUnsubscribe(it::close)
        }
    }

    override fun getDemo(`object`: JsonObject, resultHandler: Handler<AsyncResult<List<JsonObject>>>): DataService {
        println("service demo======>${`object`}")
        var xxx = connection()
                .flatMap { it.rxQuery("select * from t_demo") }
                .map { it.rows }
//                .map({return@map it.getString(1) }) // <3>
//                .sorted()
//                .collect({JsonArray()}, { x, y -> x.add(y) })

        xxx.subscribe(RxHelper.toSubscriber(resultHandler))
        return this
    }

}
package com.paulliu.kotlin

import com.paulliu.jooq.tables.daos.TDemoDao
import io.github.jklingsporn.vertx.jooq.rx.async.AsyncRXGenericQueryExecutor
import io.vertx.reactivex.ext.web.RoutingContext
import org.jooq.Condition
import rx.Single

/**
 * usage:
 * <p>
 * </p>
 * User:liusonglin; Date:2017/12/1;ProjectName:vertxguide;
 */
fun indexDemo(context: RoutingContext, demoDao: TDemoDao){
    println("in index")


    demoDao.findOneById(29).doOnEvent {
        t1, t2 ->
        print(t1.get())
        context.response().end(t1.toString())
    }.subscribe(
            { println(it)},
            {
                println(it.printStackTrace())
                return@subscribe
            })
}


package com.paulliu.kotlin

import com.paulliu.jooq.tables.daos.TDemoDao
import io.vertx.core.json.JsonObject
import io.vertx.ext.web.api.validation.HTTPRequestValidationHandler
import io.vertx.reactivex.core.AbstractVerticle
import io.vertx.reactivex.ext.asyncsql.MySQLClient
import io.vertx.reactivex.ext.web.Router
import io.vertx.reactivex.ext.web.handler.BodyHandler
import io.vertx.servicediscovery.types.HttpEndpoint
import org.jooq.SQLDialect
import org.jooq.impl.DefaultConfiguration



/**
 * usage:
 * <p>
 * </p>
 * User:liusonglin; Date:2017/12/1;ProjectName:vertxguide;
 */
val que = "event-bus"
val que2 ="2333"
class HttpService: AbstractVerticle(){

    override fun start() {

        var router = Router.router(vertx);

        val configuration = DefaultConfiguration()
        configuration.set(SQLDialect.MYSQL) //or SQLDialect.POSTGRES

        val put = JsonObject().put("url", "jdbc:mysql://127.0.0.1:3306")
                    .put("database", "test")
                    .put("username", "root")
                    .put("password", "111111")

        val client = MySQLClient.createShared(vertx, put)

        val demoDao = TDemoDao(configuration,client);

        val validationHandler = HTTPRequestValidationHandler.create().addCustomValidatorFunction({
            it.bodyAsJson.map
        })

        router.route().handler(BodyHandler.create())
        router.get("/").handler({ indexDemo(it,demoDao)})
//        router.post("/other").handler { otherHandler(it) }


        vertx.createHttpServer()
                .requestHandler({ router.accept(it) })
                .rxListen(8080)
                .subscribe({
                    println("HTTP server running 222 on port  portNumber")
                }, {
                    println("Could not start 2222 a HTTP server")
                })

        print("the end of function")
    }

//    private fun indexHandler(context:RoutingContext){
//
//        println("in index")
//        var options = DeliveryOptions()
//                .addHeader("index","myindex")
//
//
//        vertx.eventBus().send<Any>(que,JsonObject().put("name",context.request().getParam("name")),options,{reply ->
//            if(reply.succeeded()){
//                var body = reply.result().body()
//                println("index get body ${body}")
//                context.response().putHeader("content-type", "text/html").end(body.toString())
//            }else{
//                println(reply.cause().message)
//            }
//        })
//    }
}
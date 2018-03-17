//package com.paulliu.kotlin
//
//import io.vertx.core.Future
//import io.vertx.core.Vertx
//import io.vertx.ext.unit.TestContext
//import io.vertx.ext.unit.junit.VertxUnitRunner
//import io.vertx.ext.web.client.WebClient
//import org.junit.After
//import org.junit.Before
//
//import org.junit.Test
//import org.junit.runner.RunWith
//
///**
// * usage:
// *
// *
// *
// * User:liusonglin; Date:2017/12/19;ProjectName:vertxguide;
// */
//@RunWith(VertxUnitRunner::class)
//class HttpServiceTest {
//
//    private var vertx:Vertx? = null
//
//    @Before
//    fun setUp() {
//        vertx = Vertx.vertx()
//    }
//
//    @After
//    fun finish(context: TestContext){
//        vertx!!.close(context.asyncAssertSuccess())
//    }
//
//    @Test
//    fun start_http_test(context:TestContext){
//        var asyn = context.async()
//
//        vertx!!.createHttpServer().requestHandler({
//            it.response().putHeader("Content-Type", "text/plain").end("Ok")
//        }).listen(8080,context.asyncAssertSuccess({
//            var client = WebClient.create(vertx)
//            client.get(8080,"localhost","/").send({
//                if(it.succeeded()){
//                    var temp = it.result()
//                    context.assertTrue(temp.headers().contains("Content-Type"))
//                    context.assertEquals("text/plain", temp.getHeader("Content-Type"))
//                    context.assertEquals("Ok", temp.body().toString())
//
//                    asyn.complete()
//                }else{
//                    asyn.resolve(Future.failedFuture(it.cause()))
//                }
//            })
//        }))
//    }
//
//}
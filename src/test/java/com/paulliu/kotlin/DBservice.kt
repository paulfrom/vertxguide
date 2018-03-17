//package com.paulliu.kotlin
//
//import com.paulliu.kotlin.dataService.DataServiceVertxEBProxy
//import com.paulliu.kotlin.dataService.rxjava.DataService
//import io.vertx.core.Vertx
//import io.vertx.core.json.JsonObject
//import io.vertx.ext.unit.TestContext
//import io.vertx.ext.unit.junit.VertxUnitRunner
//import org.junit.After
//import org.junit.Before
//import org.junit.Test
//import org.junit.runner.RunWith
//
///**
// * usage:
// * <p>
// * </p>
// * User:liusonglin; Date:2017/12/19;ProjectName:vertxguide;
// */
//@RunWith(VertxUnitRunner::class)
//class DBserviceTest{
//
//    private var vertx: Vertx? = null
//
//    private var service: DataService? = null
//
//    @Before
//    fun setUp(context: TestContext) {
//        vertx = Vertx.vertx()
//        vertx!!.deployVerticle("com.paulliu.kotlin.dataService.DataService",context.asyncAssertSuccess({
//            service = DataService(DataServiceVertxEBProxy(vertx, que));
//        }))
//    }
//
//    @After
//    fun finish(context: TestContext){
//        vertx!!.close(context.asyncAssertSuccess())
//    }
//
//    @Test
//    fun dataTest(context: TestContext){
//        val async = context.async()
//        service!!.getDemo(JsonObject().put("name","name"),{
//            if(it.succeeded()){
//                println("in")
//                it.result().forEach({ println("111111=======${it}")})
//            }else{
//                println(it.cause().message)
//            }
//            async.complete()
//        })
//        async.awaitSuccess(5000)
//    }
//}
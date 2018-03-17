package com.paulliu.kotlin.discovery

import io.vertx.rxjava.core.AbstractVerticle
import io.vertx.rxjava.ext.web.client.WebClient
import io.vertx.rxjava.ext.web.codec.BodyCodec
import io.vertx.rxjava.servicediscovery.ServiceDiscovery
import io.vertx.rxjava.servicediscovery.types.HttpEndpoint
import io.vertx.servicediscovery.ServiceDiscoveryOptions
import scala.concurrent.Await.result
import io.vertx.groovy.ext.web.client.HttpResponse_GroovyExtension.body







/**
 * usage:
 * <p>
 * </p>
 * User:liusonglin; Date:2018/1/4;ProjectName:vertxguide;
 */
class Discovery:AbstractVerticle(){


    override fun start() {

        var client = WebClient.create(vertx);

        var result =client
                .get(8080,"localhost","/")
                .`as`(BodyCodec.jsonObject())
                .rxSend()
                .subscribe(
                        {
                            println("$it ;asdfasd'f") },
                {
                    println("$it 222222222")
                }
                )



            println(result)
    }
}
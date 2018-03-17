package com.paulliu.kotlin

import io.vertx.core.DeploymentOptions
import io.vertx.core.Future
import io.vertx.rxjava.core.AbstractVerticle

/**
 * usage:
 * <p>
 * </p>
 * User:liusonglin; Date:2017/12/1;ProjectName:vertxguide;
 */
class MainService : AbstractVerticle() {
    override fun start(startFuture: Future<Void>) {

        var dbVerticleDeployement = vertx.rxDeployVerticle("com.paulliu.kotlin.DBservice")

        dbVerticleDeployement
                .flatMap {
                    var httpService = vertx.rxDeployVerticle("com.paulliu.kotlin.HttpService"
                            , DeploymentOptions().setInstances(1))
                    return@flatMap httpService
                }.subscribe({ println("success");startFuture.complete() }, { println("fail");startFuture.fail(it) })
    }
}
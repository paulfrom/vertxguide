package com.paulliu.kotlin.dataService;

import io.vertx.codegen.annotations.Fluent;
import io.vertx.codegen.annotations.ProxyGen;
import io.vertx.codegen.annotations.VertxGen;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.json.JsonObject;

import java.util.List;


/**
 * usage:
 * <p>
 * </p>
 * User:liusonglin; Date:2017/12/18;ProjectName:vertxguide;
 */
@ProxyGen
@VertxGen
public interface DataService {

    @Fluent
    DataService getDemo(JsonObject demo, Handler<AsyncResult<List<JsonObject>>> resultHandler);
}

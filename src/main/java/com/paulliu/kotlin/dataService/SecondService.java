package com.paulliu.kotlin.dataService;

import io.vertx.codegen.annotations.Fluent;
import io.vertx.codegen.annotations.ProxyGen;
import io.vertx.codegen.annotations.VertxGen;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.json.JsonArray;

/**
 * usage:
 * <p>
 * </p>
 * User:liusonglin; Date:2017/12/22;ProjectName:vertxguide;
 */
@ProxyGen
@VertxGen
public interface SecondService {
    @Fluent
    SecondService insertOther(JsonArray para, Handler<AsyncResult<Boolean>> resultHandle);
}

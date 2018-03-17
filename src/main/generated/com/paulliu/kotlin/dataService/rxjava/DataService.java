/*
 * Copyright 2014 Red Hat, Inc.
 *
 * Red Hat licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package com.paulliu.kotlin.dataService.rxjava;

import java.util.Map;
import rx.Observable;
import rx.Single;
import java.util.List;
import io.vertx.core.json.JsonObject;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

/**
 * usage:
 * <p>
 * </p>
 * User:liusonglin; Date:2017/12/18;ProjectName:vertxguide;
 *
 * <p/>
 * NOTE: This class has been automatically generated from the {@link com.paulliu.kotlin.dataService.DataService original} non RX-ified interface using Vert.x codegen.
 */

@io.vertx.lang.rxjava.RxGen(com.paulliu.kotlin.dataService.DataService.class)
public class DataService {

  @Override
  public String toString() {
    return delegate.toString();
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DataService that = (DataService) o;
    return delegate.equals(that.delegate);
  }
  
  @Override
  public int hashCode() {
    return delegate.hashCode();
  }

  public static final io.vertx.lang.rxjava.TypeArg<DataService> __TYPE_ARG = new io.vertx.lang.rxjava.TypeArg<>(
    obj -> new DataService((com.paulliu.kotlin.dataService.DataService) obj),
    DataService::getDelegate
  );

  private final com.paulliu.kotlin.dataService.DataService delegate;
  
  public DataService(com.paulliu.kotlin.dataService.DataService delegate) {
    this.delegate = delegate;
  }

  public com.paulliu.kotlin.dataService.DataService getDelegate() {
    return delegate;
  }

  public DataService getDemo(JsonObject demo, Handler<AsyncResult<List<JsonObject>>> resultHandler) { 
    delegate.getDemo(demo, resultHandler);
    return this;
  }

  public Single<List<JsonObject>> rxGetDemo(JsonObject demo) { 
    return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
      getDemo(demo, fut);
    }));
  }


  public static  DataService newInstance(com.paulliu.kotlin.dataService.DataService arg) {
    return arg != null ? new DataService(arg) : null;
  }
}

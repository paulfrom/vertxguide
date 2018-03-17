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

package com.paulliu.kotlin.dataService.reactivex;

import java.util.Map;
import io.reactivex.Observable;
import io.reactivex.Flowable;
import io.reactivex.Single;
import io.reactivex.Completable;
import io.reactivex.Maybe;
import io.vertx.core.json.JsonArray;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

/**
 * usage:
 * <p>
 * </p>
 * User:liusonglin; Date:2017/12/22;ProjectName:vertxguide;
 *
 * <p/>
 * NOTE: This class has been automatically generated from the {@link com.paulliu.kotlin.dataService.SecondService original} non RX-ified interface using Vert.x codegen.
 */

@io.vertx.lang.reactivex.RxGen(com.paulliu.kotlin.dataService.SecondService.class)
public class SecondService {

  @Override
  public String toString() {
    return delegate.toString();
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SecondService that = (SecondService) o;
    return delegate.equals(that.delegate);
  }
  
  @Override
  public int hashCode() {
    return delegate.hashCode();
  }

  public static final io.vertx.lang.reactivex.TypeArg<SecondService> __TYPE_ARG = new io.vertx.lang.reactivex.TypeArg<>(
    obj -> new SecondService((com.paulliu.kotlin.dataService.SecondService) obj),
    SecondService::getDelegate
  );

  private final com.paulliu.kotlin.dataService.SecondService delegate;
  
  public SecondService(com.paulliu.kotlin.dataService.SecondService delegate) {
    this.delegate = delegate;
  }

  public com.paulliu.kotlin.dataService.SecondService getDelegate() {
    return delegate;
  }

  public SecondService insertOther(JsonArray para, Handler<AsyncResult<Boolean>> resultHandle) { 
    delegate.insertOther(para, resultHandle);
    return this;
  }

  public Single<Boolean> rxInsertOther(JsonArray para) { 
    return new io.vertx.reactivex.core.impl.AsyncResultSingle<Boolean>(handler -> {
      insertOther(para, handler);
    });
  }


  public static  SecondService newInstance(com.paulliu.kotlin.dataService.SecondService arg) {
    return arg != null ? new SecondService(arg) : null;
  }
}

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

package com.jteam.exhibition.rxjava;

import java.util.Map;
import rx.Observable;
import rx.Single;
import com.jteam.exhibition.Register;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

/**
 * A service interface managing user accounts.
 * <p>
 * This service is an event bus service (aka. service proxy).
 * </p>
 *
 * <p/>
 * NOTE: This class has been automatically generated from the {@link com.jteam.exhibition.RegisterService original} non RX-ified interface using Vert.x codegen.
 */

@io.vertx.lang.rxjava.RxGen(com.jteam.exhibition.RegisterService.class)
public class RegisterService {

  public static final io.vertx.lang.rxjava.TypeArg<RegisterService> __TYPE_ARG = new io.vertx.lang.rxjava.TypeArg<>(
    obj -> new RegisterService((com.jteam.exhibition.RegisterService) obj),
    RegisterService::getDelegate
  );

  private final com.jteam.exhibition.RegisterService delegate;
  
  public RegisterService(com.jteam.exhibition.RegisterService delegate) {
    this.delegate = delegate;
  }

  public com.jteam.exhibition.RegisterService getDelegate() {
    return delegate;
  }

  /**
   * Initialize the persistence.
   * 初始化注册表
   * @param resultHandler the result handler will be called as soon as the initialization has been accomplished. The async result indicates whether the operation was successful or not.
   * @return 
   */
  public RegisterService initializePersistence(Handler<AsyncResult<Void>> resultHandler) { 
    delegate.initializePersistence(resultHandler);
    return this;
  }

  /**
   * Initialize the persistence.
   * 初始化注册表
   * @return 
   */
  public Single<Void> rxInitializePersistence() { 
    return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
      initializePersistence(fut);
    }));
  }

  /**
   * Add a account to the persistence.
   * 添加一个用户
   * @param register 
   * @param resultHandler the result handler will be called as soon as the account has been added. The async result indicates whether the operation was successful or not.
   * @return 
   */
  public RegisterService addRegister(Register register, Handler<AsyncResult<Void>> resultHandler) { 
    delegate.addRegister(register, resultHandler);
    return this;
  }

  /**
   * Add a account to the persistence.
   * 添加一个用户
   * @param register 
   * @return 
   */
  public Single<Void> rxAddRegister(Register register) { 
    return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
      addRegister(register, fut);
    }));
  }

  /**
   * Retrieve the user account with certain `id`.
   * 根据手机号码获取报名数据
   * @param phone 
   * @param resultHandler the result handler will be called as soon as the user has been retrieved. The async result indicates whether the operation was successful or not.
   * @return 
   */
  public RegisterService retrieveByPhone(String phone, Handler<AsyncResult<Register>> resultHandler) { 
    delegate.retrieveByPhone(phone, resultHandler);
    return this;
  }

  /**
   * Retrieve the user account with certain `id`.
   * 根据手机号码获取报名数据
   * @param phone 
   * @return 
   */
  public Single<Register> rxRetrieveByPhone(String phone) { 
    return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
      retrieveByPhone(phone, fut);
    }));
  }


  public static RegisterService newInstance(com.jteam.exhibition.RegisterService arg) {
    return arg != null ? new RegisterService(arg) : null;
  }
}

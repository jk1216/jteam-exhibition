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

public class RegisterService {

  final com.jteam.exhibition.RegisterService delegate;

  public RegisterService(com.jteam.exhibition.RegisterService delegate) {
    this.delegate = delegate;
  }

  public Object getDelegate() {
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
  public Observable<Void> initializePersistenceObservable() { 
    io.vertx.rx.java.ObservableFuture<Void> resultHandler = io.vertx.rx.java.RxHelper.observableFuture();
    initializePersistence(resultHandler.toHandler());
    return resultHandler;
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
  public Observable<Void> addRegisterObservable(Register register) { 
    io.vertx.rx.java.ObservableFuture<Void> resultHandler = io.vertx.rx.java.RxHelper.observableFuture();
    addRegister(register, resultHandler.toHandler());
    return resultHandler;
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
  public Observable<Register> retrieveByPhoneObservable(String phone) { 
    io.vertx.rx.java.ObservableFuture<Register> resultHandler = io.vertx.rx.java.RxHelper.observableFuture();
    retrieveByPhone(phone, resultHandler.toHandler());
    return resultHandler;
  }


  public static RegisterService newInstance(com.jteam.exhibition.RegisterService arg) {
    return arg != null ? new RegisterService(arg) : null;
  }
}

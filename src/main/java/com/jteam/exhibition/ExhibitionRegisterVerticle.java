package com.jteam.exhibition;

import com.jteam.exhibition.api.RestExhibitionRegisterAPIVerticle;
import com.jteam.exhibition.imp.JdbcRegisterServiceImpl;
import com.jteam.vertx.common.BaseMicroserviceVerticle;

import static com.jteam.exhibition.RegisterService.SERVICE_ADDRESS;
import static com.jteam.exhibition.RegisterService.SERVICE_NAME;

import io.vertx.core.DeploymentOptions;
import io.vertx.core.Future;
import io.vertx.serviceproxy.ProxyHelper;

/**
 * A verticle publishing the user service.
 *
 * @author Eric Zhao
 */
public class ExhibitionRegisterVerticle extends BaseMicroserviceVerticle {

  private RegisterService registerService;

  @Override
  public void start(Future<Void> future) throws Exception {
    super.start();

    // create the service instance
    registerService = new JdbcRegisterServiceImpl(vertx, config());
    registerService.initializePersistence(resultHandler->{
	    if(resultHandler.succeeded())
	    {
	    		System.out.println("数据库初始化成功");
	    }
    	
    });
    // register the service proxy on event bus
    ProxyHelper.registerService(RegisterService.class, vertx, registerService, SERVICE_ADDRESS);
    // publish the service and REST endpoint in the discovery infrastructure
    publishEventBusService(SERVICE_NAME, SERVICE_ADDRESS, RegisterService.class)
      .compose(servicePublished -> deployRestVerticle())
      .setHandler(future.completer());
  }

  private Future<Void> deployRestVerticle() {
    Future<String> future = Future.future();
    vertx.deployVerticle(new RestExhibitionRegisterAPIVerticle(registerService),
      new DeploymentOptions().setConfig(config()),
      future.completer());
    return future.map(r -> null);
  }
}

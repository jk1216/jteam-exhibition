package com.jteam.exhibition;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import io.vertx.core.DeploymentOptions;
import io.vertx.core.Vertx;
import io.vertx.core.json.JsonObject;

public class MainVerticle {

	public static void main(String[] args) throws IOException
	{
		Vertx vertx=Vertx.vertx();
		DeploymentOptions options = new DeploymentOptions();
		JsonObject config=null;
		String jsonStr= FileUtils.readFileToString(new File("src/config/local.json"));
		config=new JsonObject(jsonStr);		
		vertx.deployVerticle(ExhibitionRegisterVerticle.class.getName(), options.setConfig(config));	
	}	
}

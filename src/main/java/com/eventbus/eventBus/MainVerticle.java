package com.eventbus.eventBus;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Vertx;

public class MainVerticle extends AbstractVerticle {

public static void main(String[] args ){

// configureLogging();

  Vertx vertx = Vertx.vertx();
  vertx.deployVerticle(new EchoServiceVerticle());
  vertx.deployVerticle(new WebVerticle());



}


}

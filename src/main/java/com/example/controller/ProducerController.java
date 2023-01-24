package com.example.controller;

import com.example.jms.producer.MyProducer;
import com.example.message.MyMessage;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Consumes;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.annotation.Produces;

@Controller("/producer")
public class ProducerController {

  private final MyProducer producer;

  public ProducerController(MyProducer producer) {
    this.producer = producer;
  }

  @Get
  @Produces(MediaType.APPLICATION_JSON)
  public String saiHello() {
    return """
      {
        "id": 1,
        "name": "Joao"
      }
    """;
  }

  @Post
  @Consumes(MediaType.APPLICATION_JSON)
  @Produces(MediaType.APPLICATION_JSON)
  public MyMessage saiHello(@Body MyMessage request) {
    producer.send(request);
    return request;
  }
}

package com.example.jms.camel;

import io.micronaut.context.annotation.Bean;
import org.apache.camel.Expression;
import org.apache.camel.builder.ExpressionBuilder;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.spi.IdempotentRepository;
import org.apache.camel.support.processor.idempotent.MemoryIdempotentRepository;

@Bean
public class CustomRouteBuilder extends RouteBuilder {

  public void configure() throws Exception {
    final Expression expression = ExpressionBuilder.bodyExpression();
    final IdempotentRepository repository = new MemoryIdempotentRepository();

    from("activemq:queue:my-queue").routeId("receive-route")
      .idempotentConsumer(expression, repository)
      .log("Received a message - ${body} - sending to outbound queue")
      .to("activemq:queue:PROCESSED?exchangePattern=InOnly");
  }
}

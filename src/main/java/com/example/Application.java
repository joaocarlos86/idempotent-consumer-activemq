package com.example;

import com.example.jms.camel.CustomRouteBuilder;
import io.micronaut.runtime.Micronaut;
import org.apache.camel.main.Main;

public class Application {

    public static void main(String[] args) throws Exception {
        Micronaut.build(args)
          .eagerInitSingletons(true)
          .mainClass(Application.class)
          .start();

        final Main main = new Main();
        main.configure().addRoutesBuilder(new CustomRouteBuilder());
        main.run(args);
    }
}
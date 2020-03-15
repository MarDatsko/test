package com.example.junit.unit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class UnitApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(UnitApplication.class, args);
            run.getBean(Discriminant.class).menu();
    }
}

package com.mvp.kafka.consumer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Consumer;

@Configuration
public class MVPKafkaConsumer {

    @Bean
    public Consumer<String> consumer () {

        return input -> System.out.println(input);

    };
}

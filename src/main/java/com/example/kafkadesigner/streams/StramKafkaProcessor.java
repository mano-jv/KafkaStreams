package com.example.kafkadesigner.streams;

import java.util.function.Function;

import org.apache.kafka.streams.kstream.KStream;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StramKafkaProcessor {

  @Bean
  public Function<KStream<String, RandomObject>, KStream<String, RandomObject>> streamFunctionProcessor() {

    return kstream -> kstream.filter((key, randomObject) -> {
      System.out.println("MSG INCOMING");
      return randomObject.getAccountId().equalsIgnoreCase("123");
    });
  }
}

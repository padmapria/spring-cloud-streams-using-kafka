package com.priya.cloudstreamconsumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

@SpringBootApplication
@EnableBinding(Sink.class)
public class CloudStreamConsumerApplication {

    Logger logger = LoggerFactory.getLogger(CloudStreamConsumerApplication.class);

    @StreamListener("input")
    public void consume(Book book){
        logger.info("Book consumed");
    }

    public static void main(String[] args) {
        SpringApplication.run(CloudStreamConsumerApplication.class, args);
    }



}

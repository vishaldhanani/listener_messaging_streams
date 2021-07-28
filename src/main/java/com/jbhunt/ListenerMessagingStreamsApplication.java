package com.jbhunt;

import org.apache.kafka.streams.kstream.KStream;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ListenerMessagingStreamsApplication {

    public static void main(String[] args) {
        SpringApplication.run(ListenerMessagingStreamsApplication.class, args);
    }


}

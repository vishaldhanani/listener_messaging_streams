package com.jbhunt.consumer;

import com.jbhunt.messaging.proto.Timer;
import io.confluent.kafka.serializers.AbstractKafkaSchemaSerDeConfig;
import io.confluent.kafka.streams.serdes.protobuf.KafkaProtobufSerde;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.streams.kstream.KStream;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

@Component
@Slf4j
public class ProcessStream {

    private String schemaRegistryUrl = "http://localhost:8081";

    @Bean
    public KafkaProtobufSerde<Timer> newTimerSerde() {
        final KafkaProtobufSerde<Timer> serde = new KafkaProtobufSerde<>(Timer.class);
        final Map<String, String> config = new HashMap<>();
        config.put(AbstractKafkaSchemaSerDeConfig.SCHEMA_REGISTRY_URL_CONFIG,this.schemaRegistryUrl);
        serde.configure(config, false);
        return serde;
    }

    @Bean
    public Consumer<KStream<String, Timer>> process() {
        return (InputStream) -> {
            InputStream.foreach((k, v) -> log.info(String.format("key: %s, value: %s", k, v)));
        };
    }
}

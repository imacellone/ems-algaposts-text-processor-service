package com.algaworks.algaposts.text.processor.integration.messaging.config;

import org.springframework.amqp.core.ExchangeBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.support.converter.JacksonJsonMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {
    private static final String FANOUT_NAME_POSTS_PROCESSED = "posts.processed.v1.e";

    @Bean
    FanoutExchange postsProcessedFanoutExchange() {
        return ExchangeBuilder.fanoutExchange(FANOUT_NAME_POSTS_PROCESSED)
                .durable(true)
                .build();
    }

    @Bean
    JacksonJsonMessageConverter jacksonJsonMessageConverter() {
        return new JacksonJsonMessageConverter();
    }
}

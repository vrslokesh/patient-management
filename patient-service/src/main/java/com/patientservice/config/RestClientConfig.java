package com.patientservice.config;

import com.patientservice.interceptor.HttpExchangeLoggingInterceptor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;

@Configuration
public class RestClientConfig {
    @Bean
    public RestClient restClient(@Value("${brevo.api-key}") String apiKey,
                                 @Value("${brevo.api-url}") String apiUrl) {
        return RestClient.builder()
                .baseUrl(apiUrl)
                .defaultHeader("Accept", "application/json")
                .defaultHeader("Content-Type","application/json")
                .defaultHeader("api-key", apiKey)
                .requestInterceptor(new HttpExchangeLoggingInterceptor())
                .build();
    }
}

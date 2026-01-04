package com.patientservice.config;

import com.patientservice.constant.BrevoConstant;
import com.patientservice.mapper.BrevoProperties;
import com.patientservice.service.EmailServiceClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.support.RestClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

@Configuration
public class EmailServiceClientConfig {
    @Bean
    public EmailServiceClient emailServiceClient(RestClient restClient, BrevoProperties brevoProperties) {
        restClient = restClient.mutate()
                .defaultHeader(BrevoConstant.API_KEY, brevoProperties.getApiKey())
                .build();
        HttpServiceProxyFactory factory =
                HttpServiceProxyFactory.builderFor(RestClientAdapter.create(restClient)).build();

        return factory.createClient(EmailServiceClient.class);
    }
}

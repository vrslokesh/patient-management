package com.patientservice.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class HttpExchangeLoggingInterceptor implements ClientHttpRequestInterceptor {

    private static final Logger log =
            LoggerFactory.getLogger(HttpExchangeLoggingInterceptor.class);

    @Override
    public ClientHttpResponse intercept(
            HttpRequest request,
            byte[] body,
            ClientHttpRequestExecution execution) throws IOException {

        long startTime = System.currentTimeMillis();

        // ---- LOG REQUEST ----
        log.info("➡️ POST Exchange Request");
        log.info("Method : {}", request.getMethod());
        log.info("URL    : {}", request.getURI());
        log.info("Headers: {}", request.getHeaders());
        log.info("Body   : {}", new String(body, StandardCharsets.UTF_8));

        ClientHttpResponse response = execution.execute(request, body);

        // ---- LOG RESPONSE ----
        log.info("⬅️ POST Exchange Response");
        log.info("Status : {}", response.getStatusCode());
        log.info("Headers: {}", response.getHeaders());
        log.info("Body   : {}", new String(response.getBody().readAllBytes(), StandardCharsets.UTF_8));
        log.info("Time   : {} ms", System.currentTimeMillis() - startTime);

        return response;
    }
}

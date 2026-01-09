package com.patientservice.mapper;

import lombok.Data;
import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "brevo")
@Data
@Getter
public class BrevoProperties {
    private String apiKey;
    private String apiUrl;
}

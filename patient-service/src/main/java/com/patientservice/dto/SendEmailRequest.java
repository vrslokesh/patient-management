package com.patientservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
public class SendEmailRequest {
    private Contact sender;
    private List<Contact> to;
    private String subject;
    private String htmlContent;

    @Data
    @Builder
    @AllArgsConstructor
    public static class Contact {
        private String name;
        private String email;
    }
}

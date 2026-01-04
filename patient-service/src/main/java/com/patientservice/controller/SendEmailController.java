package com.patientservice.controller;

import com.patientservice.dto.SendEmailRequest;
import com.patientservice.dto.SendEmailResponse;
import com.patientservice.service.EmailServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/sendEmail")
public class SendEmailController {
    private final EmailServiceClient emailServiceClient;

    @Autowired
    public SendEmailController(EmailServiceClient emailServiceClient) {
        this.emailServiceClient = emailServiceClient;
    }

    @PostMapping()
    public ResponseEntity<SendEmailResponse> sendEmail(@RequestBody SendEmailRequest sendEmailRequest) {
        SendEmailResponse sendEmailResponse = emailServiceClient
                .sendEmail( sendEmailRequest);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(sendEmailResponse);
    }
}

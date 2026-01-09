package com.patientservice.service;

import com.patientservice.dto.SendEmailRequest;
import com.patientservice.dto.SendEmailResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.service.annotation.PostExchange;

@Service

public interface EmailServiceClient {

    @PostExchange("/smtp/email")
    public SendEmailResponse sendEmail(@RequestBody SendEmailRequest body);
}

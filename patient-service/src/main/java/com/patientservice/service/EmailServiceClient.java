package com.patientservice.service;

import com.patientservice.dto.SendEmailRequest;
import com.patientservice.dto.SendEmailResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.service.annotation.HttpExchange;
import org.springframework.web.service.annotation.PostExchange;

@Service
@HttpExchange(url = "https://api.brevo.com", headers = {
        "accept=application/json",
        "content-type=application/json"
})
public interface EmailServiceClient {
    @PostExchange("/v3/smtp/email")
    public SendEmailResponse sendEmail( @RequestBody SendEmailRequest body);
}

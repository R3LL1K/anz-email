package com.airnz.email.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.airnz.email.dto.Email;
import com.airnz.email.service.InboxService;

@RestController
@RequestMapping("/v1/email")
public class EmailController {

    @Autowired
    private final InboxService inboxService;

    public EmailController(InboxService inboxService) {
        this.inboxService = inboxService;
    }
    
    @GetMapping("/")
    public List<Email> retrieveAllInboxEmail() {
        return inboxService.retrieveAllInboxEmails();
    }

}

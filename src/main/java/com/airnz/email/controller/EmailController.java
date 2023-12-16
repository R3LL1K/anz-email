package com.airnz.email.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.airnz.email.dto.InboxEmails;
import com.airnz.email.service.InboxService;

@RestController
@RequestMapping("/v1/email")
public class EmailController {

    @Autowired
    private final InboxService inboxService;

    public EmailController(InboxService inboxService) {
        this.inboxService = inboxService;
    }
    
    @GetMapping(path = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<InboxEmails> retrieveAllInboxEmail() {
        return inboxService.retrieveAllInboxEmails();
    }

    @PostMapping(path = "/", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public InboxEmails writeAndSaveEmail(InboxEmails email) {
        return email;
    }

}

package com.airnz.email.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.airnz.email.dto.InboxEmails;
import com.airnz.email.dto.OutboxEmails;
import com.airnz.email.service.InboxService;
import com.airnz.email.service.OutboxService;

import lombok.extern.log4j.Log4j2;

@RestController
@RequestMapping("/v1/email")
@Log4j2
public class EmailController {

    @Autowired
    private final InboxService inboxService;

    @Autowired
    private final OutboxService outboxService;

    public EmailController(InboxService inboxService, OutboxService outboxService) {
        this.inboxService = inboxService;
        this.outboxService = outboxService;
    }
    
    @GetMapping(path = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<InboxEmails> retrieveAllInboxEmail() {
        return inboxService.retrieveAllInboxEmails();
    }

    @PostMapping(path = "/", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public OutboxEmails writeAndSaveEmail(@RequestBody OutboxEmails email) {
        log.info("write and save email : % ", email);
        outboxService.saveEmail(email);
        return email;
    }

}

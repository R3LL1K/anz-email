package com.airnz.email.service.impl;

import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airnz.email.dao.OutboxEmailDao;
import com.airnz.email.dto.OutboxEmails;
import com.airnz.email.service.OutboxService;

@Service("OutboxService")
public class OutboxServiceImpl implements OutboxService {

    @Autowired
    private final OutboxEmailDao outboxEmailDao;

    public OutboxServiceImpl(OutboxEmailDao outboxEmailDao) {
        this.outboxEmailDao = outboxEmailDao;
    }

    @Override
    public OutboxEmails saveEmail(OutboxEmails email) {

        /*check if the email id is set, if it is, than update the the outbox email, otherwise insert */ 
        if (email.getId() != null && !email.getId().isEmpty()) {
            Optional<OutboxEmails> savedMail = outboxEmailDao.findById(email.getId());

            if (savedMail.isEmpty()) {
                email.setId(UUID.randomUUID().toString());
            } else {
                email.setId(savedMail.get().getId());
            }
        } else {
            email.setId(UUID.randomUUID().toString());
        }
        outboxEmailDao.save(email);
        return email;
    }
    
}

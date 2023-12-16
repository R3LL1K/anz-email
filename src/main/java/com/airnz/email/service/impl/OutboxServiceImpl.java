package com.airnz.email.service.impl;

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
        email.setId(UUID.randomUUID().toString());
        outboxEmailDao.save(email);
        return email;
    }
    
}

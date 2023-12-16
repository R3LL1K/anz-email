package com.airnz.email.dao.stubs;

import org.springframework.stereotype.Service;

import com.airnz.config.EmailsDB;
import com.airnz.email.dao.OutboxEmailDao;
import com.airnz.email.dto.OutboxEmails;

@Service
public class OutboxEmailDaoUsingStub implements OutboxEmailDao {

    @Override
    public void save(OutboxEmails email) {

        EmailsDB.OUTBOX().add(email);
    }
    
}

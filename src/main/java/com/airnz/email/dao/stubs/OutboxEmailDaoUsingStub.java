package com.airnz.email.dao.stubs;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.airnz.config.EmailsDB;
import com.airnz.email.dao.OutboxEmailDao;
import com.airnz.email.dto.OutboxEmails;

@Service
public class OutboxEmailDaoUsingStub implements OutboxEmailDao {

    @Override
    public void save(OutboxEmails email) {

        EmailsDB.OUTBOX().put(email.getId(), email);
    }

    @Override
    public Optional<OutboxEmails> findById(String emailId) {
        return EmailsDB.OUTBOX().keySet().contains(emailId) 
            ? Optional.ofNullable(EmailsDB.OUTBOX().get(emailId)) 
            : Optional.empty();
    }
    
}

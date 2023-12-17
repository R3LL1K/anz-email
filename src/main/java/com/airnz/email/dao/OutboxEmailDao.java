package com.airnz.email.dao;

import java.util.Optional;

import com.airnz.email.dto.OutboxEmails;

public interface OutboxEmailDao {
    
    void save(OutboxEmails email);

    Optional<OutboxEmails> findById(String emailId);
}

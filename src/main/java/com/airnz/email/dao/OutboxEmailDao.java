package com.airnz.email.dao;

import com.airnz.email.dto.OutboxEmails;

public interface OutboxEmailDao {
    
    void save(OutboxEmails email);
}

package com.airnz.email.service;

import com.airnz.email.dto.OutboxEmails;

public interface OutboxService {
    
    OutboxEmails saveEmail(OutboxEmails email);

    // void sendEmail()
}

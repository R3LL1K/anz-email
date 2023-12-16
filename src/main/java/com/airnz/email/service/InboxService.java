package com.airnz.email.service;

import java.util.List;

import com.airnz.email.dto.Email;

public interface InboxService {
    
    List<Email> retrieveAllInboxEmails();
}

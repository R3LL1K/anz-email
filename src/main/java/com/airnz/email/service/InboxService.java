package com.airnz.email.service;

import java.util.List;

import com.airnz.email.dto.InboxEmails;

public interface InboxService {
    
    List<InboxEmails> retrieveAllInboxEmails();
}

package com.airnz.email.dao;

import java.util.List;

import com.airnz.email.dto.InboxEmails;

public interface InboxDao {
    
    List<InboxEmails> retrieveAllInboxEmail();
}

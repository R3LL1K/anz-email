package com.airnz.email.dao;

import java.util.List;

import com.airnz.email.dto.Email;

public interface InboxDao {
    
    List<Email> retrieveAllInboxEmail();
}

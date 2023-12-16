package com.airnz.email.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airnz.email.dao.InboxDao;
import com.airnz.email.dto.Email;
import com.airnz.email.service.InboxService;

@Service("InboxService")
public class InboxServiceImpl implements InboxService {

    @Autowired
    private final InboxDao inboxDao;

    public InboxServiceImpl(InboxDao inboxDao) {
        this.inboxDao = inboxDao;
    }

    @Override
    public List<Email> retrieveAllInboxEmails() {
        return inboxDao.retrieveAllInboxEmail();
    }
    
}

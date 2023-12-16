package com.airnz.email.dao.stubs;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;

import com.airnz.email.dao.InboxDao;
import com.airnz.email.dto.Email;

@Service
public class InboxDaoUsingStub implements InboxDao {

    @Override
    public List<Email> retrieveAllInboxEmail() {

        return Stream.of(Email.builder()
                .id(UUID.randomUUID().toString())
                .timestamp(LocalDateTime.now())
                .sender("test@airnz.com")
                .subject("Flight Tickets")
                .content("This is an email confirming your flight tickets")
                .starred(true)
                .build()).toList();   
    }
    
}

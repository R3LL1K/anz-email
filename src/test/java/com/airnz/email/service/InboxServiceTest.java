package com.airnz.email.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.UUID;
import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;

import com.airnz.email.dao.InboxDao;
import com.airnz.email.dto.InboxEmails;
import com.airnz.email.service.impl.InboxServiceImpl;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
public class InboxServiceTest {

    private String inboxEmailId = UUID.randomUUID().toString();

    @Autowired
    private InboxService inboxService;

    @MockBean
    private InboxDao inboxDao;

    @TestConfiguration
    static class InboxServiceImplTestConfiguration {
        private InboxDao inboxDao;

        @Bean
        public InboxService inboxService() {
            return new InboxServiceImpl(inboxDao);
        }
    }

    @BeforeEach
    public void setUp() {
        List<InboxEmails> inbox = Stream.of(InboxEmails.builder()
            .id(inboxEmailId)
            .content("content")
            .sender("sender@test.com")
            .subject("mocktest").build()).toList();

        Mockito.when(inboxDao.retrieveAllInboxEmail()).thenReturn(inbox);
    }

    @Test
    public void whenValidUser_retrieveInboxEmails() {
        List<InboxEmails> inbox = inboxService.retrieveAllInboxEmails();

        assertEquals(inbox.get(0).getId(), inboxEmailId);
    }

}

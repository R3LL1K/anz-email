package com.airnz.email.dto;

import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Builder
@Data
@ToString
public class InboxEmails {
    
    String id;
    LocalDateTime timestamp;
    String sender;
    String subject;
    String content;
    boolean starred;
    String label;
}

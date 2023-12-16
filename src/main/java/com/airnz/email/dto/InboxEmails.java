package com.airnz.email.dto;

import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;
import lombok.Builder.Default;

@Builder
@Data
@ToString
public class InboxEmails {
    
    String id;
    LocalDateTime timestamp;
    String sender;
    String subject;
    String content;
    @Default
    boolean starred = false;
    String label;
}

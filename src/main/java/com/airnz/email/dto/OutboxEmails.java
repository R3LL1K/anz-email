package com.airnz.email.dto;

import java.time.LocalDateTime;
import java.util.List;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;
import lombok.Builder.Default;

@Builder
@Data
@ToString
public class OutboxEmails {
    
    private String id;
    private LocalDateTime timestamp;
    private List<String> recipients;
    private String subject;
    private String content;

    @Default
    private boolean starred = false;
    private String label;

}

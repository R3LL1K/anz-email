package com.airnz.email.dto;

import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@Data
@ToString
public class Email {
    
    String id;
    LocalDateTime timestamp;
    String sender;
    String subject;
    String content;
    boolean starred;
    String label;
}

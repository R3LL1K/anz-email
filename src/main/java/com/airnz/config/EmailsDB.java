package com.airnz.config;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.context.annotation.ApplicationScope;

import com.airnz.email.dto.InboxEmails;

@ApplicationScope
public class EmailsDB {
    
    public static Map<String, List<InboxEmails>> EMAILS = new HashMap<>();


}

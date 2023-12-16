package com.airnz.config;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.context.annotation.ApplicationScope;

import com.airnz.email.dto.InboxEmails;
import com.airnz.email.dto.OutboxEmails;

import lombok.extern.log4j.Log4j2;

@ApplicationScope
@Log4j2
public class EmailsDB {
    
    private static Map<String, List<InboxEmails>> INBOXEMAILS = new HashMap<>();

    private static List<OutboxEmails> outBoxList = new ArrayList<>();


    public static List<OutboxEmails> OUTBOX() {
        log.info("Outbox list size: {}", outBoxList.size());
        return outBoxList;
    }

}

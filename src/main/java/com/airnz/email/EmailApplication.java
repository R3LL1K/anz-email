package com.airnz.email;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.log4j.Log4j2;

@SpringBootApplication( exclude = { SecurityAutoConfiguration.class})
@RestController
@Log4j2
public class EmailApplication {

    @GetMapping("/healthcheck")
    public String helloWorld() {
        log.info("healthcheck");
        return "healthcheck";
    }

	public static void main(String[] args) {
		SpringApplication.run(EmailApplication.class, args);
	}

}

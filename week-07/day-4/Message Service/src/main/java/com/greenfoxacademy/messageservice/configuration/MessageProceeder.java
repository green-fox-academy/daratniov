package com.greenfoxacademy.messageservice.configuration;


import com.greenfoxacademy.messageservice.service.MessageService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class MessageProceeder {
  public void processMessage(String message, String emailAddress) {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MessageConfiguration.class);
    MessageService messageService = (MessageService) context.getBean("twitter");
    messageService.sendMessage(message, emailAddress);
  }
}

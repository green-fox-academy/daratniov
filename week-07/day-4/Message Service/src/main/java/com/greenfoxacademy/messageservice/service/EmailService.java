package com.greenfoxacademy.messageservice.service;

import org.springframework.stereotype.Service;

@Service
public class EmailService implements MessageService {
  @Override
  public void sendMessage(String message, String email) {
    System.out.println("Email sent to " + email + " with Message=" + message);
  }
}

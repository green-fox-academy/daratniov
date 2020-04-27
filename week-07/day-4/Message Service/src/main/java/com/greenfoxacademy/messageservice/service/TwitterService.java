package com.greenfoxacademy.messageservice.service;

import org.springframework.stereotype.Service;

@Service
public class TwitterService implements MessageService {
  @Override
  public void sendMessage(String message, String email) {
    System.out.println("Twitter message sent to " + email + " with Message=" + message);
  }
}

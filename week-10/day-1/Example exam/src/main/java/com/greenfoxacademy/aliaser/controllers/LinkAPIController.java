package com.greenfoxacademy.aliaser.controllers;

import com.greenfoxacademy.aliaser.dtos.SecretDTO;
import com.greenfoxacademy.aliaser.models.Link;
import com.greenfoxacademy.aliaser.services.LinkService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LinkAPIController {

  private LinkService service;

  @Autowired
  public LinkAPIController(LinkService service) {
    this.service = service;
  }

  @GetMapping(path = "/api/links")
  public List<Link> getAllLinks() {
    return service.getAllLinks();
  }

  @DeleteMapping(path = "/api/links/{id}")
  public ResponseEntity<?> deleteLinkByID(@PathVariable long id, @RequestBody SecretDTO secret) {
    HttpStatus status;
    if (service.findByID(id) == null) {
      status = HttpStatus.NOT_FOUND;
    } else if (!service.findByID(id).getSecretCode().matches(secret.getSecretCode())) {
      status = HttpStatus.FORBIDDEN;
    } else {
      service.deleteLinkByID(id);
      status = HttpStatus.NO_CONTENT;
    }
    return ResponseEntity.status(status).build();
  }
}

package com.greenfoxacademy.aliaser.services;

import com.greenfoxacademy.aliaser.models.Link;

import java.util.List;


public interface LinkService {

  boolean hasAlias(String alias);

  void saveLink(Link link);


  void generateSecretCode(Link link);

  Link findByAlias(String alias);

  void incrementHitCountAndSave(Link link);

  List<Link> getAllLinks();

  void deleteLinkByID(long id);

  Link findByID(long id);
}

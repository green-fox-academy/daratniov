package com.greenfoxacademy.aliaser.services;

import com.greenfoxacademy.aliaser.models.Link;
import com.greenfoxacademy.aliaser.repositories.LinkRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LinkServiceImpl implements LinkService {
  private LinkRepository repository;

  @Autowired
  public LinkServiceImpl(LinkRepository repository) {
    this.repository = repository;
  }

  @Override
  public boolean hasAlias(String alias) {
    return repository.findByAlias(alias).isPresent();
  }

  @Override
  public void saveLink(Link link) {
    repository.save(link);
  }

  @Override
  public void generateSecretCode(Link link) {
    do {
      link.generateSecretCode();
    } while (repository.existsBySecretCode(link.getSecretCode()));
  }

  @Override
  public Link findByAlias(String alias) {
    return repository.findByAlias(alias).orElse(null);
  }

  @Override
  public void incrementHitCountAndSave(Link link) {
    link.setHitCount(link.getHitCount() + 1);
    saveLink(link);
  }

  @Override
  public List<Link> getAllLinks() {
    return (List<Link>) repository.findAll();
  }

  @Override
  public void deleteLinkByID(long id) {
    repository.deleteById(id);
  }

  @Override
  public Link findByID(long id) {
    return repository.findById(id).orElse(null);
  }
}

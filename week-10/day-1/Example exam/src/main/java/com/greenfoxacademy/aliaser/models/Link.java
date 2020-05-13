package com.greenfoxacademy.aliaser.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Random;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Link {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private String url;
  private String alias;
  private int hitCount;
  @JsonIgnore
  private String secretCode;

  public Link() {
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public String getAlias() {
    return alias;
  }

  public void setAlias(String alias) {
    this.alias = alias;
  }

  public int getHitCount() {
    return hitCount;
  }

  public void setHitCount(int hitCount) {
    this.hitCount = hitCount;
  }

  public String getSecretCode() {
    return secretCode;
  }

  public void setSecretCode(String secretCode) {
    this.secretCode = secretCode;
  }

  public void generateSecretCode() {
    String code = "";
    Random random = new Random();
    for (int i = 0; i < 4; i++) {
      code += random.nextInt(10);
    }
    secretCode = code;
  }
}

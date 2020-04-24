package com.greenfoxacademy.bankofsimba.models;

public class BankAccount {
  private String name;
  private int balance;
  private String animalType;
  private boolean isKing;
  private String badOrGood;

  public BankAccount() {
  }

  public BankAccount(String name, int balance, String animalType, boolean isKing, String badOrGood) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    this.isKing = isKing;
    this.badOrGood = badOrGood;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getBalance() {
    return balance;
  }

  public void setBalance(int balance) {
    this.balance = balance;
  }

  public String getAnimalType() {
    return animalType;
  }

  public void setAnimalType(String animalType) {
    this.animalType = animalType;
  }

  public boolean isKing() {
    return isKing;
  }

  public void setKing(boolean king) {
    isKing = king;
  }

  public String getBadOrGood() {
    return badOrGood;
  }

  public void setBadOrGood(String badOrGood) {
    this.badOrGood = badOrGood;
  }
}


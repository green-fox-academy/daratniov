package com.greenfoxacademy.dependencyinjection.greenfoxclassapp.services;

import java.util.List;

public interface StudentService {
  List<String> findAll();

  void save(String student);

  int count();
}

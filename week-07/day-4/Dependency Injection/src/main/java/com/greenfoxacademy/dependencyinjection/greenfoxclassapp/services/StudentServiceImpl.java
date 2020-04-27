package com.greenfoxacademy.dependencyinjection.greenfoxclassapp.services;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
  private List<String> names;

  public StudentServiceImpl() {
    names = new ArrayList<>();
    names.add("Sanyi");
    names.add("Lilla");
    names.add("John");
  }

  @Override
  public List<String> findAll() {
    return names;
  }

  @Override
  public void save(String student) {
    names.add(student);
  }

  @Override
  public int count() {
    return names.size();
  }
}

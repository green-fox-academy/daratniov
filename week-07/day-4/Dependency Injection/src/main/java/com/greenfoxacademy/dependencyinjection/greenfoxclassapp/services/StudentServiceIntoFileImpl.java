package com.greenfoxacademy.dependencyinjection.greenfoxclassapp.services;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class StudentServiceIntoFileImpl implements StudentService {
  private List<String> names;

  public StudentServiceIntoFileImpl() {
    try {
      this.names = Files.readAllLines(Paths.get("names.txt"));
    } catch (IOException e) {
      System.out.println("Could not read the file!");
      System.exit(0);
    }
  }

  @Override
  public List<String> findAll() {
    return names;
  }

  @Override
  public void save(String student) {
    names.add(student);
    try {
      Files.write(Paths.get("names.txt"), names);
    } catch (IOException e) {
      System.out.println("Could not write the file!");
      System.exit(0);
    }
  }

  @Override
  public int count() {
    return names.size();
  }
}

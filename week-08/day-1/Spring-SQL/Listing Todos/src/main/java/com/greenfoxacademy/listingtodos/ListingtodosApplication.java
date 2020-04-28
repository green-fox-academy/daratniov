package com.greenfoxacademy.listingtodos;

import com.greenfoxacademy.listingtodos.models.Todo;
import com.greenfoxacademy.listingtodos.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ListingtodosApplication implements CommandLineRunner {

  private TodoRepository repository;

  @Autowired
  public ListingtodosApplication(TodoRepository repository) {
    this.repository = repository;
  }

  public static void main(String[] args) {
    SpringApplication.run(ListingtodosApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    repository.save(new Todo("I have to learn Object Relational Mapping"));
    repository.save(new Todo("Something to do"));
    repository.save(new Todo("Something other to do"));
    repository.save(new Todo("Something another to do"));
  }
}

package com.greenfoxacademy.connectingwithmysql;

import com.greenfoxacademy.connectingwithmysql.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConnectingwithmysqlApplication implements CommandLineRunner {

  private TodoRepository repository;

  @Autowired
  public ConnectingwithmysqlApplication(TodoRepository repository) {
    this.repository = repository;
  }

  public static void main(String[] args) {
    SpringApplication.run(ConnectingwithmysqlApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
//    repository.save(new Todo("I have to learn Object Relational Mapping"));
//    repository.save(new Todo("Something to do",true,false));
//    repository.save(new Todo("Something other to do",true,true));
//    repository.save(new Todo("Something another to do",false,true));
  }
}

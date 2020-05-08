package com.greenfoxacademy.connectingwithmysql;

import com.greenfoxacademy.connectingwithmysql.models.Assignee;
import com.greenfoxacademy.connectingwithmysql.models.Todo;
import com.greenfoxacademy.connectingwithmysql.repositories.AssigneeRepository;
import com.greenfoxacademy.connectingwithmysql.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConnectingwithmysqlApplication implements CommandLineRunner {

  private TodoRepository todoRepository;
  private AssigneeRepository assigneeRepository;

  @Autowired
  public ConnectingwithmysqlApplication(TodoRepository todoRepository,AssigneeRepository assigneeRepository) {
    this.todoRepository = todoRepository;
    this.assigneeRepository=assigneeRepository;
  }

  public static void main(String[] args) {
    SpringApplication.run(ConnectingwithmysqlApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    todoRepository.save(new Todo("I have to learn Object Relational Mapping","personal","hard",false,true));
    todoRepository.save(new Todo("Something to do","personal","easy", true, false));
    todoRepository.save(new Todo("Something other to do","personal","easy", true, true));
    todoRepository.save(new Todo("Something another to do","personal","easy", false, true));
    assigneeRepository.save(new Assignee("Pisti", "pisti@gmail.com"));
    assigneeRepository.save(new Assignee("Jani", "jani@freemail.hu"));
    assigneeRepository.save(new Assignee("Sanyi", "sanyi@citrommail.hu"));
  }
}

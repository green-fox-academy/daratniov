package com.greenfoxacademy.connectingwithmysql.services;

import com.greenfoxacademy.connectingwithmysql.models.Todo;
import com.greenfoxacademy.connectingwithmysql.repositories.TodoRepository;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.joda.time.DateTimeComparator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {

  private TodoRepository repository;

  @Autowired
  public TodoService(TodoRepository repository) {
    this.repository = repository;
  }

  public Iterable<Todo> getAll() {
    return repository.findAll();
  }

  public List<Todo> getActives(boolean isActive) {
    List<Todo> listOfTodos = (List<Todo>) repository.findAll();
    if (isActive) {
      return listOfTodos.stream().filter(t -> !t.isDone()).collect(Collectors.toList());
    } else {
      return listOfTodos.stream().filter(Todo::isDone).collect(Collectors.toList());
    }
  }

  public void addNewTodo(Todo todo) {
    repository.save(todo);
  }

  public void deleteTodo(long id) {
    repository.deleteById(id);
  }

  public Todo getTodo(long id) {
    Optional<Todo> todo = repository.findById(id);
    return todo.orElse(null);
  }

  public void updateTodo(Todo todo) {
    repository.findById(todo.getId())
        .ifPresent(value -> todo.setDateOfCreation(value.getDateOfCreation()));
    repository.save(todo);
  }

  public List<Todo> search(String search, String button) {
    switch (button) {
      case "title":
        return repository.findAllByTitleContains(search);
      case "content":
        return repository.findAllByContentContains(search);
      case "description":
        return repository.findAllByDescriptionContains(search);
      default:
        return repository
            .findAllByTitleContainingOrContentContainingOrDescriptionContaining(search, search, search);
    }
  }

  public List<Todo> searchByDate(String date, String button, String when) {
    DateTimeComparator dateTimeComparator = DateTimeComparator.getDateOnlyInstance();
    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
    List<Todo> todos = (List<Todo>) repository.findAll();
    try {
      Date convertedDate = formatter.parse(date);
      if (button.equalsIgnoreCase("date-of-creation")) {
        if (when.equalsIgnoreCase("before")) {
          todos=todos.stream().filter(t->dateTimeComparator
              .compare(convertedDate,t.getDateOfCreation())>0).collect(Collectors.toList());
        } else if (when.equalsIgnoreCase("on-that-day")) {
          todos=todos.stream().filter(t->dateTimeComparator
              .compare(convertedDate,t.getDateOfCreation())==0).collect(Collectors.toList());
        } else {
          todos=todos.stream().filter(t->dateTimeComparator
              .compare(convertedDate,t.getDateOfCreation())<0).collect(Collectors.toList());
        }
      } else {
        todos=todos.stream().filter(t->t.getDueDate()!=null).collect(Collectors.toList());
        if (when.equalsIgnoreCase("before")) {
          todos=todos.stream().filter(t->dateTimeComparator
              .compare(convertedDate,t.getDueDate())>0).collect(Collectors.toList());
        } else if (when.equalsIgnoreCase("on-that-day")) {
          todos=todos.stream().filter(t->dateTimeComparator
              .compare(convertedDate,t.getDueDate())==0).collect(Collectors.toList());
        } else {
          todos=todos.stream().filter(t->dateTimeComparator
              .compare(convertedDate,t.getDueDate())<0).collect(Collectors.toList());
        }
      }
    } catch (ParseException e) {
      System.out.println("Could not convert string to date!");
    }
    return todos;
  }
}
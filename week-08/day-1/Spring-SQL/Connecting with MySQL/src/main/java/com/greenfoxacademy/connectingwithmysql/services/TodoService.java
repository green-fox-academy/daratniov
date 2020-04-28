package com.greenfoxacademy.connectingwithmysql.services;

import com.greenfoxacademy.connectingwithmysql.models.Todo;
import com.greenfoxacademy.connectingwithmysql.repositories.TodoRepository;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
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
}
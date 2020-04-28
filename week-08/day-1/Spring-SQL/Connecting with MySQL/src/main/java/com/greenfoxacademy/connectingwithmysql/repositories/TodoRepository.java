package com.greenfoxacademy.connectingwithmysql.repositories;

import com.greenfoxacademy.connectingwithmysql.models.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {
}

package com.greenfoxacademy.connectingwithmysql.repositories;

import com.greenfoxacademy.connectingwithmysql.models.Todo;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {

  List<Todo> findAllByTitleContains(String search);
  List<Todo> findAllByContentContains(String search);
  List<Todo> findAllByDescriptionContains(String search);
  List<Todo> findAllByDateOfCreationContaining(String search);
  List<Todo> findAllByDueDateContaining(String search);
  List<Todo> findAllByTitleContainingOrContentContainingOrDescriptionContaining(String string1,String string2,String string3);
}

package com.greenfoxacademy.connectingwithmysql.repositories;

import com.greenfoxacademy.connectingwithmysql.models.Assignee;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssigneeRepository extends CrudRepository<Assignee,Long> {
}

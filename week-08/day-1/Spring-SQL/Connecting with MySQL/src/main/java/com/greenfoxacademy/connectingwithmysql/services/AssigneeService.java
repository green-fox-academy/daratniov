package com.greenfoxacademy.connectingwithmysql.services;

import com.greenfoxacademy.connectingwithmysql.models.Assignee;
import com.greenfoxacademy.connectingwithmysql.models.Todo;
import com.greenfoxacademy.connectingwithmysql.repositories.AssigneeRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AssigneeService{
  private AssigneeRepository assigneeRepository;

  @Autowired
  public AssigneeService(AssigneeRepository assigneeRepository) {
    this.assigneeRepository = assigneeRepository;
  }

  public List<Assignee> listAllAssignees(){
    return (List<Assignee>)assigneeRepository.findAll();
  }

  public void addNewAssignee(Assignee assignee) {
    assigneeRepository.save(assignee);
  }

  public void deleteAssignee(long id){
    assigneeRepository.deleteById(id);
  }

  public Assignee getAssignee(long id) {
    Optional<Assignee> assignee = assigneeRepository.findById(id);
    return assignee.orElse(null);
  }

  public void updateAssignee(Assignee assignee) {
    assigneeRepository.save(assignee);
  }
}

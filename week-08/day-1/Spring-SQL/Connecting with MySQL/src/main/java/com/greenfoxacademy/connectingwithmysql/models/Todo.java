package com.greenfoxacademy.connectingwithmysql.models;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.format.annotation.DateTimeFormat;


@Entity
@Table(name = "todos")
public class Todo {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private String title;
  private String content="not defined";
  private String description="not defined";
  private boolean isUrgent = false;
  private boolean isDone = false;
  @Temporal(value = TemporalType.TIMESTAMP)
  private Date dateOfCreation;
  @DateTimeFormat(pattern="yyyy-MM-dd")
  private Date dueDate;

  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn
  private Assignee assignee;

  public Todo() {
    this.dateOfCreation=new Date();
  }

  public Todo(String title, String content, String description, boolean isUrgent, boolean isDone) {
    this.title = title;
    this.content = content;
    this.description = description;
    this.isUrgent = isUrgent;
    this.isDone = isDone;
    this.dateOfCreation=new Date();
    this.dueDate=new Date();
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public boolean isUrgent() {
    return isUrgent;
  }

  public void setUrgent(boolean urgent) {
    isUrgent = urgent;
  }

  public boolean isDone() {
    return isDone;
  }

  public void setDone(boolean done) {
    isDone = done;
  }

  public Date getDateOfCreation() {
    return dateOfCreation;
  }

  public void setDateOfCreation(Date dateOfCreation) {
    this.dateOfCreation = dateOfCreation;
  }

  public Date getDueDate() {
    return dueDate;
  }

  public void setDueDate(Date dueDate) {
    this.dueDate = dueDate;
  }

  public Assignee getAssignee() {
    return assignee;
  }

  public void setAssignee(Assignee assignee) {
    this.assignee = assignee;
  }
}

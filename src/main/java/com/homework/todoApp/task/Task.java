package com.homework.todoApp.task;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Task {

  @Id
  @GeneratedValue
  private Long id;
  private String content;
  private Boolean completed = false;
  
  
  public Task() {
  }

  public Task(Long id, String content) {
    this.id = id;
    this.content = content;
  }
  
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }
  public String getContent() {
    return content;
  }
  public void setContent(String content) {
    this.content = content;
  }
  public void setCompleted(Boolean completed) {
    this.completed = completed;
  }
  public Boolean getCompleted() {
    return completed;
  }

}

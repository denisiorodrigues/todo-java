package br.com.dentech.todojava.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "todos")
public class Todo {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @NotBlank
  private String name;
  @NotBlank
  private String description;
  private boolean done;
  private int priority;

  public Todo(String name, String description, boolean done, int priority) {
    this.name = name;
    this.description = description;
    this.done = done;
    this.priority = priority;
  }
  
  public Long getId() {
    return id;
  }
  public String getName() {
    return name;
  }
  public String getDescription() {
    return description;
  }
  public boolean isDone() {
    return done;
  }
  public int getPriority() {
    return priority;
  }
}

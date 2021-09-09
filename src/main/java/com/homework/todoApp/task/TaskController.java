package com.homework.todoApp.task;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class TaskController {

  @Autowired
  private TaskService taskService;
  
  // GET
  @GetMapping("/api/tasks")
  public List<Task> getAllTasks() {
    return taskService.getAllTasks();
  }

  // GET BY ID
  @GetMapping("/api/tasks/{id}")
  public Task getTask(@PathVariable Long id)  {
    return taskService.getTask(id);
  }

  // POST
  @PostMapping("/api/tasks")
  public void createTask(@RequestBody Task task) {
    taskService.createTask(task);
  }

  // PUT
  @PutMapping("/api/tasks/{id}")
  public void updateTask(@PathVariable Long id, @RequestBody Task task) {
    taskService.updateTask(id, task);
  }

  // DELETE
  @DeleteMapping("/api/tasks/{id}")
  public void deleteTask(@PathVariable Long id) {
    taskService.deleteTask(id);
  }

//  DELETE ALL
  @DeleteMapping("/api/tasks")
  public void deleteAllTasks() {
    taskService.deleteAllTasks();
  }

}

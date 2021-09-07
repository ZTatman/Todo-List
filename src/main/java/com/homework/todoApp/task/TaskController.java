package com.homework.todoApp.task;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {

  @Autowired
  private TaskService taskService;
  
  // GET
  @RequestMapping("/tasks")
  public List<Task> getAllTasks() {
    return taskService.getAllTasks();
  }

  // GET BY ID
  @RequestMapping("/tasks/{id}")
  public Task getTask(@PathVariable Long id)  {
    return taskService.getTask(id);
  }

  // POST
  @RequestMapping(method = RequestMethod.POST, value = "/tasks")
  public void createTask(@RequestBody Task task) {
    taskService.createTask(task);
  }

  // PUT
  @RequestMapping(method = RequestMethod.PUT, value = "/tasks/{id}")
  public void updateTask(@PathVariable Long id, @RequestBody Task task) {
    taskService.updateTask(id, task);
  }

  // DELETE
  @RequestMapping(method = RequestMethod.DELETE, value = "/tasks/{id}")
  public void deleteTask(@PathVariable Long id) {
    taskService.deleteTask(id);
  }
}

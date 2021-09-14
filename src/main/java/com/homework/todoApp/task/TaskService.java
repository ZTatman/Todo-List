package com.homework.todoApp.task;

import com.homework.todoApp.exception.NoResourceFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskService {

  @Autowired
  private TaskRepository taskRepository;

  // Get all tasks
  public List<Task> getAllTasks() {
    List<Task> tasks = new ArrayList<>();
    taskRepository.findAll().forEach(tasks::add);
    return tasks;
  }

  // Get one task
  public Task getTask(Long id) {
    return taskRepository.findById(id).orElseThrow(() -> new NoResourceFoundException("Task " + id + " does not exist."));
  }

  // Create a task
  public void createTask(Task task) {
    taskRepository.save(task);
  }

  // Update a task
  public void updateTask(Long id, Task newTask) {
    Task task = taskRepository.findById(id).orElseThrow(() -> new NoResourceFoundException("Task " + id + " does not exist."));
    task.setContent(newTask.getContent());
    task.setCompleted(newTask.getCompleted());
    taskRepository.save(task);
  }

  // Delete a task
  public void deleteTask(Long id) {
    Task task = taskRepository.findById(id).orElseThrow(() -> new NoResourceFoundException("Task " + id + " does not exist."));
    taskRepository.delete(task);
  }

//  Delete all tasks
  public void deleteAllTasks() {
    taskRepository.deleteAll();
  }
}

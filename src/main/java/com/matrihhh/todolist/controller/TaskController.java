package com.matrihhh.todolist.controller;


import com.matrihhh.todolist.model.Task;

import com.matrihhh.todolist.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/entities")
public class TaskController {

    private final TaskService taskService;

    @Autowired
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping(path = "/get")
    public List<Task> getTasks() {
        return taskService.getTasks();
    }

    @GetMapping("/get/{id}")
    public Task getTask(@PathVariable int id) {
        return taskService.getTask(id);
    }

    @PostMapping(path = "/add")
    public Task createTask(@RequestBody Task task) {
        return taskService.createTask(task);
    }

    @PutMapping("/edit/{id}")
    public Task updateTask(@PathVariable int id, @RequestBody Task entity) {
        return taskService.updateTask(id, entity);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteTask(@PathVariable int id) {
        taskService.deleteTask(id);
    }
}

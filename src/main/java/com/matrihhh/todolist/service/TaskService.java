package com.matrihhh.todolist.service;

import com.matrihhh.todolist.model.Task;

import java.util.List;
import java.util.Optional;

public interface TaskService {
    Task createTask(Task task);
    Task getTask(int id);
    Task updateTask(int id, Task task);
    void deleteTask(int id);
    List<Task> getTasks();
}

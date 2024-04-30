package com.matrihhh.todolist.service.impl;

import com.matrihhh.todolist.model.Task;
import com.matrihhh.todolist.repository.TaskRespository;
import com.matrihhh.todolist.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Repository
public class TaskServiceImpl implements TaskService {
    private final TaskRespository taskRespository;

    @Autowired
    public TaskServiceImpl(TaskRespository taskRespository) {
        this.taskRespository = taskRespository;
    }

    @Transactional
    @Override
    public Task createTask(Task task) {
        return taskRespository.save(task);
    }

    @Override
    public Task getTask(int id) {
        return taskRespository.getById(id);
    }

    @Override
    public Task updateTask(int id, Task task) {
        if(taskRespository.existsById(id)){
            task.setId(id);
            return taskRespository.save(task);
        }

        return null;
    }

    @Override
    public void deleteTask(int id) {
        taskRespository.deleteById(id);
    }


    @Override
    public List<Task> getTasks() {
        List lista = (List) taskRespository.findAll();

        return lista;
    }
}

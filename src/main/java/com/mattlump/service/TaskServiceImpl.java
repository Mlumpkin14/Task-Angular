package com.mattlump.service;




import com.mattlump.model.Task;
import com.mattlump.repository.TaskRepository;

import javax.persistence.Entity;


public class TaskServiceImpl implements TaskService{

    private TaskRepository taskRepository;

    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Iterable<Task> list() {
        return this.taskRepository.findAll();
    }
}

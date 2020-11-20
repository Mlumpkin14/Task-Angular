package com.mattlump.service;




import com.mattlump.model.Task;
import com.mattlump.repository.TaskRepository;
import org.springframework.stereotype.Service;

import javax.persistence.Entity;

@Service
public class TaskServiceImpl implements TaskService{

    private TaskRepository taskRepository;

    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Iterable<Task> list() {
        return this.taskRepository.findAll();
    }

    @Override
    public Task save(Task task) {
        return this.taskRepository.save(task);
    }
}

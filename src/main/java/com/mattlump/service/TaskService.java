package com.mattlump.service;

import com.mattlump.model.Task;
import org.springframework.stereotype.Service;


public interface TaskService {

    Iterable<Task> list();

    Task save(Task task);
}

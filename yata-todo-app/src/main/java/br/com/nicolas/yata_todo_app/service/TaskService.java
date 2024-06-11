package br.com.nicolas.yata_todo_app.service;

import br.com.nicolas.yata_todo_app.model.Task;
import br.com.nicolas.yata_todo_app.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    @Autowired
    private TaskRepository repository;

    public List<Task> getAllTasks() {
        return repository.findAll();
    }
}

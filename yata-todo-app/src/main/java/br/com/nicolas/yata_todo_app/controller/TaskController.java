package br.com.nicolas.yata_todo_app.controller;

import br.com.nicolas.yata_todo_app.model.Task;
import br.com.nicolas.yata_todo_app.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("tasks")
public class TaskController {
    @Autowired
    private TaskService service;

    @GetMapping
    public List<Task> getAllTasks() {
        List<Task> taskList = service.getAllTasks();
        return taskList;
    }
}

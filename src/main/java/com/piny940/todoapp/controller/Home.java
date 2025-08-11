package com.piny940.todoapp.controller;

import org.springframework.web.bind.annotation.RestController;
import com.piny940.todoapp.config.Application;
import com.piny940.todoapp.entity.Todo;
import com.piny940.todoapp.repository.TodoRepo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class Home {
    private final TodoRepo todoRepo;
    private final Application app;

    public Home(TodoRepo todoRepo, Application app) {
        this.todoRepo = todoRepo;
        this.app = app;
    }

    @GetMapping(name="/", produces="text/plain")
    public String index() { 
        return "Welcome to the " + app.getName() + "!\n" +
               app.getDescription() + "\n" +
               "Visit /todos to see your todo items." + app.getHoge();
    }

    @GetMapping("/todos")
    public Iterable<Todo> getTodos() {
        return todoRepo.findAll();
    }

    @GetMapping("/todos/{id}")
    public Todo getTodoById(@PathVariable Long id) {
        return todoRepo.findById(id).orElse(null);
    }

    @PostMapping("/todos")
    public Todo createTodo(@RequestBody Todo todo) {
        return todoRepo.save(todo);
    }
}

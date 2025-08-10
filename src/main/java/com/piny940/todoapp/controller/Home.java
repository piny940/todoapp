package com.piny940.todoapp.controller;

import org.springframework.web.bind.annotation.RestController;
import com.piny940.todoapp.entity.Todo;
import com.piny940.todoapp.repository.TodoRepo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class Home {
    private final TodoRepo todoRepo;

    public Home(TodoRepo todoRepo) {
        this.todoRepo = todoRepo;
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

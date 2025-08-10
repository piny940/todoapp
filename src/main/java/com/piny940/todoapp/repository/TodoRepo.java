package com.piny940.todoapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.piny940.todoapp.entity.Todo;

public interface TodoRepo extends CrudRepository<Todo, Long> {}

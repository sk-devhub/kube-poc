package com.kube.poc.webstack.controllers;

import com.kube.poc.webstack.models.ToDo;
import com.kube.poc.webstack.services.ToDoService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/todo")
public class ToDoController {

    private final ToDoService toDoService;

    ToDoController(ToDoService toDoService) {
        this.toDoService = toDoService;
    }

    @PostMapping
    public ToDo create(@RequestBody ToDo toDo) {
        return this.toDoService.create(toDo);
    }

    @GetMapping
    public Iterable<ToDo> list() {
        return this.toDoService.list();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        this.toDoService.delete(id);
    }
}

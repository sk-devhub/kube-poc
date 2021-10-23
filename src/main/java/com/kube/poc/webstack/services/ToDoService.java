package com.kube.poc.webstack.services;

import com.kube.poc.webstack.models.ToDo;
import com.kube.poc.webstack.repos.ToDoRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ToDoService {

    private final ToDoRepo toDoRepo;

    @Autowired
    ToDoService(ToDoRepo toDoRepo) {
        this.toDoRepo = toDoRepo;
    }

    public ToDo create(ToDo rDo) {
        return toDoRepo.save(rDo);
    }

    public Iterable<ToDo> list() {
        return this.toDoRepo.findAll();
    }

    public void delete(Long id) {
        this.toDoRepo.deleteById(id);
    }
}

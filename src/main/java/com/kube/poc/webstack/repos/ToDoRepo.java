package com.kube.poc.webstack.repos;

import com.kube.poc.webstack.models.ToDo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDoRepo extends CrudRepository<ToDo, Long> {
}

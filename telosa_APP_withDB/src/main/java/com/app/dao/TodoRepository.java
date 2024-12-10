package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.entities.Todo;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long>{

}

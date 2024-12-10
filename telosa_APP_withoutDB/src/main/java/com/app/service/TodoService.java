package com.app.service;

import org.springframework.stereotype.Service;

import com.app.entities.Todo;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {
    private final List<Todo> todos = new ArrayList<>();
    private int nextId = 1;

    public List<Todo> getAllTodos() {
        return todos;
    }

    public void addTodo(String task) {
        todos.add(new Todo(nextId++, task, false));
    }

    public void updateTodoStatus(int id, boolean completed) {
        todos.stream()
            .filter(todo -> todo.getId() == id)
            .findFirst()
            .ifPresent(todo -> todo.setCompleted(completed));
    }

    public void deleteTodoById(int id) {
        todos.removeIf(todo -> todo.getId() == id);
    }
}

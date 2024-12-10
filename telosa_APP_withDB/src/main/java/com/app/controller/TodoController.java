package com.app.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.app.service.TodoService;

@Controller
public class TodoController {

    @Autowired
    private TodoService todoService;

    @GetMapping("/")
    public String homePage(Model model) {
        model.addAttribute("todos", todoService.getAllTodos());
        return "index";
    }

    @PostMapping("/add")
    public String addTodo(@RequestParam("task") String task) {
        todoService.addTodo(task);
        return "redirect:/";
    }

    @PostMapping("/update")
    public String updateTodo(@RequestParam("id") Long id, @RequestParam("completed") boolean completed) {
        todoService.updateTodoCompletion(id, completed);
        return "redirect:/";
    }

    @PostMapping("/delete")
    public String deleteTodo(@RequestParam("id") Long id) {
        todoService.deleteTodoById(id);
        return "redirect:/";
    }
}

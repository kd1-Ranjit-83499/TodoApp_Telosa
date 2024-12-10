package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.app.service.TodoService;

@Controller
@RequestMapping("/")
public class TodoController {

    @Autowired
    private TodoService todoService;

    @GetMapping
    public String showTodos(Model model) {
        model.addAttribute("todos", todoService.getAllTodos());
        return "index";
    }

    @PostMapping("/add")
    public String addTodo(@RequestParam("task") String task) {
        todoService.addTodo(task);
        return "redirect:/";
    }

    @PostMapping("/update")
    public String updateTodo(@RequestParam("id") int id, @RequestParam("completed") boolean completed) {
        todoService.updateTodoStatus(id, completed);
        return "redirect:/";
    }

    @PostMapping("/delete")
    public String deleteTodo(@RequestParam("id") int id) {
        todoService.deleteTodoById(id);
        return "redirect:/";
    }
}

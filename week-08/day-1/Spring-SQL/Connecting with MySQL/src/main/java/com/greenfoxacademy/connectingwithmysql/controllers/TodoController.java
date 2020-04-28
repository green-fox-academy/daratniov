package com.greenfoxacademy.connectingwithmysql.controllers;

import com.greenfoxacademy.connectingwithmysql.models.Todo;
import com.greenfoxacademy.connectingwithmysql.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/todo")
public class TodoController {

  private TodoService service;

  @Autowired
  public TodoController(TodoService service) {
    this.service = service;
  }

  @GetMapping(path = {"", "/", "/list"})
  public String list(Model model, @RequestParam(required = false) Boolean isActive) {
    if (isActive == null) {
      model.addAttribute("todos", service.getAll());
    } else {
      model.addAttribute("todos", service.getActives(isActive));
    }
    return "todolist";
  }

  @GetMapping(path = "/add")
  public String add(Model model) {
    model.addAttribute("todo", new Todo());
    return "addnewtodo";
  }

  @PostMapping(path = "/add")
  public String add(@ModelAttribute Todo todo) {
    service.addNewTodo(todo);
    return "redirect:/todo/list";
  }

  @GetMapping(path = "/{id}/delete")
  public String delete(@PathVariable long id) {
    service.deleteTodo(id);
    return "redirect:/todo/list";
  }

  @GetMapping(path = "/{id}/edit")
  public String edit(@PathVariable long id, Model model) {
    model.addAttribute("todo", service.getTodo(id));
    return "edit";
  }

  @PostMapping(path = "/{id}/edit")
  public String edit(@ModelAttribute Todo todo) {
    service.updateTodo(todo);
    return "redirect:/todo/list";
  }

  @GetMapping(path = "/details/{id}")
  public String getDetails(@PathVariable long id, Model model) {
    model.addAttribute("todo", service.getTodo(id));
    return "details";
  }
}

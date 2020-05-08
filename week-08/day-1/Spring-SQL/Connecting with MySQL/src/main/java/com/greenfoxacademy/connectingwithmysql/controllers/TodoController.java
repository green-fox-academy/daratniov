package com.greenfoxacademy.connectingwithmysql.controllers;

import com.greenfoxacademy.connectingwithmysql.models.Assignee;
import com.greenfoxacademy.connectingwithmysql.models.Todo;
import com.greenfoxacademy.connectingwithmysql.services.AssigneeService;
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

  private TodoService todoService;
  private AssigneeService assigneeService;

  @Autowired
  public TodoController(TodoService todoService, AssigneeService assigneeService) {
    this.todoService = todoService;
    this.assigneeService = assigneeService;
  }

  @GetMapping(path = {"", "/", "/list"})
  public String list(Model model, @RequestParam(required = false) Boolean isActive) {
    if (isActive == null) {
      model.addAttribute("todos", todoService.getAll());
    } else {
      model.addAttribute("todos", todoService.getActives(isActive));
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
    todoService.addNewTodo(todo);
    return "redirect:/todo/list";
  }

  @GetMapping(path = "/{id}/delete")
  public String delete(@PathVariable long id) {
    todoService.deleteTodo(id);
    return "redirect:/todo/list";
  }

  @GetMapping(path = "/{id}/edit")
  public String edit(@PathVariable long id, Model model) {
    model.addAttribute("todo", todoService.getTodo(id));
    return "edit";
  }

  @PostMapping(path = "/{id}/edit")
  public String edit(@ModelAttribute Todo todo) {
    todoService.updateTodo(todo);
    return "redirect:/todo/list";
  }

  @GetMapping(path = "/details/{id}")
  public String getDetails(@PathVariable long id, Model model) {
    model.addAttribute("todo", todoService.getTodo(id));
    return "details";
  }

  @GetMapping(path = "/search")
  public String search(Model model, String search, String button) {
    model.addAttribute("search", search);
    model.addAttribute("todos", todoService.search(search, button));
    return "todolist";
  }

  @GetMapping(path = "/search-by-date")
  public String searchByDate(Model model, String date, String button, String when) {
    model.addAttribute("date", date);
    model.addAttribute("todos", todoService.searchByDate(date, button, when));
    return "todolist";
  }

  @GetMapping(path="/list-of-assignees")
  public String listAllAssignees(Model model){
    model.addAttribute("assignees",assigneeService.listAllAssignees());
    model.addAttribute("assignee",new Assignee());
    return "assigneelist";
  }

  @GetMapping(path = "/add-assignee")
  public String addAssignee(Model model) {
    model.addAttribute("assignee",new Assignee());
    return "add-assignee";
  }

  @PostMapping(path = "/add-assignee")
  public String addAssignee(@ModelAttribute Assignee assignee) {
    assigneeService.addNewAssignee(assignee);
    return "redirect:/todo/list-of-assignees";
  }

  @GetMapping(path = "/assignee/{id}/delete")
  public String deleteAssignee(@PathVariable long id) {
    assigneeService.deleteAssignee(id);
    return "redirect:/todo/list-of-assignees";
  }

  @GetMapping(path = "/assignee/{id}/edit")
  public String editAssignee(@PathVariable long id, Model model) {
    model.addAttribute("assignee", assigneeService.getAssignee(id));
    return "edit-assignee";
  }

  @PostMapping(path = "/assignee/{id}/edit")
  public String editAssignee(@ModelAttribute Assignee assignee) {
    assigneeService.updateAssignee(assignee);
    return "redirect:/todo/list-of-assignees";
  }
}

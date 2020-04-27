package com.greenfoxacademy.dependencyinjection.greenfoxclassapp.controllers;

import com.greenfoxacademy.dependencyinjection.greenfoxclassapp.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class GreenFoxController {

  private StudentService studentService;

  @Autowired
  public GreenFoxController(StudentService studentService) {
    this.studentService = studentService;
  }

  @GetMapping(path = "/gfa")
  public String getMainPage(Model model) {
    model.addAttribute("numberOfStudents", studentService.count());
    return "home";
  }

  @GetMapping(path = "/gfa/list")
  public String listAllStudents(Model model) {
    model.addAttribute("students", studentService.findAll());
    return "students";
  }

  @GetMapping(path = "/gfa/add")
  public String addNewStudent() {
    return "addStudent";
  }

  @PostMapping(path = "/gfa/save")
  public String addNewStudent(String name) {
    studentService.save(name);
    return "redirect:/gfa/add";
  }

  @GetMapping(path = "/gfa/check")
  public String checkStudent() {
    return "checkStudent";
  }

  @PostMapping(path = "/gfa/check")
  public String checkStudent(String name, Model model) {
    if (studentService.findAll().contains(name)) {
      model.addAttribute("contain", true);
    } else {
      model.addAttribute("contain", false);
    }
    model.addAttribute("name", name);
    return "checkStudent";
  }
}

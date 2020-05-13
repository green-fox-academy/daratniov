package com.greenfoxacademy.aliaser.controllers;

import com.greenfoxacademy.aliaser.exceptions.ResourceNotFoundException;
import com.greenfoxacademy.aliaser.models.Link;
import com.greenfoxacademy.aliaser.services.LinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class LinkController {

  private LinkService service;

  @Autowired
  public LinkController(LinkService service) {
    this.service = service;
  }

  @GetMapping(path = "/")
  public String renderMainPage(Model model,
                               @RequestParam(required = false) boolean hasError,
                               @RequestParam(required = false) boolean success,
                               @ModelAttribute Link link) {
    model.addAttribute("hasError", hasError);
    model.addAttribute("success", success);
    model.addAttribute("successLink", success ? link : new Link());
    model.addAttribute("link", hasError ? link : new Link());
    return "main";
  }

  @PostMapping(path = "/save-link")
  public String saveLink(@ModelAttribute Link link, RedirectAttributes attributes) {
    attributes.addFlashAttribute(link);
    if (service.hasAlias(link.getAlias())) {
      return "redirect:/?hasError=true";
    } else {
      service.generateSecretCode(link);
      service.saveLink(link);
      return "redirect:/?success=true";
    }
  }

  @GetMapping(path = "/a/{alias}")
  public String goToLink(@PathVariable String alias) throws ResourceNotFoundException {
    Link storedLink = service.findByAlias(alias);

    if (service.hasAlias(alias)) {
      service.incrementHitCountAndSave(storedLink);
      return "redirect:" + storedLink.getUrl();
    } else {
      throw new ResourceNotFoundException();
    }
  }
}

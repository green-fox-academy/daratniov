package com.greenfoxacademy.dependencyinjection.usefulutilities.controllers;


import com.greenfoxacademy.dependencyinjection.usefulutilities.services.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/useful")
public class UtilityServiceController {

  private UtilityService utilityService;

  @Autowired
  public UtilityServiceController(UtilityService utilityService) {
    this.utilityService = utilityService;
  }

  @RequestMapping(method = RequestMethod.GET)
  public String mainPage() {
    return "index";
  }

  @RequestMapping(value = "/colored", method = RequestMethod.GET)
  public String colored(Model model) {
    model.addAttribute("randomColor", utilityService.randomColor());
    return "colored";
  }

  @RequestMapping(value = "/email", method = RequestMethod.GET)
  public String email() {
    return "email";
  }

  @RequestMapping(value = "/email", method = RequestMethod.POST)
  public String email(String email, Model model) {
    model.addAttribute("valid", utilityService.validateEmail(email));
    model.addAttribute("email", email);
    return "email";
  }

  @RequestMapping(value = "/caesar", method = RequestMethod.GET)
  public String caesar(Model model) {
    model.addAttribute("wasDecoded", true);
    return "caesar";
  }

  @RequestMapping(value = "/caesar", method = RequestMethod.POST)
  public String caesarToEncode(String caesar, String encode, Model model) {
    int number = 5;
    if (encode != null) {
      model.addAttribute("caesar", utilityService.caesar(caesar, number));
      model.addAttribute("wasEncoded", true);
    } else {
      model.addAttribute("caesar", utilityService.caesar(caesar, -number));
      model.addAttribute("wasDecoded", true);
    }
    return "caesar";
  }
}

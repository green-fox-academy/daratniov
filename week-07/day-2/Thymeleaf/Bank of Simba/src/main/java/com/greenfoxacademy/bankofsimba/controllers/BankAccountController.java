package com.greenfoxacademy.bankofsimba.controllers;

import com.greenfoxacademy.bankofsimba.models.BankAccount;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BankAccountController {
  private List<BankAccount> listOfBankAccounts = new ArrayList<>();

  public BankAccountController() {
    listOfBankAccounts.add(new BankAccount("Simba", 2000, "lion", true, "good"));
    listOfBankAccounts.add(new BankAccount("Timon", 3500, "meerkat", false, "good"));
    listOfBankAccounts.add(new BankAccount("Mufasa", 5000, "lion", true, "good"));
    listOfBankAccounts.add(new BankAccount("Rafiki", 500, "monkey", false, "good"));
    listOfBankAccounts.add(new BankAccount("Zordon", 8300, "lion", false, "bad"));
  }

  @RequestMapping(path = "/show", method = RequestMethod.GET)
  public String showOneAccount(Model model, @RequestParam(name = "name", required = false) String name) {

    List<BankAccount> queriedAccount;

    if (name == null) {
      queriedAccount = listOfBankAccounts;
    } else {
      queriedAccount = filterAccountByName(name);
    }
    model.addAttribute("accounts", queriedAccount);
    return "index";
  }

  private List<BankAccount> filterAccountByName(String name) {
    return listOfBankAccounts.stream()
        .filter(account -> account.getName().equalsIgnoreCase(name))
        .collect(Collectors.toList());
  }

  @RequestMapping(path = "/display", method = RequestMethod.GET)
  public String display(Model model) {
    String string = "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";
    model.addAttribute("string", string);
    return "display";
  }

  @RequestMapping(path = "/increase/balance", method = RequestMethod.POST)
  public String increaseBalance(String name) {
    Optional<BankAccount> account = listOfBankAccounts.stream().filter(a -> a.getName().equalsIgnoreCase(name)).findFirst();
    if (account.isPresent()) {
      int increment;
      if (account.get().isKing()) {
        increment = 100;
      } else {
        increment = 10;
      }
      account.get().setBalance(account.get().getBalance() + increment);
    }
    return "redirect:/show";
  }

  @RequestMapping(path = "/add", method = RequestMethod.POST)
  public String addNewAccount(String name, int balance, String animalType, String isKing, String badOrGood) {
    listOfBankAccounts.add(new BankAccount(name,balance,animalType,isKing.equalsIgnoreCase("true"),badOrGood));
    return "redirect:/show";
  }
}
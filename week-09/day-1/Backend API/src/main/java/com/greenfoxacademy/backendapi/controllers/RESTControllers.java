package com.greenfoxacademy.backendapi.controllers;

import com.greenfoxacademy.backendapi.models.AppendA;
import com.greenfoxacademy.backendapi.models.Array;
import com.greenfoxacademy.backendapi.models.CamelizerText;
import com.greenfoxacademy.backendapi.models.DoUntil;
import com.greenfoxacademy.backendapi.models.Doubling;
import com.greenfoxacademy.backendapi.models.Error;
import com.greenfoxacademy.backendapi.models.SithText;
import com.greenfoxacademy.backendapi.models.WelcomeMessage;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RESTControllers {

  @GetMapping("/doubling")
  public ResponseEntity<?> doubling(@RequestParam(required = false) Integer input) {
    if (input != null) {
      return ResponseEntity.ok(new Doubling(input));
    } else {
      return ResponseEntity.ok(new Error("Please provide an input!"));
    }
  }

  @GetMapping("/greeter")
  public ResponseEntity<?> greeting(@RequestParam(required = false) String name,
                                    @RequestParam(required = false) String title) {
    if (name == null && title == null) {
      return ResponseEntity.badRequest().body(new Error("Please provide a name and a title!"));
    } else if (name == null) {
      return ResponseEntity.badRequest().body(new Error("Please provide a name!"));
    } else if (title == null) {
      return ResponseEntity.badRequest().body(new Error("Please provide a title!"));
    } else {
      return ResponseEntity.ok(new WelcomeMessage(name, title));
    }
  }

  @GetMapping("/appenda/{appendable}")
  public ResponseEntity<?> append(@PathVariable String appendable) {
    return ResponseEntity.ok(new AppendA(appendable));
  }

  @PostMapping("/dountil/{action}")
  public ResponseEntity<?> doUntil(@PathVariable String action, @RequestBody DoUntil doUntil) {
    if (doUntil == null) {
      return ResponseEntity.badRequest().body(new Error("Please provide a number!"));
    }
    doUntil.setResultByAction(action);
    return ResponseEntity.ok(doUntil);
  }

  @PostMapping("/arrays")
  public ResponseEntity<?> handleArray(@RequestBody(required = false) Array array) {
    if (array == null) {
      return ResponseEntity.badRequest().body(new Error("Please provide the parameters!"));
    } else if (array.getNumbers() == null) {
      return ResponseEntity.badRequest().body(new Error("Please provide the numbers!"));
    } else if (array.getWhat() == null) {
      return ResponseEntity.badRequest()
          .body(new Error("Please provide what to do with the numbers!"));
    }
    array.setResultByInputParameters();
    return ResponseEntity.ok(array);
  }

  @PostMapping("/sith")
  public ResponseEntity<?> getSithText(@RequestBody(required = false) SithText sithText) {
    if (sithText == null || sithText.getText().isEmpty()) {
      return ResponseEntity.badRequest()
          .body(new Error("Feed me some text you have to, padawan young you are. Hmmm."));
    }
    sithText.convertToYodaSpeak();
    return ResponseEntity.ok(sithText);
  }

  @PostMapping("/translate")
  public ResponseEntity<?> camelizer(@RequestBody(required = false) CamelizerText camelizerText) {
    if (camelizerText == null || camelizerText.getLang()==null || camelizerText.getText()==null ||
    camelizerText.getText().isEmpty() || camelizerText.getLang().isEmpty()) {
      return ResponseEntity.badRequest()
          .body(new Error("I can't translate that!"));
    }
    camelizerText.camelize();
    return ResponseEntity.ok(camelizerText);
  }
}

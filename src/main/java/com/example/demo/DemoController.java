package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@RestController
public class DemoController {

  @GetMapping(path="/demo", produces = "text/html")
  public ModelAndView getDemo() {
    return new ModelAndView("demo");
  }

}

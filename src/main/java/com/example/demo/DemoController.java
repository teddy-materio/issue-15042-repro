package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@RestController
public class DemoController {

  @GetMapping(path="/demo", produces = "text/html")
  public ModelAndView getDemo() {
    if (true) {
      // To trigger the bug:
      // For unauthenticated requests, this exception must cause an HTTP 401 or 403 response
      // For authenticated requests, this can be any exception
      throw new ForbiddenException("This exception will trigger the bug");
    }
    return new ModelAndView("demo");
  }

}

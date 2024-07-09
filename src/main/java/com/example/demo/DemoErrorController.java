package com.example.demo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class DemoErrorController implements ErrorController {

  @RequestMapping(path="/error", produces = "text/html")
  public ModelAndView handleError(HttpServletRequest request) {
    return new ModelAndView("error");
  }
}

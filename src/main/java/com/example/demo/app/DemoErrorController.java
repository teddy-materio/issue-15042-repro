package com.example.demo.app;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class DemoErrorController implements ErrorController {

  @RequestMapping(path="/error", produces = "text/html")
  public ModelAndView handleError(HttpServletRequest request) {
    request.getAttribute(RequestDispatcher.ERROR_EXCEPTION_TYPE);
    request.getAttribute(RequestDispatcher.ERROR_EXCEPTION);
    request.getAttribute(RequestDispatcher.ERROR_MESSAGE);
    request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);
    return new ModelAndView("error");
  }
}
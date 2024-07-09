package com.example.demo;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


@ResponseStatus(code = HttpStatus.FORBIDDEN, reason = "Sorry, you don't have permission to see that.")
public class ForbiddenException extends RuntimeException {

  public ForbiddenException(String message) {
    super(message);
  }

}
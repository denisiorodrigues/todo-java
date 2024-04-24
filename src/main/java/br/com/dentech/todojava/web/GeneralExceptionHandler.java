package br.com.dentech.todojava.web;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

import br.com.dentech.todojava.exception.BadRequestException;

@ControllerAdvice
public class GeneralExceptionHandler {
  
  private ResponseEntity<Object> handleBadRequest(BadRequestException exception){
    return ResponseEntity.status(HttpStatus.BAD_REQUEST)
    .body(exception.getMessage());
  }
}

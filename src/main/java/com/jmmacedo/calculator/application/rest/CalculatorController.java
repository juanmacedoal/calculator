package com.jmmacedo.calculator.application.rest;

import java.util.List;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/** Calculator Controller. */
public interface CalculatorController {

  @GetMapping(path = "/{operation}/{numbers}", produces = MediaType.APPLICATION_JSON_VALUE)
  ResponseEntity<Integer> operate(
      @PathVariable String operation, @PathVariable List<Integer> numbers);
}

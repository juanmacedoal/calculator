package com.jmmacedo.calculator.application.rest;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

/** Calculator Controller. */
public interface CalculatorController {

  @GetMapping(
      path = "/operation/number/{baseNumber}/newNumber/{number}",
      produces = MediaType.APPLICATION_JSON_VALUE)
  ResponseEntity<Integer> operate(
      @RequestParam String operation,
      @PathVariable Integer baseNumber,
      @PathVariable Integer number);
}

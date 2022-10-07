package com.jmmacedo.calculator.application.rest.impl;

import com.jmmacedo.calculator.application.rest.CalculatorController;
import com.jmmacedo.calculator.domain.services.CalculatorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/** Calculator Controller Implement. */
@RequestMapping(value = "/calculator")
@RestController
public class CalculatorControllerImpl implements CalculatorController {

  private CalculatorService calculatorService;

  CalculatorControllerImpl(CalculatorService calculatorService) {
    this.calculatorService = calculatorService;
  }

  @Override
  public ResponseEntity<Integer> operate(String operation, Integer baseNumber, Integer number) {
    return new ResponseEntity<>(
        this.calculatorService.operate(operation, baseNumber, number), HttpStatus.OK);
  }
}

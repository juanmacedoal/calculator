package com.jmmacedo.calculator.domain.services;

import com.jmmacedo.calculator.application.rest.adapters.input.Operation;
import com.jmmacedo.calculator.domain.exceptions.GreaterThanZeroException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/** Calculator Service Implement. */
@Slf4j
@Service
public class CalculatorService implements Operation {

  private static final String OPERATION_SELECTED_LITERAL = "Operation selected: {}";

  /**
   * Operate method.
   *
   * @param operation Type of operation
   * @param number Numbers to operate
   * @return Result
   */
  @Override
  public int operate(String operation, Integer baseNumber, Integer number) {
    switch (operation) {
      case "+":
        log.info(OPERATION_SELECTED_LITERAL, operation);
        return sum(baseNumber, number);
      case "-":
        log.info(OPERATION_SELECTED_LITERAL, operation);
        return substract(baseNumber, number);
      case "/":
        log.info(OPERATION_SELECTED_LITERAL, operation);
        return divide(baseNumber, number);
      case "*":
        log.info(OPERATION_SELECTED_LITERAL, operation);
        return multiply(baseNumber, number);
      default:
        break;
    }
    return 0;
  }

  private int sum(Integer baseNumber, Integer number) {
    return baseNumber + number;
  }

  private int substract(Integer baseNumber, Integer number) {
    return baseNumber - number;
  }

  private int divide(Integer baseNumber, Integer number) throws GreaterThanZeroException {
    if (number == 0) throw new GreaterThanZeroException();
    return baseNumber / number;
  }

  private int multiply(Integer baseNumber, Integer number) {
    return baseNumber * number;
  }
}

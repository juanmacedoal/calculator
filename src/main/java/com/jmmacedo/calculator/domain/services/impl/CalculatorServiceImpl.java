package com.jmmacedo.calculator.domain.services.impl;

import com.jmmacedo.calculator.domain.services.CalculatorService;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/** Calculator Service Implement. */
@Slf4j
@Service
public class CalculatorServiceImpl implements CalculatorService {

  private static final String OPERATION_SELECTED_LITERAL = "Operation selected: {}";

  /**
   * Operate method.
   *
   * @param operation Type of operation
   * @param numbers Numbers to operate
   * @return Result
   */
  @Override
  public int operate(String operation, List<Integer> numbers) {
    switch (operation) {
      case "+":
        log.info(OPERATION_SELECTED_LITERAL, operation);
        return sum(numbers);
      case "-":
        log.info(OPERATION_SELECTED_LITERAL, operation);
        return substract(numbers);
      case "/":
        log.info(OPERATION_SELECTED_LITERAL, operation);
        return divide(numbers);
      case "*":
        log.info(OPERATION_SELECTED_LITERAL, operation);
        return multiply(numbers);
      default:
        break;
    }
    return 0;
  }

  private int sum(List<Integer> numbers) {
    return numbers.stream().reduce(0, Integer::sum);
  }

  private int substract(List<Integer> numbers) {
    return 0;
  }

  private int divide(List<Integer> numbers) {
    return 0;
  }

  private int multiply(List<Integer> numbers) {
    return 0;
  }
}

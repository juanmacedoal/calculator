package com.jmmacedo.calculator.domain.services;

/** Calculator Service. */
public interface CalculatorService {

  int operate(String operation, Integer baseNumber, Integer number);
}

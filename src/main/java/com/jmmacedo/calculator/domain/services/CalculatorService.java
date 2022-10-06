package com.jmmacedo.calculator.domain.services;

import java.util.List;

/** Calculator Service. */
public interface CalculatorService {

  int operate(String operation, List<Integer> numbers);
}

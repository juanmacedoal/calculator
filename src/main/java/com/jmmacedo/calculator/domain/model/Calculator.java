package com.jmmacedo.calculator.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/** Calculator class. */
@Data
@AllArgsConstructor
public class Calculator {

  private String operation;
  private String number;

  @Override
  public String toString() {
    return "Calculator{" + "operation='" + operation + '\'' + ", number='" + number + '\'' + '}';
  }
}

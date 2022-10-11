package com.jmmacedo.calculator.application.rest.adapters.input;

public interface Operation {

  int operate(String operation, Integer baseNumber, Integer number);
}

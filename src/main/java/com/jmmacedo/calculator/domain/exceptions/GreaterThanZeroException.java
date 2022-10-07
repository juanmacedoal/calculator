package com.jmmacedo.calculator.domain.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class GreaterThanZeroException extends RuntimeException {

  private static final String MSG_EXCEPTION = "Debe ser un numero mayor a 0";

  public GreaterThanZeroException() {
    super(MSG_EXCEPTION);
  }
}

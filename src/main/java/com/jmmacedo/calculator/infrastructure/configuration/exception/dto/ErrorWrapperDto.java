package com.jmmacedo.calculator.infrastructure.configuration.exception.dto;

import lombok.Data;

@Data
public class ErrorWrapperDto {

  public String errorCode;
  public String msg;
  public String statusText;
}

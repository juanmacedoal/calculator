package com.jmmacedo.calculator.infrastructure.configuration.exception;

import com.jmmacedo.calculator.domain.exceptions.GreaterThanZeroException;
import com.jmmacedo.calculator.infrastructure.configuration.exception.dto.ErrorWrapperDto;
import javax.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/** ExceptionHandler. */
@ControllerAdvice
public class ExceptionHandlerController extends ResponseEntityExceptionHandler {

  /**
   * Exception handler method.
   *
   * @param request Request
   * @param exception Exception
   * @return Mapped error.
   */
  @ExceptionHandler(GreaterThanZeroException.class)
  public ResponseEntity<ErrorWrapperDto> exceptionHandler(
      HttpServletRequest request, Exception exception) {
    ErrorWrapperDto errorWrapperDto = new ErrorWrapperDto();
    errorWrapperDto.setErrorCode(String.valueOf(HttpStatus.BAD_REQUEST.value()));
    errorWrapperDto.setMsg(exception.getMessage());
    errorWrapperDto.setStatusText("");

    return new ResponseEntity<>(errorWrapperDto, null, HttpStatus.BAD_REQUEST);
  }
}

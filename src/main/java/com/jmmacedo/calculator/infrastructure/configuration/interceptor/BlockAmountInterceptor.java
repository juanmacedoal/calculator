package com.jmmacedo.calculator.infrastructure.configuration.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

@Slf4j
@Component("blockNumber")
public class BlockAmountInterceptor implements HandlerInterceptor {

  @Override
  public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
      throws Exception {

    if (request.getRequestURL().toString().contains("01")) {
      log.error("Numero introducido incorrecto");
      response.sendError(400);
      return false;
    }

    return true;
  }
}

package com.jmmacedo.calculator.infrastructure.configuration;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

  private HandlerInterceptor handlerInterceptor;

  public MvcConfig(@Qualifier("blockNumber") HandlerInterceptor handlerInterceptor) {
    this.handlerInterceptor = handlerInterceptor;
  }

  @Override
  public void addInterceptors(InterceptorRegistry registry) {
    registry.addInterceptor(handlerInterceptor);
  }
}

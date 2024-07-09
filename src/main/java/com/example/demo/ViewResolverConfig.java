package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
public class ViewResolverConfig {

  @Bean
  public ViewResolver viewResolver() {
    InternalResourceViewResolver bean = new InternalResourceViewResolver();
    bean.setCache(true);
    bean.setPrefix("classpath:templates/");
    bean.setSuffix(".html");
    bean.setContentType("text/html; charset=UTF-8");
    return bean;
  }
}

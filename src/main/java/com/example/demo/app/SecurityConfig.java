package com.example.demo.app;


import javax.servlet.DispatcherType;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
@EnableWebSecurity
public class SecurityConfig {

  @Bean
  public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
    http
        .authorizeHttpRequests()
        .shouldFilterAllDispatcherTypes(true) // https://docs.spring.io/spring-security/reference/5.8/migration/servlet/authorization.html#_switch_to_authorizationmanager
        .dispatcherTypeMatchers(DispatcherType.FORWARD, DispatcherType.ERROR).permitAll() // https://docs.spring.io/spring-security/reference/5.8/migration/servlet/authorization.html#_permit_forward_when_using_spring_mvc
        .requestMatchers("/demo", "/error").permitAll()
        .anyRequest().authenticated();

    return http.build();
  }
}

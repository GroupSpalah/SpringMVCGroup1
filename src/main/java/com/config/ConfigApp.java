package com.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc// activation MVC pattern
@ComponentScan(basePackages = {"com.controller", "com.service", "com.handlers_exceptions"})
public class ConfigApp implements WebMvcConfigurer {
}

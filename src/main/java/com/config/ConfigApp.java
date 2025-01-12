package com.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc// activation MVC pattern
@ComponentScan(basePackages = {"com.controller", "com.service", "com.homeworks.hw_29_12_24.task2.laptop.controller",
        "com.homeworks.hw_29_12_24.task1.controller"/*"com.handlers_exceptions"*/})
public class ConfigApp implements WebMvcConfigurer {
}

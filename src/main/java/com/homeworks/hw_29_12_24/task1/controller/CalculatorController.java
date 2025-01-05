package com.homeworks.hw_29_12_24.task1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("calculator")
public class CalculatorController {

    @GetMapping("/new/{a}/{b}")
    @ResponseBody
    public String getCalculator(/*Model model*///изучить
                                               @PathVariable("a") int a,
                                               @PathVariable("b") int b,
                                               @RequestParam("operation") String operation) {
        return switch (operation) {
            case "+" -> "Result: " + (a + b);
            case "-" -> "Result: " + (a - b);
            case "*" -> "Result: " + (a * b);
            case "/" -> b == 0 ? "Cannot divide by zero!" : "Result: " + (a / b);
            default -> "Invalid operation!";
        };
    }
}

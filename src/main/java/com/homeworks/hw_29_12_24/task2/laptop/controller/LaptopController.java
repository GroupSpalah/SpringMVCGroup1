package com.homeworks.hw_29_12_24.task2.laptop.controller;

import com.homeworks.hw_29_12_24.task2.laptop.domain.LaptopDocument;
import com.homeworks.hw_29_12_24.task2.laptop.service.LaptopService;
import com.homeworks.hw_29_12_24.task2.laptop.service.impl.LaptopServiceImpl;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping("laptop")
public class LaptopController {

    private static final LaptopService<LaptopDocument, ObjectId> LAPTOP_SERVICE = new LaptopServiceImpl();

    //return BSON
    //http://localhost:9999/mvc/laptop/getAllLaptops ++
    @GetMapping("/getAllLaptops")
    @ResponseBody
    public List<LaptopDocument> getLaptops() {
        return LAPTOP_SERVICE.getAllLaptop();
    }
    //return String
    //http://localhost:9999/mvc/laptop/getAllLaptopsStr ++
    @GetMapping("/getAllLaptopsStr")
    @ResponseBody
    public List<String> getLaptopsStr(Model model) {
        return LAPTOP_SERVICE.getAllLaptop().stream().map(Object::toString).collect(Collectors.toList());
    }

/*    public String getCalculator(*//*Model model*//*//изучить
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
    }*/
}

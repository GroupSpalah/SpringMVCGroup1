package com.controller;

import com.domain.Man;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("man")
public class ManController {

    @PostMapping("/save")
    public void save(@RequestBody Man man) {
        System.out.println(man);
    }
}

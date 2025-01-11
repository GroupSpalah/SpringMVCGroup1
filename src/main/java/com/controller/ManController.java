package com.controller;

import com.domain.Man;
import com.domain.Phone;
import com.service.CrudService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.FileNotFoundException;

@RestController
@RequestMapping("man")
@AllArgsConstructor
public class ManController {

    CrudService service;

    @PostMapping("/save")
    public void save(@RequestBody Man man) {
        service.save(man);
    }

    @PutMapping("/save")
    public void update(@RequestBody Man man) {
        System.out.println(man);
    }

    @GetMapping("/find/{id}")
    public Man getById(@PathVariable("id") int id) {
        Phone phone = Phone
                .builder()
                .number("067")
                .build();

        Man john = Man
                .builder()
                .age(32)
                .phone(phone)
                .name("John")
                .build();
        return john;
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable(name = "id") int id) throws FileNotFoundException {
        throw new FileNotFoundException("File not found");
    }

}

/**
 * /mvc/*
 * /mvc/save/*
 * /mvc/save/find
 */

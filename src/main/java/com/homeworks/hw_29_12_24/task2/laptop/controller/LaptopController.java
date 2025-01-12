package com.homeworks.hw_29_12_24.task2.laptop.controller;

import com.homeworks.hw_29_12_24.task2.laptop.domain.LaptopDocument;
import com.homeworks.hw_29_12_24.task2.laptop.service.LaptopService;
import com.homeworks.hw_29_12_24.task2.laptop.service.impl.LaptopServiceImpl;
import org.bson.types.ObjectId;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    //http://localhost:9999/mvc/laptop/getAll ++
    @GetMapping("/getAll")
    @ResponseBody
    public List<LaptopDocument> getLaptops() {
        return LAPTOP_SERVICE.getAllLaptop();
    }
    //return String
    //http://localhost:9999/mvc/laptop/getAllStr ++
    @GetMapping("/getAllStr")
    @ResponseBody
    public List<String> getLaptopsStr(Model model) {
        return LAPTOP_SERVICE.getAllLaptop().stream().map(Object::toString).collect(Collectors.toList());
    }

    //++
    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT) //можно добавить проверку на наличие записи
    public void deleteLaptop(@PathVariable(name = "id") String id) throws Exception {
        LAPTOP_SERVICE.deleteById(id);
    }

    //http://localhost:9999/mvc/laptop/find/6749effcdfec7a0ca1e2245b
    //++
    @GetMapping("/find/{id}")
    @ResponseBody
    public LaptopDocument findLaptopById(@PathVariable(name = "id") String id) {
        return LAPTOP_SERVICE.findById(id);
    }

    //http://localhost:9999/mvc/laptop/save
    //++
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveLaptop(@RequestBody LaptopDocument laptop) {
        LAPTOP_SERVICE.addLaptop(laptop);
        //return ResponseEntity.ok(laptop);
    }

    //http://localhost:9999/mvc/laptop/update
    //++
    @PutMapping("/update")
    public ResponseEntity<LaptopDocument> updateLaptop(@RequestBody LaptopDocument laptop) {
        LAPTOP_SERVICE.update(laptop);
        return ResponseEntity.ok(laptop);
    }
}

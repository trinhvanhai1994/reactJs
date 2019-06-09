package com.homedirect.house.controller;

import com.homedirect.house.model.EmployeeModel;
import com.homedirect.house.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private @Autowired EmployeeService service;

    @GetMapping("/all")
    List<EmployeeModel> all(HttpServletRequest httpServletRequest) {
        return service.all();
    }

    @PostMapping
    EmployeeModel create(@RequestBody EmployeeModel model, HttpServletRequest HttpServletRequest) {
        return service.create(model);
    }

    @GetMapping("/{id}")
    EmployeeModel get(@PathVariable Long id, HttpServletRequest httpServletRequest) {
        return service.get(id);
    }

    @PutMapping("/{id}")
    EmployeeModel update(@PathVariable Long id, @RequestBody EmployeeModel model, HttpServletRequest httpServletRequest) {
        return service.update(id, model);
    }

    @DeleteMapping ("/{id}")
    void delete(@PathVariable Long id) {
        service.delete(id);
    }
}

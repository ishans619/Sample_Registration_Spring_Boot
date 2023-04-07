package com.example.registation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.registation.dto.EmployeeDTO;
import com.example.registation.service.EmployeeService;
 
@RestController
@CrossOrigin
@RequestMapping("api/v1/employee")
public class EmployeeController {
 
    @Autowired
    private EmployeeService employeeService;
 
    @PostMapping(path = "/save")
    public String saveEmployee(@RequestBody EmployeeDTO employeeDTO)
    {
        String id = employeeService.addEmployee(employeeDTO);
        return id;
    }
}
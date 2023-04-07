package com.example.registation.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.registation.dto.EmployeeDTO;
import com.example.registation.entity.Employee;
import com.example.registation.repo.EmployeeRepo;
import com.example.registation.service.EmployeeService;
 
@Service
public class EmployeeIMPL implements EmployeeService
{
    @Autowired
    private EmployeeRepo employeeRepo;
    
    @Override
    public String addEmployee(EmployeeDTO employeeDTO)
       {
 
        Employee employee = new Employee(
                employeeDTO.getEmployeeid(),
                employeeDTO.getEmployeename(),
                employeeDTO.getAddress(),
                employeeDTO.getMobile()
        );
        Employee savedEmployee = employeeRepo.save(employee);
        return employee.getEmployeename();
    }
} 
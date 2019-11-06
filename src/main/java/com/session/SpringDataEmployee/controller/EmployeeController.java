package com.session.SpringDataEmployee.controller;

import com.session.SpringDataEmployee.model.Employee;
import com.session.SpringDataEmployee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/employees")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping(value = "/get")
    public List<Employee> getEmployees() {
        return employeeService.getEmployees();
    }

    @GetMapping(value = "/get/by/id/{id}")
    public Employee findEmployeeByID(@PathVariable Long id) {
        System.out.println("id");

        return employeeService.findEmployeeByID(id);
    }

    @GetMapping(value = "/get/by/name/{name}")
    public Employee findEmployeeByName(@PathVariable String name) {
        System.out.println("name");
        return employeeService.findEmployeeByName(name);
    }

    @PostMapping(value = "/add")
    public void addEmployee(@RequestBody Employee employee) {
        employeeService.addEmployee(employee);
    }


}

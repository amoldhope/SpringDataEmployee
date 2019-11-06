package com.session.SpringDataEmployee.service;

import com.session.SpringDataEmployee.model.Employee;
import com.session.SpringDataEmployee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public List<Employee> getEmployees() {
        return employeeRepository.getEMployees();
    }


    public void addEmployee(Employee newEmployee) {

        employeeRepository.addEmployee(newEmployee);

    }

    public Employee findEmployeeByID(Long id) {
        return employeeRepository.findEmployeeByID(id);
    }
    public Employee findEmployeeByName(String name) {
        return employeeRepository.findEmployeeByName(name);
    }
}

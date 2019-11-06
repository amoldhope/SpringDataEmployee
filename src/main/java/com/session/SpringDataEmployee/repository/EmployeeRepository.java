package com.session.SpringDataEmployee.repository;

import com.session.SpringDataEmployee.model.Employee;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class EmployeeRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Employee> getEMployees() {
        List<Employee> listEmployee = entityManager.createQuery("SELECT e FROM Employee e").getResultList();
        return listEmployee;
    }

    @Transactional
    public void addEmployee(Employee newEmployee) {
        entityManager.persist(newEmployee);
    }

    public Employee findEmployeeByID(Long id) {
        Employee employee = entityManager.find(Employee.class,id);
        return employee;
    }

    public Employee findEmployeeByName(String name) {
        Employee employee = (Employee) entityManager.createQuery("SELECT e FROM Employee e").getSingleResult();
        return employee;
    }
}

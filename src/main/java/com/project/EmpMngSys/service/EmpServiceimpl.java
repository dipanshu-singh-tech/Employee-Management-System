package com.project.EmpMngSys.service;

import com.project.EmpMngSys.entity.Employee;
import com.project.EmpMngSys.repository.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class EmpServiceimpl implements EmpService {
    @Autowired
    private EmpRepo emprepository;
    @Override
    public Employee saveEmployee(Employee employee) {
        return emprepository.save(employee);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return new ArrayList<>(emprepository.findAll());
    }

    @Override
    public Employee getEmployeeById(Integer id) {
        return emprepository.findById(id)
                .orElseThrow(()->new RuntimeException("Employee not found by id = "+id));
    }

    @Override
    public Employee updateEmployee(Integer id, Employee employee) {
        Employee exsitingEmployee=emprepository.findById(id)
                .orElseThrow(()->new RuntimeException("Employee not found by id = "+id));

        exsitingEmployee.setName(employee.getName());
        exsitingEmployee.setEmail(employee.getEmail());
        exsitingEmployee.setDepartment(employee.getDepartment());
        exsitingEmployee.setSalary(employee.getSalary());
        return emprepository.save(exsitingEmployee);
    }

    @Override
    public void deleteEmployee(Integer id) {
        Employee exsitingEmployee=emprepository.findById(id)
                .orElseThrow(()->new RuntimeException("Employee not found by id = "+id));
        emprepository.delete(exsitingEmployee);
        System.out.println("Employee deleted successfully");
    }
}

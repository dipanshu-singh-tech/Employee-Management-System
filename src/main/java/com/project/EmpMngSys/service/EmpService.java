package com.project.EmpMngSys.service;

import com.project.EmpMngSys.entity.Employee;
import com.project.EmpMngSys.repository.EmpRepo;

import java.util.List;

public interface EmpService {
    Employee saveEmployee(Employee employee);
    List<Employee> getAllEmployees();
    Employee getEmployeeById(Integer id);
    Employee updateEmployee(Integer id,Employee employee);
    void deleteEmployee(Integer id);
}

package com.project.EmpMngSys.repository;

import com.project.EmpMngSys.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpRepo extends JpaRepository<Employee,Integer> {
}

package com.deepak.employee_management_system.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deepak.employee_management_system.model.Employee;

@Repository 
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{ 

}

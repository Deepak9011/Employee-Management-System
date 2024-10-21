package com.deepak.employee_management_system.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deepak.employee_management_system.model.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer>{

}

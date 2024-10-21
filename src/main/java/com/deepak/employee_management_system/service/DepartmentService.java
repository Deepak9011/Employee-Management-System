package com.deepak.employee_management_system.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.deepak.employee_management_system.model.Department;

@Service
public interface DepartmentService {
	List<Department> getAllDepartments();
	void saveDepartment(Department department);
	Department getDepartmentById(int id);
	void deleteDepartmentById(int id);	
}

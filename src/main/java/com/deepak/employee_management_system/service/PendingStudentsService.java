package com.deepak.employee_management_system.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deepak.employee_management_system.model.PendingStudents;
import com.deepak.employee_management_system.repo.PendingStudentsRepo;

@Service
public class PendingStudentsService {
	
	@Autowired
	PendingStudentsRepo repo;
	
	public void addStudents(PendingStudents pendingstudents) {
		repo.save(pendingstudents);	
	}

}

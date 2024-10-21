package com.deepak.employee_management_system.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deepak.employee_management_system.model.CompanyExpences;
import com.deepak.employee_management_system.repo.CompanyExpencesRepo;


@Service
public class CompanyExpencesService {
	
	@Autowired
	CompanyExpencesRepo repo;
	
	public void addexpences(CompanyExpences addexpences) {
		repo.save(addexpences);
	}
	
}

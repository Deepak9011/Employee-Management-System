package com.deepak.employee_management_system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import com.deepak.employee_management_system.model.CompanyExpences;
import com.deepak.employee_management_system.service.CompanyExpencesService;

@Controller
public class CompanyExpenesController {
	
	@Autowired
	CompanyExpencesService service;
	
	@PostMapping(value = "/addexpences")
	public String addexpences(CompanyExpences companyExpences) {
		service.addexpences(companyExpences);
		return "payment/paymentIncomeList";
	}
}

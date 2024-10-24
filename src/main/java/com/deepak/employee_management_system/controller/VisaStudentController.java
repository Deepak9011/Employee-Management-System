package com.deepak.employee_management_system.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// import com.deepak.employee_management_system.model.PendingForVisa;
import com.deepak.employee_management_system.model.VisaStudent;
import com.deepak.employee_management_system.service.PendingForVisaService;
import com.deepak.employee_management_system.service.VisaStudentService;

@Controller
public class VisaStudentController {

	@Autowired
	VisaStudentService service;
	
	@Autowired
	PendingForVisaService service1;

	@GetMapping(value = "/admin/visa-pendingstudents")
	public String listVisaStudent(HttpServletRequest req) {
		
		List<VisaStudent> listVisaStudent = service.listVisaStudent();
		
		req.setAttribute("visastudentlist", listVisaStudent);
	
		System.out.println(service1.findByCity("Kandy"));
		
		return "visa/visa_pending_student";
	}
	

}

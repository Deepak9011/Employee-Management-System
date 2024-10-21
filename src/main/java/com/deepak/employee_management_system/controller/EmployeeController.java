package com.deepak.employee_management_system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.deepak.employee_management_system.model.Employee;
import com.deepak.employee_management_system.service.EmployeeServiceImpl;


@Controller
public class EmployeeController {
    @Autowired
    EmployeeServiceImpl service;

    @RequestMapping(value="admin/employee", method=RequestMethod.POST)
    public String addEmployee(Employee employee) {
		System.out.println("admin/employee callledd     ");
		System.out.println("b   ");
		service.saveEmployee(employee);
		
		return "redirect:/admin/employee-datatable";
		
	}



	@GetMapping("/admin/viewEmployee")
	public String viewEmployee(@RequestParam int id, Model model) {
		
		Employee employee = service.getEmployeeById(id);
		service.deleteEmployeeById(id);
		model.addAttribute("employee", employee);		
		return "employee/view_employee";
	}
	
	
	@RequestMapping("/admin/deleteEmployee")
	public String deleteEmployee(@RequestParam int id) {
		
		service.deleteEmployeeById(id);
		return "redirect:/admin/employee-datatable";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginPage(Model model) {
        return "login";
    }

    // @RequestMapping("/success")
    // public void loginPageRedirect(HttpServletRequest request, HttpServletResponse response, Authentication authResult) throws IOException, ServletException {
	// 	// response.sendRedirect(response.encodeRedirectURL(request.getContextPath() + "/admin/employee-dashboard"));                            

    //     String role =  authResult.getAuthorities().toString();

    //     if(role.contains("ADMIN")){
    //      response.sendRedirect(response.encodeRedirectURL(request.getContextPath() + "/admin/employee-dashboard"));                            
    //      }
    //      else if(role.contains("USER")) {
    //          response.sendRedirect(response.encodeRedirectURL(request.getContextPath() + "/admin/employee-user-dashboard"));
    //      }
	// 	 else {
	// 		response.sendRedirect(response.encodeRedirectURL(request.getContextPath() + "/admin/employee-dashboard"));
	// 	 }
    // }

}

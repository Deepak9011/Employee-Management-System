package com.deepak.employee_management_system.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.deepak.employee_management_system.model.VisaStudent;

public interface VisaStudentRepo extends JpaRepository<VisaStudent, String> {

	@Query("from VisaStudent where username=?1 and password=?2")
	VisaStudent LoginCheack(String username, String pass);
	
	@Query("select id from VisaStudent where username=?1")
	VisaStudent findByIdByUsername(String username);
	
}

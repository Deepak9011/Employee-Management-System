package com.deepak.employee_management_system.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deepak.employee_management_system.model.PendingForVisa;

@Repository
public interface PendingForVisaRepo extends JpaRepository<PendingForVisa, Integer> {

	List<PendingForVisa> findByCity(String city);
	
}

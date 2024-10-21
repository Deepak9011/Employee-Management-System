package com.deepak.employee_management_system.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deepak.employee_management_system.model.PendingForVisa;
import com.deepak.employee_management_system.repo.PendingForVisaRepo;

@Service
public class PendingForVisaService {

	@Autowired
	PendingForVisaRepo repo;
	
	public void addPendingVisa(PendingForVisa pendingforvisa) {
		repo.save(pendingforvisa);
	}
	
	public PendingForVisa getVisaById(int visaid) {
		return repo.findById(visaid).get();
	}
	
	public List<PendingForVisa> findByCity(String city) {
		return repo.findByCity(city);
	}
	
	public List<PendingForVisa> listAllPendingVisa() {
		return repo.findAll();
	}
	
	public void deletePendingVisa(int id) {
		repo.deleteById(id);
	}
	
}

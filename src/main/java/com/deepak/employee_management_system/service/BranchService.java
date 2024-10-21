package com.deepak.employee_management_system.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.deepak.employee_management_system.model.Branch;

@Service
public interface BranchService {
	List<Branch> getAllBranches();
	void saveBranch(Branch branch);
	Branch getBranchById(int id);
	void deleteBranchById(int id);
}

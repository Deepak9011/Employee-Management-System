package com.deepak.employee_management_system.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CompanyExpences {
	@Id
	private int id;
	private String name;
	private int amount;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	@Override
	public String toString() {
		return "CompanyExpences [id="+id+", name="+name+",amount="+amount+"]";
	}
	
}

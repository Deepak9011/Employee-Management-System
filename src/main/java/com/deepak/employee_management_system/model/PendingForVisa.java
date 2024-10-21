package com.deepak.employee_management_system.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class PendingForVisa {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String fname;
	private String lname;
	private String other;
	private String email;
	private String gender;
	private String dob;
	private String city;
	private String state;
	private int zip;
	private String marrage;
	private String country;
/*	
	@OneToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name="visastidfk", nullable = false)
	private VisaStudent visastudent;
	*/
	/*
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "pendingStudent_FK")
	private VisaStudent visasastudent; 
	as
	*/
	
	public String getLname() {
		return lname;
	}



	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getOther() {
		return other;
	}

	public void setOther(String other) {
		this.other = other;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	public String getMarrage() {
		return marrage;
	}

	public void setMarrage(String marrage) {
		this.marrage = marrage;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
/*
	public VisaStudent getVisastudent() {
		return visastudent;
	}

	public void setVisastudent(VisaStudent visastudent) {
		this.visastudent = visastudent;
	}
*/
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}



	@Override
	public String toString() {
		return "PendingForVisa [id=" + id + ", fname=" + fname + ", lname=" + lname + ", other=" + other + ", email="
				+ email + ", gender=" + gender + ", dob=" + dob + ", city=" + city + ", state=" + state + ", zip=" + zip
				+ ", marrage=" + marrage + ", country=" + country + "]";
	}



	
	
}

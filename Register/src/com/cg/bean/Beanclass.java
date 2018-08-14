package com.cg.bean;

public class Beanclass {

	private String firstname;
	private String lastname;
	private double number;
	private String domain;
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public double getNumber() {
		return number;
	}
	public void setNumber(double number) {
		this.number = number;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	@Override
	public String toString() {
		return "Beanclass [firstname=" + firstname + ", lastname=" + lastname
				+ ", number=" + number + ", domain=" + domain + "]";
	}
	
}

package com.sample.domain;

public class PolicyHolder {

	private String firstName;
	private String lastName;
	private int age;
	private String stateAddress;
	private int numberOfAccidents;
	private int premium = 0;
	private String approval = "N";
	private String validLicense = "Y";
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getStateAddress() {
		return stateAddress;
	}
	public void setStateAddress(String stateAddress) {
		this.stateAddress = stateAddress;
	}
	public int getNumberOfAccidents() {
		return numberOfAccidents;
	}
	public void setNumberOfAccidents(int numberOfAccidents) {
		this.numberOfAccidents = numberOfAccidents;
	}
	public int getPremium() {
		return premium;
	}
	public void setPremium(int premium) {
		this.premium = premium;
	}
	public String getApproval() {
		return approval;
	}
	public void setApproval(String approval) {
		this.approval = approval;
	}
	public String getValidLicense() {
		return validLicense;
	}
	public void setValidLicense(String validLicense) {
		this.validLicense = validLicense;
	}
	
	
}

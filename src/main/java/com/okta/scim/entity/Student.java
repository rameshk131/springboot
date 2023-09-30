package com.okta.scim.entity;

public class Student {
	
	private Integer id;
	private String firstName;
	private String lastName;
	private String middleName;
	private String email;
	private Long phone;
	
	
	public Student(Integer id, String firstName, String lastName, String middleName, String email, Long phone) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
		this.email = email;
		this.phone = phone;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


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


	public String getMiddleName() {
		return middleName;
	}


	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Long getPhone() {
		return phone;
	}


	public void setPhone(Long phone) {
		this.phone = phone;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", middleName="
				+ middleName + ", email=" + email + ", phone=" + phone + "]";
	}
	
	

}

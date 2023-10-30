package com.okta.scim.service;

import java.util.List;

import com.okta.scim.entity.Student;

public interface StudentService {
	
	public Student getStudent(int sid);
	
	public List<Student> getStudents();

}

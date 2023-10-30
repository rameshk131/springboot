package com.okta.scim.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.okta.scim.entity.Student;
import com.okta.scim.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService stu;
	
	@GetMapping("/health")
	public String health() {
		
		System.out.println("health check methods called.........");
		
		return "Scim Application is Up and running........";
		
		
	}
	
	@GetMapping("/student/{sid}")
	public Student getStudent(@PathVariable(value = "sid") Integer sid) {
		
		System.out.println("getStudent() methods called......sid == "+sid);
		
		return stu.getStudent(sid);
		
		
	}
	
	@GetMapping("/students")
	public List<Student> getStudents() {
		
		System.out.println("getStudents() methods called......");
		
		return stu.getStudents();
		
		
	}
	
	
	

}

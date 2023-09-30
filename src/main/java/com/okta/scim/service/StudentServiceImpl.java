package com.okta.scim.service;

import org.springframework.stereotype.Service;

import com.okta.scim.entity.Student;

@Service
public class StudentServiceImpl implements StudentService{

	@Override
	public Student getStudent(int sid) {
		
		if(sid == 100) {
			
			return new Student(100,"Sri","Ram","Billa","sri@gmail.com",887799665544l);
			
		}
		
		return new Student(0,"Dummy","dummy","dummy","dummy@gmail.com",111111111l);
	}

}

package com.okta.scim.service;

import java.util.ArrayList;
import java.util.List;

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

	@Override
	public List<Student> getStudents() {
		
		List<Student> stu = new ArrayList<Student>();
		stu.add(new Student(100,"Sri","Ram","Billa","sri@gmail.com",887799665544l));
		stu.add(new Student(101,"ramesh","ramesh","kumar","ramesh@gmail.com",322267767l));
		stu.add(new Student(102,"suresh","naik","naik","naik@gmail.com",32231231l));
		stu.add(new Student(103,"kamlesh","tripathy","chase","chase@gmail.com",133139l));
		return stu;
	}

}

package com.universityBeanCollaboration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfigJava {
	
	@Bean(name= "student1")
	public Student getStudentBean() {
		return new Student();
		
	}
	
	@Bean(name= "department10")
	public Department getDepartmentBean() {
		return new Department();
		
	}
	

}

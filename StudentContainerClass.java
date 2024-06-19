package com.universityBeanCollaboration;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class StudentContainerClass 
{
	
	public static void main(String[] args)  throws BeansException
	{

		
		ApplicationContext context = new AnnotationConfigApplicationContext(StudentConfigJava.class);
		
		Student student=(Student) context.getBean("student1");
		student.setStudentName("Ram");
		System.out.println(student);
		
		Department department=(Department) context.getBean("department10");//java appln context
		department.setDepartmentName("MindFirMe");
		System.out.println(department);
		
		department.setDepartmentId(department);  //Dependancy Injecation
		System.out.println(department);
		
		}

	}
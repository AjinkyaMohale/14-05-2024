package com.universityBeanCollaboration;


public class Student
{

	private int StudentId;
	private String StudentName;
	private int StudentMarks;
	private String StudentAddress;
	
	private Department department;
	
	
	public void setStudentAddress(String studentAddress) {
		StudentAddress = studentAddress;
	}



	public void setStudentId(int studentId) {
		StudentId = studentId;
	}


	
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}


	public void setStudentMarks(int studentMarks) {
		StudentMarks = studentMarks;
	}


	public void setStudentAddress(Object student11) {
		StudentAddress = (String) student11;
		
		
	}


		

	@Override
	public String toString() {
		return "Student [StudentId=" + StudentId + ", StudentName=" + StudentName + ", StudentMarks=" + StudentMarks
				+ ", StudentAddress=" + StudentAddress + ", department=" + department + "]";
	}



	public void setDepartment(Department department1)
	{
		// TODO Auto-generated method stub
		
	}
	
}

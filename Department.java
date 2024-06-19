package com.universityBeanCollaboration;



public class Department
{
	private Department departmentId;
	private String departmentName;
	

	public void setDepartmentId(Department department) {
		this.departmentId = department;
	}


	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}


	@Override
	public String toString() 
	{
		return "Department [departmentId=" + departmentId + ", departmentName=" + departmentName + "]";
	}
	
	

}

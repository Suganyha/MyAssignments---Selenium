package org.student;

import org.department.Department;

public class Student extends Department
{
	
	public void studentName(String name1)
	{
		System.out.println("The student Name:" + name1);
	}
	public void studentDept(String studentdept)
	{
		System.out.println("The student Department:" + studentdept);
	}
	public void studentId(int id) 
	{
		System.out.println("The student Id is" + id);
	}

public static void main(String[] args) 
{
	Department dept = new Department();
	dept.collegeName("Shakthi");
	dept.collegeCode(2727);
	dept.collegeRank(13);
	dept.deptName("ECE");
	
	Student stud = new Student();
	stud.studentName("Suganyha");
	stud.studentDept("ECE - C");
	stud.studentId(145);
	


	
}
}

package org.student1;

public class StudentInfo 
{
	public void getStudentInfo(int id) 
	{
		System.out.println("The Id is: " + id);
	}
	public void getStudentInfo(int id , String name) 
	{
		System.out.println("The id and Name is: " + id + " " + name);
	}
	public void getStudentInfo(String email , int phno) 
	{
		System.out.println("The email and Phone Number is " + email + " " + phno);
	}


	public static void main(String[] args)
	{
		StudentInfo stin = new StudentInfo();
		stin.getStudentInfo(07);
		stin.getStudentInfo(07, "Suganyha");
		stin.getStudentInfo("suganyha@gmail.com", 07);
		
	}
}
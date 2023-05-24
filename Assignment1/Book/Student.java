package com.assignment.Book;

public class Student 
{
String name;
String department;
int marks;
public Student(String name, String department,int marks) {
	super();
	this.name = name;
	this.department = department;
	this.marks=marks;
}
void printDetails()
{
System.out.println("print the details of the students");	

}
public int getMarks() {
	if(marks>=90)
	{
		System.out.println("grade A");
	}
	else if(marks>=80)
	{
		System.out.println("grade B");
	}
	else
		System.out.println("grade C");
	return marks;
}
String getGrades(int marks)
{
	return department;
	
}


}

package com.assignment.overloading;

public class Employee 
{
	String name;
	String designation;
	public Employee(String name, String designation) {
		super();
		this.name = name;
		this.designation = designation;
	}
	
 double calcBonus(double basicAllowance)
	{
	 
		return basicAllowance;
		
	}
 double calcBonus(double basicAllowance,double carAllowance)
 {
	 
	return carAllowance+basicAllowance;
	 
 }
 double calcBonus(double basicAllowance,double carAllowance,double houseAllowance)
 {
	return houseAllowance+carAllowance+basicAllowance;
 }


}



 


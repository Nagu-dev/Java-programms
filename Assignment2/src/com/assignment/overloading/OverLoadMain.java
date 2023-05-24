package com.assignment.overloading;

import java.util.Scanner;

public class OverLoadMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter employee name");
		String employeeName=sc.next();
		
		System.out.println("enter the employee designation");
	String designation=sc.next();
	
		Employee employee1=new Employee("nagu", "manager");
		Employee employee2 =new Employee("manu","programmer");
		Employee  employee3=new Employee("ramu","director");
		
		if(designation.equals("programmer"))
				{
			
			double x=employee1.calcBonus(3000);
			System.out.println(x);
				}
		else if(designation.equals("manager"))
		{
			
	double x1=employee2.calcBonus(3060,5677);
	System.out.println(x1);
		}
		else if(designation.equals("director"))
		{
			
	double x2=employee2.calcBonus(3560,7677);
	System.out.println(x2);
		}
	}

}

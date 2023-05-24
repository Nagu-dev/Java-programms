package com.assignment.scanner;

import java.util.Scanner;

public class Regestration {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String[] arr= {"Mani","Nagu","varun","chandru"};
	
		System.out.println("enter the username to register");
		
		String username=sc.next();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].equals(username))
			{
		System.out.println("name is not unique");
		break;
		}
			else
			{
				System.out.println("you are registerd");
				break;
				}
			}
		
	}

}

package com.assignment.scanner;

import java.util.Scanner;

public class SquareRootArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("enter the array elements");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("square root of new array values");
	for(int i=0;i<size;i++)
	{
		arr[i]=(int) Math.sqrt(arr[i]);
	}
		for(int i=0;i<size;i++)
		{
			System.out.println(arr[i]);
		}
	}
	

}

package com.assignment.scanner;

import java.util.Scanner;

public class SumAndAverageArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter an array of size");
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.println("enter array elements");
		for(int j=0;j<arr.length;j++)
		{
			arr[j]=sc.nextInt();
		}
		
		int sum=0,avg=0;
		for(int i=0;i<arr.length;i++)
		{
			sum =sum+arr[i];
			
		}
		System.out.println("the sum of array is"+sum);
	avg=sum/arr.length;
	System.out.println("the average of an array is "+ avg);

	}

}

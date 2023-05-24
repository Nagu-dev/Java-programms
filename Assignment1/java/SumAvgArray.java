package com.assignment.java;

public class SumAvgArray {

	public static void main(String[] args) {
		int arr[]= {30,38,29,45,90,4,5,67};
	int sum=0, avg=0;
	for(int i=0;i<arr.length;i++)
	{
		sum = sum+arr[i];
	}
System.out.println("sum of aarray is"+sum);
avg=sum/arr.length;
System.out.println("average of an array is "+avg);
	}

}

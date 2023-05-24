package com.assignment.java;

public class DuplicatesArray {

	public static void main(String[] args) {
		int arr[]= {10,50,23,90,23,23,20};
		System.out.println("counting the duplicates value in an array");
		int count =0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
			}
		}
		System.out.println(count);
	}

}

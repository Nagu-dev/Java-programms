package com.assignment.java;

public class GreatestArray {

	public static void main(String[] args) {
		int arr[]= {20,56,90,34,10};
		int max=arr[0];
		for(int i:arr)
		{
			if(i>max)
			{
				max=i;
			}
		}
		System.out.println("greatest element in an array is: "+max);
	}

}

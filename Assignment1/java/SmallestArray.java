package com.assignment.java;

public class SmallestArray {

	public static void main(String[] args) {
		int arr[]= {20,56,90,34,10};
		int min=arr[0];
		for(int i:arr)
		{
			if(i<min)
			{
				min=i;
			}
		}
		System.out.println("smallest element in an array is: "+min);
	}

	}



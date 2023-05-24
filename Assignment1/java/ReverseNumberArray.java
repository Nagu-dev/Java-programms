package com.assignment.java;

public class ReverseNumberArray {

	public static void main(String[] args) {
		int arr[]= {1002,5678,564};
		System.out.println("reverse the value in an array");
		for(int i=0;i<arr.length;i++)
		{
			int num=arr[i];
			int rev=0;
			while(num!=0)
			{
				int rem=num%10;
				rev=(rev*10)+rem;
				num=num/10;
			}
			System.out.println("reverse number is "+rev);
		}
	}
}

			

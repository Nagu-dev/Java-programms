package com.assignment.java;

public class DuplicateElementsArray {

	public static void main(String[] args) {
		int arr[]= {20,89,45,50,23,20,43,20};
		System.out.println("duplicate elements in an array is:");
		 int count=0;
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
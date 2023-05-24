package com.assignment.java;

public class SecondLargestArray {

	public static void main(String[] args) {
		
int arr[]= {23,56,2,45,89,76};
int temp=0;
for(int i=0;i<arr.length;i++)
{
	for(int j=i+1;j<arr.length;j++)
	{
		if(arr[i]>arr[j])
		{
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
	}		
}
System.out.println("array after sorting");
for(int i=0;i<arr.length;i++)
{
	System.out.println(arr[i]+" ");
}

	System.out.println("second largest value in an array "+arr[arr.length-2]);
	}
	}



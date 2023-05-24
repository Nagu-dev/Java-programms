package com.assignment.java;

import java.util.Scanner;

public class PatternReversePyramid {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("enter the number of rows");
		int row=sc.nextInt();
		int space=0;
		int star=(2*row)-1;
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print("  "+" ");
			}
			for(int k=1;k<=star;k++)
			{
				System.out.print("* "+"  ");
			}
			System.out.println();
			space++;
			star=star-2;
		}

	}

}

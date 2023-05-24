package com.assignment.scanner;

import java.util.Scanner;

public class EvenNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n =20;
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
		if(i%2==0)
		{
			System.out.println(i);
		}

	}

}

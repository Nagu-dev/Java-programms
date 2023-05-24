package com.assignment.scanner;

import java.util.Scanner;

public class LongestWord {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a sentence");
		String str=sc.nextLine();
		String word=" ",lword="";
		int length=str.length();
		str +=" ";
		for(int i=0;i<length;i++)
		{
			char ch=str.charAt(i);
			if(ch==' ')
			{
			if(word.length()>lword.length())
				lword =word;
			word=" ";
			}
			else
			{
				word += ch;
					
			}
		}
		System.out.println("the longest word in a sentence :"+lword+":the length of the word:"+lword.length());
	}

}

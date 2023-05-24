package com.simeio.service;
import java.util.Scanner;

import com.simeio.exception.InValidVoterException;
import com.simeio.exception.LocalityNotFoundException;
import com.simeio.exception.NoVoterIDException;
import com.simeio.exception.UnderAgeException;

public class VoterAppMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the age");
		int age=sc.nextInt();
		System.out.println("enter locality");
		String Locality = sc.next();
		System.out.println("enter the vid");
		int vid=sc.nextInt();
		ElectionBooth electionbooth = new ElectionBoothImpli();
		try {
		boolean result=electionbooth.checkEligibility(age, Locality, vid);
		}
		catch(InValidVoterException e)
		{
			System.out.println(e.getMessage());
		}
		
	}
}

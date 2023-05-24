package com.simeio.service;

import com.simeio.exception.InValidVoterException;
import com.simeio.exception.LocalityNotFoundException;
import com.simeio.exception.NoVoterIDException;
import com.simeio.exception.UnderAgeException;


public class ElectionBoothImpli implements ElectionBooth
{

@Override
public boolean checkEligibility(int age, String Locality, int vid) throws InValidVoterException 
{
	boolean ageres=checkAge(age);
	if(ageres==true)
	{
		boolean localityres=checkLocalities(Locality);
		if(localityres==true)
		{
			boolean voteridres=checkVoterID(vid);
			if(voteridres==true)
			{
				System.out.println("voter id created successfully");
			}
		}
	}
		
	
	return false;
	
	
	
}
private boolean checkAge(int age) throws UnderAgeException
{
	if(age>=18) {
		System.out.println("eligible to vote");
	return true;
	}
	else
		throw new UnderAgeException("not eligible");
	
	

}
private boolean checkLocalities(String locality) throws LocalityNotFoundException
{
	String[] localities= {"bengaluru","chickamagaluru","mangalore"};
	int count=0;
	for(String localty:localities)
	{
		if(locality.equals(localty))
		{
			count++;
			return true;
		}
	}if(count==0)
		throw new LocalityNotFoundException("locality not found");
	return false;
	

}
private boolean checkVoterID(int vid) throws NoVoterIDException
{
	if(vid>=1000&&vid<=9999) {
	System.out.println("voter id is eligible");
	return true;
	}
	else
		throw new NoVoterIDException("no voter id for that number");
	
	

}


}

package com.simeio.service;

import com.simeio.exception.InValidVoterException;

public interface ElectionBooth {

	boolean checkEligibility(int age,String Locality,int vid)throws InValidVoterException;
	
	
	}


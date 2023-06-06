package com.shristi.autowiring;

import org.springframework.stereotype.Component;

@Component("instrument")
public class Violin implements Instrument{

	@Override
	public void play(String song) {
		// TODO Auto-generated method stub
		System.out.println("song is played using violin "+song);
	}

	
}

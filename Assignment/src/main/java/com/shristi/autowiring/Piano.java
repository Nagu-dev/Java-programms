package com.shristi.autowiring;

import org.springframework.stereotype.Component;

@Component
public class Piano implements Instrument{

	@Override
	public void play(String song) {
		// TODO Auto-generated method stub
		System.out.println("song played using piano "+song);
	}

}

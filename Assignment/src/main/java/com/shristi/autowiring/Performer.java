package com.shristi.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Performer {
	

	@Autowired
	@Qualifier("guitar")
	Instrument guitar;

	@Autowired
	Instrument instrument;

	@Autowired
	Instrument piano;

	void playSong(String type, String song) {

		if (type.equals("guitar")) {
			instrument = new Guitar();
			guitar.play(song);
		}

		else if (type.equals("violin")) {

			instrument = new Violin();
			instrument.play(song);
		}

		else if (type.equals("piano")) {
			instrument = new Piano();
			piano.play(song);
		}
	}
}

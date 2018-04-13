package de.dpma.penandpaper.models.pc.warrior;

import de.dpma.penandpaper.models.pc.Warrior;
import de.dpma.penandpaper.models.pc.races.Race;

public class Brute extends Warrior implements Race{

	public Brute(int raceNum) {
		super(400+Race.getRaceModMP(raceNum),200+Race.getRaceModHP(raceNum), "Grobian");
		
	}

}

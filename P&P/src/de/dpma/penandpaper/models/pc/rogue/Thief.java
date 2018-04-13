package de.dpma.penandpaper.models.pc.rogue;

import de.dpma.penandpaper.models.pc.Rogue;
import de.dpma.penandpaper.models.pc.races.Race;

public class Thief extends Rogue implements Race{

	public Thief(int raceNum) {
		super(400+Race.getRaceModMP(raceNum),200+Race.getRaceModHP(raceNum), "Dieb");
		
	}

}

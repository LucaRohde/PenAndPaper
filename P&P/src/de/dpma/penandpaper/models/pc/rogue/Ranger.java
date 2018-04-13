package de.dpma.penandpaper.models.pc.rogue;

import de.dpma.penandpaper.models.pc.Rogue;
import de.dpma.penandpaper.models.pc.races.Race;

public class Ranger extends Rogue implements Race{

	public Ranger(int raceNum) {
		super(400+Race.getRaceModMP(raceNum),200+Race.getRaceModHP(raceNum),"Waldläufer");
		
	}

}

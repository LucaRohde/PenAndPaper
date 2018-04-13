package de.dpma.penandpaper.models.pc.warrior;

import de.dpma.penandpaper.models.pc.Warrior;
import de.dpma.penandpaper.models.pc.races.Race;

public class Fighter extends Warrior implements Race{

	public Fighter(int raceNum) {
		super(400+Race.getRaceModMP(raceNum),200+Race.getRaceModHP(raceNum), "Kämpfer");
		
	}

}

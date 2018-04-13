package de.dpma.penandpaper.models.pc.races;

public interface Race {
	
	public static final String ORKRACE="Ork";
	public static final int ORKMP=-2;
	public static final int ORKHP=+3;
	
	public static final String ELFRACE="Elf";
	public static final int ELFMP=+3;
	public static final int ELFHP=-2;

	public static final String HUMANRACE="Mensch";
	public static final int HUMANMP=+1;
	public static final int HUMANHP=+1;
	
	
	public static int getRaceModHP (int raceNum) {
	int raceModHP=0;
	switch (raceNum) {
			//Mensch
		case 1:
			raceModHP = HUMANHP;
			 break;
			//Ork
		case 2:
			raceModHP = ORKHP;
			break;
			//Elf
		case 3:
			raceModHP = ELFHP;
			break;
	}
	return raceModHP;
	
	}
	public static int getRaceModMP (int raceNum) {
		int raceModMP=0;
		switch (raceNum) {
				//Mensch
			case 1:
				raceModMP = HUMANMP;
				 break;
				//Ork
			case 2:
				raceModMP = ORKMP;
				break;
				//Elf
			case 3:
				raceModMP = ELFMP;
				break;
				
		}
		return raceModMP;
		
		}

	
}

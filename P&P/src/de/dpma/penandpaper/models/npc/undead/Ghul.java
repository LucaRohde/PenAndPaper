package de.dpma.penandpaper.models.npc.undead;

import de.dpma.penandpaper.models.NonPlayableChar;
import de.dpma.penandpaper.util.Language;

public class Ghul extends NonPlayableChar {

	private int poisonCounter;
	public Ghul() {
		super.setHp(30);
		super.setName(Language.getString("Ghul.Name"));
		super.setIDName("Ghul");
	}


	public int attack() {

		int chance = (int) Math.round(Math.random() * 4);

		switch (chance) {

		case 0:
			System.out.println(Language.getString("Ghul.AttackOne"));
			return 0+poisonedCheck();
		case 1:

			System.out.println(Language.getString("Ghul.AttackTwo"));
			return 0+poisonedCheck();
		case 2:
			System.out.println(Language.getString("Ghul.AttackThree"));
			return 2+poisonedCheck();
		case 3:

			System.out.println(Language.getString("Ghul.AttackFour"));
			return 4+poisonedCheck();
		case 4:

			System.out.println(Language.getString("Ghul.AttackFive"));
			poisonCounter= 3;
			return 0+poisonedCheck();

		}
		return 0+poisonedCheck();
	}

	public int poisonedCheck() {
		if (poisonCounter == 1) {
			System.out.println(Language.getString("Ghul.PoisonEnd"));
			poisonCounter = poisonCounter - 1;
			return 1;
		} else if (poisonCounter > 0) {
			System.out.println(Language.getString("Ghul.Poison"));
			poisonCounter = poisonCounter - 1;
			return 1;
		} else {
			return 0;
		}

	}
	
}

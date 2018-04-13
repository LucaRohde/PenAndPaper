package de.dpma.penandpaper.models.npc.undead;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import de.dpma.penandpaper.models.NonPlayableChar;
import de.dpma.penandpaper.models.PlayableChar;
import de.dpma.penandpaper.util.Language;

public class Zombie extends NonPlayableChar {

	public Zombie() {
		super.setHp(10);
		super.setName(Language.getString("Zombie.Name"));
		super.setIDName("Zombie");
	}

	public int attack() {

		int chance = (int) Math.round(Math.random() * 3);

		switch (chance) {

		case 0:
			System.out.println(Language.getString("Zombie.AttackOne"));
			return 1;
		case 1:

			System.out.println(Language.getString("Zombie.AttackTwo"));
			return 1;
		case 2:
			System.out.println(Language.getString("Zombie.AttackTwo"));
			return 2;
		case 3:

			System.out.println(Language.getString("Zombie.AttackTwo"));
			return 2;

		}
		return 0;
	}

}

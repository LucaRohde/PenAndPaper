package de.dpma.penandpaper.models.npc.undead;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import de.dpma.penandpaper.models.NonPlayableChar;
import de.dpma.penandpaper.models.PlayableChar;
import de.dpma.penandpaper.util.Language;

public class Skeleton extends NonPlayableChar {

	public Skeleton() {
		super.setHp(20);
		super.setName(Language.getString("Skeleton.Name"));
		super.setIDName("Skeleton");
	}

	public int attack() {

		int chance = (int) Math.round(Math.random() * 3);

		switch (chance) {

		case 0:
			System.out.println(Language.getString("Skeleton.AttackOne"));
			return 0;
		case 1:

			System.out.println(Language.getString("Skeleton.AttackTwo"));
			return 0;
		case 2:
			System.out.println(Language.getString("Skeleton.AttackThree"));
			return 2;
		case 3:

			System.out.println(Language.getString("Skeleton.AttackFour"));
			return 4;

		}
		return 0;
	}

}

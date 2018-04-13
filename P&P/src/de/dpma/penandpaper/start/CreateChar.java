package de.dpma.penandpaper.start;

import java.util.InputMismatchException;
import java.util.ResourceBundle;
import java.util.Scanner;

import de.dpma.penandpaper.levels.FirstStage;
import de.dpma.penandpaper.models.PlayableChar;
import de.dpma.penandpaper.models.pc.mage.Geomancer;
import de.dpma.penandpaper.models.pc.mage.Necromancer;
import de.dpma.penandpaper.models.pc.mage.Pyromancer;
import de.dpma.penandpaper.models.pc.rogue.Assasin;
import de.dpma.penandpaper.models.pc.rogue.Ranger;
import de.dpma.penandpaper.models.pc.rogue.Thief;
import de.dpma.penandpaper.models.pc.warrior.Berserker;
import de.dpma.penandpaper.models.pc.warrior.Brute;
import de.dpma.penandpaper.models.pc.warrior.Fighter;
import de.dpma.penandpaper.util.Language;

public class CreateChar {
	PlayableChar p1;
	public CreateChar() {
		Scanner s = new Scanner(System.in);
		
		System.out.println(Language.getString("Welcome"));
		int i = chooseClass();

		System.out.println(Language.getString("ChooseRaceQuestion"));

		System.out.println();
		int b = chooseRace();

		System.out.println(Language.getString("ChooseSpecialisation"));
		int spec = chooseSpec(i);

		p1 = createChar(i, b, spec);
		System.out.println(Language.getString("ChooseNameOfHero"));
		String name = s.next();
		name = name + s.nextLine();
		p1.setPlayerName(name);
		System.out.println(Language.getString("NameOfHero", p1.getPlayerName()));

		System.out.println(Language.getString("TellStats", p1.getPlayerName(), p1.getHp(), p1.getMaxhp(), p1.getMp()));
		System.out.println(Language.getString("Begin"));

	}

	public PlayableChar getChar() {
		return p1;

		
	}

	public int chooseClass() {
		Scanner s = new Scanner(System.in);
		int i;
		try {
			i = s.nextInt();
		} catch (InputMismatchException e) {
			System.out.println(Language.getString("ChooseClassViable"));
			// // s.close();
			return chooseClass();
		}
		if (i == 1 || i == 2 || i == 3) {
			// // // s.close();
			return i;
		} else {

			System.out.println(Language.getString("ChooseClassViable"));
			// // s.close();
			return chooseClass();
		}
	}

	public int chooseRace() {
		Scanner s = new Scanner(System.in);
		int i;
		try {
			i = s.nextInt();
		} catch (InputMismatchException e) {
			System.out.println(Language.getString("ChooseRace"));
			// // s.close();
			return chooseRace();

		}
		if (i == 1 || i == 2 || i == 3) {
			// // s.close();
			return i;
		} else {

			System.out.println(Language.getString("ChooseRace"));
			// // s.close();
			return chooseRace();
		}
	}

	public int chooseSpec(int i) {
		Scanner s = new Scanner(System.in);
		int w = 0;
		int spec;
		switch (i) {

		case 1:
			System.out.println(Language.getString("ChooseSpecWarrior"));

			try {
				w = s.nextInt();
			} catch (InputMismatchException e) {
				return chooseSpec(i);
			}
			if (w == 1 || w == 2 || w == 3) {
				// s.close();
				return w;
			} else {

				System.out.println(Language.getString("ChooseSpecWarrior"));
				// s.close();
				return chooseSpec(i);
			}
		case 2:
			System.out.println(Language.getString("ChooseSpecWarrior"));

			try {
				w = s.nextInt();
			} catch (InputMismatchException e) {
				return chooseSpec(i);
			}
			if (w == 1 || w == 2 || w == 3) {
				// s.close();
				return w;
			} else {

				System.out.println(Language.getString("ChooseSpecRogue"));
				// s.close();
				return chooseSpec(i);
			}
		case 3:
			System.out.println(Language.getString("ChooseSpecMage"));

			try {
				w = s.nextInt();
			} catch (InputMismatchException e) {
				return chooseSpec(i);
			}
			if (w == 1 || w == 2 || w == 3) {
				// s.close();
				return w;
			} else {

				System.out.println(Language.getString("ChooseSpecMage"));
				// s.close();
				return chooseSpec(i);
			}
		}
		// s.close();
		return chooseSpec(i);
	}

	public PlayableChar createChar(int i, int b, int spec) {
		PlayableChar p1 = null;
		switch (i) {

		case 1:

			switch (b) {

			case 1:
				switch (spec) {

				case 1:
					System.out.println(Language.getString("WarriorHumanFighter"));
					p1 = new Fighter(1);
					break;
				case 2:
					System.out.println(Language.getString("WarriorHumanBrute"));
					p1 = new Brute(1);
					break;
				case 3:
					System.out.println(Language.getString("WarriorHumanBerserker"));
					p1 = new Berserker(1);
					break;
				}

				break;
			case 2:
				switch (spec) {

				case 1:
					System.out.println(Language.getString("WarriorOrkFighter"));
					p1 = new Fighter(2);
					break;
				case 2:
					System.out.println(Language.getString("WarriorOrkBrute"));
					p1 = new Brute(2);
					break;
				case 3:
					System.out.println(Language.getString("WarriorOrkBerserker"));
					p1 = new Berserker(2);
					break;
				}

				break;
			case 3:
				switch (spec) {

				case 1:
					System.out.println(Language.getString("WarriorElfFighter"));
					p1 = new Fighter(3);
					break;
				case 2:
					System.out.println(Language.getString("WarriorElfBrute"));
					p1 = new Brute(3);
					break;
				case 3:
					System.out.println(Language.getString("WarriorElfBerserker"));
					p1 = new Berserker(3);
					break;
				}

				break;
			}

			break;

		case 2:
			switch (b) {

			case 1:
				switch (spec) {

				case 1:
					System.out.println(Language.getString("RogueHumanThief"));
					p1 = new Thief(1);
					break;
				case 2:
					System.out.println(Language.getString("RogueHumanAssasin"));
					p1 = new Assasin(1);
					break;
				case 3:
					System.out.println(Language.getString("RogueHumanRanger"));
					p1 = new Ranger(1);
					break;
				}
				break;
			case 2:
				switch (spec) {

				case 1:
					System.out.println(Language.getString("RogueOrkThief"));
					p1 = new Thief(2);
					break;
				case 2:
					System.out.println(Language.getString("RogueOrkAssasin"));
					p1 = new Assasin(2);
					break;
				case 3:
					System.out.println(Language.getString("RogueOrkRanger"));
					p1 = new Ranger(2);
					break;
				}
				break;
			case 3:
				switch (spec) {

				case 1:
					System.out.println(Language.getString("RogueElfRanger"));
					p1 = new Thief(3);
					break;
				case 2:
					System.out.println(Language.getString("RogueElfAssasin"));
					p1 = new Assasin(3);
					break;
				case 3:
					System.out.println(Language.getString("RogueElfRanger"));
					p1 = new Ranger(3);
					break;
				}
				break;
			}

			break;
		case 3:
			switch (b) {

			case 1:
				switch (spec) {

				case 1:
					System.out.println(Language.getString("MageHumanGeomancer"));
					p1 = new Geomancer(1);
					break;
				case 2:
					System.out.println(Language.getString("MageHumanPyromancer"));
					p1 = new Pyromancer(1);
					break;
				case 3:
					System.out.println(Language.getString("MageHumanNecromancer"));
					p1 = new Necromancer(1);
					break;
				}
				break;
			case 2:

				switch (spec) {

				case 1:
					System.out.println(Language.getString("MageOrkGeomancer"));
					p1 = new Geomancer(2);
					break;
				case 2:
					System.out.println(Language.getString("MageOrkPyromancer"));
					p1 = new Pyromancer(2);
					break;
				case 3:
					System.out.println(Language.getString("MageOrkNecromancer"));
					p1 = new Necromancer(2);
					break;
				}
				break;
			case 3:
				switch (spec) {

				case 1:
					System.out.println(Language.getString("MageElfGeomancer"));
					p1 = new Geomancer(3);
					break;
				case 2:
					System.out.println(Language.getString("MageElfPyromancer"));
					p1 = new Pyromancer(3);
					break;
				case 3:
					System.out.println(Language.getString("MageElfNecromancer"));
					p1 = new Necromancer(3);
					break;
				}
				break;
			}
			break;

		}

		return p1;

	}

}

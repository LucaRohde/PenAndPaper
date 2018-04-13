package de.dpma.penandpaper.util;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import de.dpma.penandpaper.models.NonPlayableChar;
import de.dpma.penandpaper.models.PlayableChar;

public class Fight {

	private NonPlayableChar[] enemy;
	private PlayableChar player;

	public int playerAttacks() {

		int ret = 0;
		Scanner s = new Scanner(System.in);
		int i;
		if (player.getMp() > 0) {
			System.out.println(Language.getString("Fight.ChooseAbility"));
			player.quickOverview();
			try {
				i = s.nextInt();
			} catch (InputMismatchException e) {
				return playerAttacks();

			}
			if (i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 6) {
				switch (i) {

				case 1:
					ret = player.abilityOne();
					break;
				case 2:
					ret = player.abilityTwo();
					break;
				case 3:
					ret = player.abilityThree();
					break;
				case 4:
					ret = player.autoAttack();
					break;
				case 5:
					ret = player.block();
					break;
				case 6:
					ret = player.rest();
					break;

				}
			} else {
				return playerAttacks();
			}

		} else {
			System.out.println(Language.getString("Fight.OOM"));
			player.setMp(player.getMp() + 10);
			return ret;
		}

		return ret;

	}

	public void go() {
		System.out.println(
				"\n<------------------------------------------------------------------------------------------------------------------------->\n");
		player.hpProof();
		System.out.println(Language.getString("TellStats", player.getPlayerName(), player.getHp(), player.getMaxhp(),
				player.getMp()));

		for (NonPlayableChar e : enemy) {
			System.out.println(Language.getString("NPC.HP", e.getName(), e.getHp()));
		}

		for (NonPlayableChar e : enemy) {
			if (e.getHp() <= 0) {
				System.out.println(Language.getString(e.getIDName() + ".Won"));
				return;
			} else if (player.getHp() <= 0) {

				System.out.println(Language.getString(e.getIDName() + ".Loss"));
				System.exit(0);

			}
		}
		if (enemy.length == 1) {
			enemy[0].setHp(enemy[0].getHp() - playerAttacks());
		} else if (enemy.length > 1) {
			NonPlayableChar tempenemy = fightMoreThanOne();
			tempenemy.setHp(tempenemy.getHp() - playerAttacks());
		}System.out.println(
				"\n<------------------------------------------------------------------------------------------------------------------------->\n");
		
		for (NonPlayableChar e : enemy) {
			player.setHp(player.getHp() - e.attack());
		}
		go();
	}

	public NonPlayableChar fightMoreThanOne() {
		int x = 0;
		NonPlayableChar ret;
		System.out.println(Language.getString("Fight.ChooseWhoToAttack",enemy.length));
		for (NonPlayableChar e : enemy) {
			x++;
			System.out.println("(" + x + ") " + e.getName());

		}
		Scanner s = new Scanner(System.in);
		try {
			x = s.nextInt();
		} catch (InputMismatchException z) {
			return fightMoreThanOne();
		}
		if (x > enemy.length || x <= 0) {

			return fightMoreThanOne();
		} else {
			ret = enemy[x - 1];
		}
		System.out.println("Du greifst " + ret.getName() + " an.");
		return ret;

	}

	public void enterFight(PlayableChar player, NonPlayableChar... enemy) {
		Scanner s = new Scanner(System.in);
		System.out.println(Language.getString("Tutorial.Onward"));
		String w = null;
		while (w == null) {
			w = s.next();
		}

		this.player = player;
		this.enemy = enemy;
		for (NonPlayableChar e : enemy) {
			System.out.println(Language.getString(e.getIDName() + ".Engage"));
		}
		go();

	}
}

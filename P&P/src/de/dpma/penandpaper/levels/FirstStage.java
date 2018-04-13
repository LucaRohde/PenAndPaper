package de.dpma.penandpaper.levels;

import java.time.Duration;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import de.dpma.penandpaper.models.PlayableChar;
import de.dpma.penandpaper.models.npc.undead.Ghul;
import de.dpma.penandpaper.models.npc.undead.Skeleton;
import de.dpma.penandpaper.util.Fight;
import de.dpma.penandpaper.util.Language;
import de.dpma.penandpaper.util.Loot;

public class FirstStage extends Levels implements Loot {
	Skeleton skeleton1 = new Skeleton();
	Skeleton skeleton2 = new Skeleton();
	Skeleton skeleton3 = new Skeleton();
	Ghul ghul1 = new Ghul();
	Fight fight = new Fight();

	public FirstStage(PlayableChar player) {

		createFirstStage(player);

	}

	public void createFirstStage(PlayableChar player) {

		System.out.println(Language.getString("FirstStage.Name"));
		System.out.println(Language.getString("FirstStage.Declaration"));
		fight.enterFight(player, skeleton1);
		System.out.println(Language.getString("FirstStage.Decision"));
		int x = 0;

		x=decision();

		switch (x) {
		case 1:
			Loot.randomLootPotion(player);

		case 2:
			System.out.println(Language.getString("FirstStage.FirstSkeleton"));
			fight.enterFight(player, skeleton2);
			System.out.println(Language.getString("FirstStage.SecondSkeleton"));
			fight.enterFight(player, skeleton3);
			System.out.println(Language.getString("FirstStage.DangerAhead"));

		case 3:
			System.out.println(Language.getString("FirstStage.Run"));
			break;

		case 4:
			System.out.println(Language.getString("FirstStage.Dead"));
			System.exit(0);
			break;

		}
	}
		public int decision() {
			int x ;

			Scanner s = new Scanner(System.in);
			try {
				x = s.nextInt();
			} catch (

			InputMismatchException e) {
				return decision();
			}
			return x;
		}
	
}

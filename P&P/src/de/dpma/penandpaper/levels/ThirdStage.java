package de.dpma.penandpaper.levels;

import java.util.Scanner;

import de.dpma.penandpaper.models.PlayableChar;
import de.dpma.penandpaper.models.npc.undead.Ghul;
import de.dpma.penandpaper.models.npc.undead.Skeleton;
import de.dpma.penandpaper.util.Fight;
import de.dpma.penandpaper.util.Language;
import de.dpma.penandpaper.util.Loot;

public class ThirdStage extends Levels {

	Skeleton skeleton1 = new Skeleton();
	Ghul ghul1 = new Ghul();
	Ghul ghul2 = new Ghul();
	Fight fight = new Fight();	
	public ThirdStage(PlayableChar player) {
	createThirdStage(player);
	}

	public void createThirdStage(PlayableChar player) {

		System.out.println(Language.getString("ThirdStage.Name"));
		System.out.println(Language.getString("ThirdStage.Declaration"));
		fight.enterFight(player, ghul1);
		int chance = (int) Math.round(Math.random() * 1);

		switch (chance) {

		case 0:

			System.out.println(Language.getString("ThirdStage.Skeleton"));

			fight.enterFight(player, skeleton1);
			break;
		case 1:

			System.out.println(Language.getString("ThirdStage.SecondGhul"));
			fight.enterFight(player, ghul2);
		break;
		}
		System.out.println(Language.getString("ThirdStage.End"));
		}
	
}

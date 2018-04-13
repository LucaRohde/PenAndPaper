
package de.dpma.penandpaper.util;

import de.dpma.penandpaper.models.PlayableChar;

public interface Loot {

	public static void randomLoot(PlayableChar player) {

		int rand = (int) Math.round(Math.random() * 2);
		switch (rand) {
		case 0:
			System.out.println(player.getPlayerName() + "findet hier leider nichts.");
			break;
		case 1:
			Loot.randomLootPotion(player);
			break;
		case 2:
			Loot.randomLootWeapon(player);
		}

	}

	// TODO Verschieden Upgrade Waffenstufen
	private static void randomLootWeapon(PlayableChar player) {
			int rand = (int) Math.round(Math.random() * 2);
			switch (rand) {
			case 0:
				System.out.println("");
				player.setMAXHP(player.getMaxhp() + 7);
				player.setHp(player.getHp() + 7);
				System.out.println(Language.getString("TellStats", player.getPlayerName(), player.getHp(),
						player.getMaxhp(), player.getMp()));
				break;
			case 1:
				System.out.println(
						"Dein Blick hellt sich auf, als du eine kleine Flasche findest. Das kühle Wasser erfrischt deinen ausgetrockneten Rachen(Leben +1)");
				player.setHp(player.getHp() + 1);
				System.out.println(Language.getString("TellStats", player.getPlayerName(), player.getHp(),
						player.getMaxhp(), player.getMp()));
				break;
			case 2:
				System.out.println(
						"Dein Blick hellt sich auf, als du eine kleine Flasche findest. Die Flüssigkeit brennt höllisch in deiner Kehle. Es scheint nichts gewesen zu sein, was man trinken hätte sollen.(Leben -3)");
				player.setHp(player.getHp() - 3);
				System.out.println(Language.getString("TellStats", player.getPlayerName(), player.getHp(),
						player.getMaxhp(), player.getMp()));
				if (player.getHp() <= 0) {
					System.out.println("Dieses Gift scheint dir den Rest gegeben zu haben. Du bist tot.\n\tGame Over");
					System.exit(0);

				}}}

	public static void randomLootPotion(PlayableChar player) {

		int rand = (int) Math.round(Math.random() * 2);
		switch (rand) {
		case 0:
			System.out.println(
					"Dein Blick hellt sich auf, als du eine kleine Flasche findest. Doch erst nach den hastischen ersten Schlücken bemerkst du, dass es nicht das verhofte Wasser ist.\nDu hattest Glück und einen Heilttrank erwischt! (Leben +7)");
			player.setMAXHP(player.getMaxhp() + 7);
			player.setHp(player.getHp() + 7);
			System.out.println(Language.getString("TellStats", player.getPlayerName(), player.getHp(),
					player.getMaxhp(), player.getMp()));
			break;
		case 1:
			System.out.println(
					"Dein Blick hellt sich auf, als du eine kleine Flasche findest. Das kühle Wasser erfrischt deinen ausgetrockneten Rachen(Leben +1)");
			player.setHp(player.getHp() + 1);
			System.out.println(Language.getString("TellStats", player.getPlayerName(), player.getHp(),
					player.getMaxhp(), player.getMp()));
			break;
		case 2:
			System.out.println(
					"Dein Blick hellt sich auf, als du eine kleine Flasche findest. Die Flüssigkeit brennt höllisch in deiner Kehle. Es scheint nichts gewesen zu sein, was man trinken hätte sollen.(Leben -3)");
			player.setHp(player.getHp() - 3);
			System.out.println(Language.getString("TellStats", player.getPlayerName(), player.getHp(),
					player.getMaxhp(), player.getMp()));
			if (player.getHp() <= 0) {
				System.out.println("Dieses Gift scheint dir den Rest gegeben zu haben. Du bist tot.\n\tGame Over");
				System.exit(0);

			}

		}
	}
}

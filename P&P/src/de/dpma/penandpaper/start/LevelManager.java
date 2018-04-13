package de.dpma.penandpaper.start;

import de.dpma.penandpaper.levels.FirstStage;
import de.dpma.penandpaper.levels.Levels;
import de.dpma.penandpaper.levels.SecondStage;
import de.dpma.penandpaper.levels.ThirdStage;
import de.dpma.penandpaper.levels.Tutorial;
import de.dpma.penandpaper.models.PlayableChar;

public class LevelManager {
	Levels level;

	public LevelManager(PlayableChar player) {
		level = new Tutorial(player);
		level = new FirstStage(player);

		while (true) {
			level = randomLevel(player);

		}

	}

	public Levels randomLevel(PlayableChar player) {
		int chance = (int) Math.round(Math.random() * 1);

		switch (chance) {
		case 0:
			return new SecondStage(player);

		case 1:
			return new ThirdStage(player);
		}
		return new SecondStage(player);
	}

}

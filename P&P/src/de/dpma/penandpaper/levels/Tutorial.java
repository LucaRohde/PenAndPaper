package de.dpma.penandpaper.levels;

import java.util.InputMismatchException;
import java.util.Scanner;

import de.dpma.penandpaper.models.PlayableChar;
import de.dpma.penandpaper.util.Language;

public class Tutorial extends Levels {

	public Tutorial(PlayableChar player) {
		System.out.println(Language.getString("Tutorial.Question"));
		tutorialQuestion(player);
		
	}
	public void tutorialQuestion(PlayableChar player){
		
		int dec=0;
		Scanner s = new Scanner(System.in);
		try {
		 dec = s.nextInt();
		}catch(InputMismatchException e) {
			tutorialQuestion(player);
			
		}
		if (dec == 1) {

			System.out.println(Language.getString("Tutorial.Start"));
		
			player.getAbilities();
			player.getAttackAndBlock();
			player.getRest();
			System.out.println(Language.getString("Tutorial.Onward"));
			String w = null;
			while (w == null) {
				w = s.next();
			}
			

		} else if (dec == 2) {

			

		}
		else {
			
			tutorialQuestion(player);
			
		}
	}

}

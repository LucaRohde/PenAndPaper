package de.dpma.penandpaper.models.pc.mage;

import javax.swing.plaf.synth.SynthGraphicsUtils;

import de.dpma.penandpaper.models.pc.Mage;
import de.dpma.penandpaper.models.pc.races.Race;
import de.dpma.penandpaper.util.Language;

public class Necromancer extends Mage {

	private boolean meatgolemActive = false;
	private int meatgolemCounter = 0;
	private int zombieCounter =0;
	private int zombieAliveCounter =0;

	public Necromancer(int raceNum) {
		super(20 + Race.getRaceModMP(raceNum), 10 + Race.getRaceModHP(raceNum), Language.getString("Necromancer.Name"));
	}

	public void getAbilities() {

		System.out.println(Language.getString("Necromancer.AbilitiesDescription"));
		System.out.println(Language.getString("Necromancer.AbilitiesDescription.One"));
		System.out.println(Language.getString("Necromancer.AbilitiesDescription.Two"));
		System.out.println(Language.getString("Necromancer.AbilitiesDescription.Three"));

	}

	public void quickOverview() {

		
		System.out.println(Language.getString("Necromancer.QuickAbilitiesOverview"));
		super.quickOverview();

	}
	@Override
	public int abilityOne() {
		System.out.println(Language.getString("Necromancer.AbilityOne", this.getPlayerName()));

		this.setMp(this.getMp() - 4);
		this.setHp(this.getHp() + 2);
		return (4 + meatgolemCheck());
	}

	@Override
	public int abilityTwo() {

		if(zombieAliveCounter==0) {
			
			System.out.println(Language.getString("Necromancer.AbilityTwo",this.getPlayerName()));
			zombieCounter =5;
			
			
		}
		else if(zombieAliveCounter>2) {
			System.out.println(Language.getString("Necromancer.AbilityTwo",this.getPlayerName()));
		System.out.println(Language.getString("Necromancer.ZombiesAlreadyThere",this.getPlayerName(),zombieAliveCounter));
		zombieAliveCounter =zombieAliveCounter -1;
		zombieCounter =5;
	}
		else {
			
			System.out.println(Language.getString("Necromancer.AbilityTwo",this.getPlayerName()));
			System.out.println(Language.getString("Necromancer.ZombiesAlreadyThere",this.getPlayerName(),zombieAliveCounter));
			zombieCounter =5;
			
		}

		
		zombieAliveCounter= zombieAliveCounter+1;
		this.setMp(getMp()-4);
		return (0 + meatgolemCheck());
	}

	@Override
	public int abilityThree() {

		if (meatgolemActive) {

			System.out.println(Language.getString("Necromancer.MeatgolemAlreadyActive",this.getPlayerName()));

		} else {

			System.out.println(Language.getString("Necromancer.AbilityThree",this.getPlayerName()));
		}

		int chance = (int) Math.round(Math.random() * 2);

		
		switch (chance) {

		case 0:
			System.out.println(Language.getString("Necromancer.AbilityThree.NoSuccess", this.getPlayerName()));
			this.setMp(this.getMp() - 6);
			break;
		case 1:
			System.out.println(Language.getString("Necromancer.AbilityThree.NoSuccess", this.getPlayerName()));
			this.setMp(this.getMp() - 6);
			break;
		case 2:
			System.out.println(Language.getString("Necromancer.AbilityThree.Success", this.getPlayerName()));
			meatgolemCounter = meatgolemCounter + 3;
			meatgolemActive = true;
			this.setMp(this.getMp() - 14);
			break;
		case 3:
			System.out.println(Language.getString("Necromancer.AbilityThree.Success", this.getPlayerName()));
			meatgolemCounter = meatgolemCounter + 3;
			meatgolemActive = true;
			this.setMp(this.getMp() - 14);
			break;
		

		}

		return(0+meatgolemCheck());
	}

	public int meatgolemCheck() {
		if (meatgolemCounter == 1) {
			System.out.println(Language.getString("Necromancer.MeatgolemDies", this.getPlayerName()));
			meatgolemCounter = meatgolemCounter - 1;
			meatgolemActive = false;
			this.setMp(getMp()+2);
			this.setHp(getHp()+3);
			
			return (3 +zombiesCheck());
		} else if (meatgolemCounter > 0) {
			System.out.println(Language.getString("Necromancer.MeatgolemAttack", this.getPlayerName()));
			meatgolemCounter = meatgolemCounter - 1;
			this.setMp(getMp()+2);
			this.setHp(getHp()+3);
			return (3+zombiesCheck());
		} else {
			return (0+zombiesCheck());
		}

	}
	public int zombiesCheck() {
		if (zombieCounter == 1) {
			System.out.println(Language.getString("Necromancer.ZombiesDecay", this.getPlayerName()));
			zombieCounter = zombieCounter - 1;
			return zombieAliveCounter;
		} else if (zombieCounter > 0) {
			System.out.println(Language.getString("Necromancer.ZombiesAttack",zombieAliveCounter));
			zombieCounter = zombieCounter - 1;
			return zombieAliveCounter;
		} else {
			return 0;
		}

	}

	
	@Override
	public int autoAttack() {
		System.out.println(Language.getString("Mage.Attack", this.getPlayerName()));
		return 2+meatgolemCheck();
	}

	@Override
	public int block() {
		System.out.println(Language.getString("Mage.Block"));
		this.setHp(this.getHp() + 1);
		return 0+meatgolemCheck();
	}

}

package de.dpma.penandpaper.models.pc.mage;

import de.dpma.penandpaper.models.pc.Mage;
import de.dpma.penandpaper.models.pc.races.Race;
import de.dpma.penandpaper.util.Language;

public class Pyromancer extends Mage {

	private boolean phoenixActive = false;
	private int phoenixCounter = 0;

	public Pyromancer(int raceNum) {
		super(16 + Race.getRaceModMP(raceNum), 12 + Race.getRaceModHP(raceNum), Language.getString("Pyromancer.Name"));
	}

	public void getAbilities() {

		System.out.println(Language.getString("Pyromancer.AbilitiesDescription"));
		System.out.println(Language.getString("Pyromancer.AbilitiesDescription.One"));
		System.out.println(Language.getString("Pyromancer.AbilitiesDescription.Two"));
		System.out.println(Language.getString("Pyromancer.AbilitiesDescription.Three"));

	}

	public void quickOverview() {

		
		System.out.println(Language.getString("Pyromancer.QuickAbilitiesOverview"));
		super.quickOverview();

	}
	@Override
	public int abilityOne() {
		System.out.println(Language.getString("Pyromancer.AbilityOne", this.getPlayerName()));

		this.setMp(this.getMp() - 2);
		return (5 + phoenixCheck());
	}

	@Override
	public int abilityTwo() {

		int chance = (int) Math.round(Math.random() * 2);

		switch (chance) {

		case 0:
			System.out.println(Language.getString("Pyromancer.AbilityTwo", this.getPlayerName()));
			break;
		case 1:
			System.out.println(Language.getString("Pyromancer.AbilityTwo", this.getPlayerName()));
			break;
		case 2:
			System.out.println(Language.getString("Pyromancer.AbilityTwoSuccess", this.getPlayerName()));
			break;
		}

		return (8 + phoenixCheck());
	}

	@Override
	public int abilityThree() {

		if (phoenixActive) {

			System.out.println(Language.getString("Pyromancer.PhoenixAlreadyActive"));

		} else {

			System.out.println(Language.getString("Pyromancer.AbilityThree",this.getPlayerName()));
		}

		int chance = (int) Math.round(Math.random() * 3);

		switch (chance) {

		case 0:
			System.out.println(Language.getString("Pyromancer.AbilityThree.NoSuccess", this.getPlayerName()));
			this.setMp(this.getMp() - 4);
			break;
		case 1:
			System.out.println(Language.getString("Pyromancer.AbilityThree.NoSuccess", this.getPlayerName()));
			this.setMp(this.getMp() - 4);
			break;
		case 2:
			System.out.println(Language.getString("Pyromancer.AbilityThree.NoSuccess", this.getPlayerName()));
			this.setMp(this.getMp() - 4);
			break;

		case 3:
			System.out.println(Language.getString("Pyromancer.AbilityThree.Success", this.getPlayerName()));
			phoenixCounter = phoenixCounter + 3;
			phoenixActive = true;
			this.setMp(this.getMp() - 12);
			break;
		case 4:
			System.out.println(Language.getString("Pyromancer.AbilityThree.Success", this.getPlayerName()));

			phoenixCounter = phoenixCounter + 3;
			phoenixActive = true;
			this.setMp(this.getMp() - 12);
			break;

		}

		return(0+phoenixCheck());
	}

	public int phoenixCheck() {
		if (phoenixCounter == 1) {
			System.out.println(Language.getString("Pyromancer.PhoenixDies", this.getPlayerName()));
			phoenixCounter = phoenixCounter - 1;
			phoenixActive = false;
			return 4;
		} else if (phoenixCounter > 0) {
			System.out.println(Language.getString("Pyromancer.PhoenixAttack", this.getPlayerName()));
			phoenixCounter = phoenixCounter - 1;
			return 4;
		} else {
			return 0;
		}

	}

	
	@Override
	public int autoAttack() {
		System.out.println(Language.getString("Mage.Attack", this.getPlayerName()));
		return 2+phoenixCheck();
	}

	@Override
	public int block() {
		System.out.println(Language.getString("Mage.Block"));
		this.setHp(this.getHp() + 1);
		return 0+phoenixCheck();
	}

}

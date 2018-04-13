package de.dpma.penandpaper.models.pc.warrior;

import javax.swing.plaf.synth.SynthGraphicsUtils;

import de.dpma.penandpaper.models.pc.Warrior;
import de.dpma.penandpaper.models.pc.races.Race;
import de.dpma.penandpaper.util.Language;

public class Berserker extends Warrior {

	private boolean berserkerModeActive = false;
	private boolean asleep = false;
	private int hpbefore = 0;
	private int hpafter = 0;
	private int rageCounter = 0;

	public Berserker(int raceNum) {
		super(10 + Race.getRaceModMP(raceNum), 20 + Race.getRaceModHP(raceNum), Language.getString("Berserker.Name"));
	}

	public void getAbilities() {

		System.out.println(Language.getString("Berserker.AbilitiesDescription"));
		System.out.println(Language.getString("Berserker.AbilitiesDescription.One"));
		System.out.println(Language.getString("Berserker.AbilitiesDescription.Two"));
		System.out.println(Language.getString("Berserker.AbilitiesDescription.Three"));

	}

	public void quickOverview() {

		System.out.println(Language.getString("Berserker.QuickAbilitiesOverview"));
		super.quickOverview();

	}

	@Override
	public int abilityOne() {
		if (asleep == true) {
			hpafter = getHp();
			return sleep();
		}

		rage();
		int dmg = 0;
		int chance = (int) Math.round(Math.random() * 4);
		this.setMp(getMp() - 5);
		switch (chance) {

		case 0:
			System.out.println(Language.getString("Berserker.AbilityOne.NoSuccess", this.getPlayerName()));
			this.setHp(getHp() - 4);
			break;
		case 1:
			System.out.println(Language.getString("Berserker.AbilityOne.Success", this.getPlayerName()));
			dmg = 7;
			break;
		case 2:
			System.out.println(Language.getString("Berserker.AbilityOne.Success", this.getPlayerName()));
			dmg = 7;
			break;
		case 3:
			System.out.println(Language.getString("Berserker.AbilityOne.Success", this.getPlayerName()));
			dmg = 7;
			break;

		}
		return (dmg);
	}

	@Override
	public int abilityTwo() {
		if (asleep == true) {
			hpafter = getHp();
			return sleep();
		}

		rage();
		hpbefore = getHp();
		System.out.println(Language.getString("Berserker.AbilityTwo", this.getPlayerName()));
		asleep = true;
		return 0;

	}

	@Override
	public int abilityThree() {
		if (asleep == true) {
			hpafter = getHp();
			return sleep();
		}
		rage();
		System.out.println(Language.getString("Berserker.AbilityThree", this.getPlayerName()));
		berserkerModeActive = true;
		rageCounter = 4;

		return 0;
	}

	public int sleep() {

		rage();
		System.out.println(Language.getString("Berserker.Sleep", getPlayerName()));
		if (hpbefore > hpafter) {
			int difference = hpbefore - hpafter;
			this.setHp(getHp() - (difference));
			System.out.println(Language.getString("Berserker.HitWhileSleep", this.getPlayerName(), difference));
		} else {
			System.out.println(Language.getString("Berserker.WakeUp", this.getPlayerName()));
			this.setHp(getHp() + 10);
		}
		asleep = false;
		return 0;

	}

	public int rage() {

		if (rageCounter == 1) {

			System.out.println(Language.getString("Berserker.BerserkModeEnd", this.getPlayerName()));
			rageCounter = rageCounter - 1;
			berserkerModeActive = false;

		} else if (rageCounter > 0) {

			System.out.println(Language.getString("Berserker.BerserkMode", this.getPlayerName()));

			rageCounter = rageCounter - 1;
		} else {
		}
		return 0;

	}

	@Override
	public int autoAttack() {

		rage();
		if (berserkerModeActive == true) {
			System.out.println(Language.getString("Berserker.HitWhileBerserkMode", this.getPlayerName()));
			return 7;
		} else {
			System.out.println(Language.getString("Warrior.Attack", this.getPlayerName()));
			return 4;
		}

	}

	@Override
	public int block() {
		rage();
		return super.block();

	}

}

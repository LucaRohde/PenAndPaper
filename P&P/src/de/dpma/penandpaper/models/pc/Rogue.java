package de.dpma.penandpaper.models.pc;

import de.dpma.penandpaper.models.PlayableChar;

public class Rogue extends PlayableChar {

	public Rogue(int mp, int hp, String name) {
		super.setHp(hp);
		super.setMp(mp);
		super.setName(name);
		
	}

	@Override
	public int abilityOne() {
		System.out.println("Ability noch nicht bestimmt");
		return 0;
	}

	@Override
	public int abilityTwo() {
		System.out.println("Ability noch nicht bestimmt");
		return 0;
	}

	@Override
	public int abilityThree() {
		System.out.println("Ability noch nicht bestimmt");
		return 0;
	}

	@Override
	public void getAbilities() {

		System.out.println("Noch nicht erläuterte Abilities");
		
	}

	@Override
	public int autoAttack() {
		System.out.println("Ein schneller Stich deines Dolches zwischen die Rippen deines Opfers ist ziemlcih Schmerzhaft! \n(Schaden : 4)");
		return 4;
	}

	@Override
	public int block() {
		
		System.out.println("Nahezu schutzlos bist du durch deine leichte Rüstung ausgeliefert. Deine Wendigkeit ermöglicht dir aber deine Lebenswichtigen Organe aus dem Spiel zu lassen.\n(Leben +2)");
		this.setHp(this.getHp()+1);
		
		return 0;
	}

	@Override
	public void getAttackAndBlock() {
		System.out.println("Dem Dieb steht Durch seine Wendigkeit eine Art verspätetes Ausweichmanöver zur Verfügen, welches den Hieb abfälschen kann. (Leben+1)\nAußerdem ermöglicht ihm ein schneller Hieb mit seinem Dolch einiges an Schaden zu verursachen.(Schaden:4)");
		
	}

	@Override
	public void quickOverview() {
		// TODO Auto-generated method stub
		
	}
}

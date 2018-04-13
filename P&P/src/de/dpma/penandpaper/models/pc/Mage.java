package de.dpma.penandpaper.models.pc;

import de.dpma.penandpaper.models.PlayableChar;
import de.dpma.penandpaper.models.pc.races.Race;
import de.dpma.penandpaper.util.Language;

public class Mage extends PlayableChar {

	
	
	public Mage(int mp, int hp, String name) {

		this.setMAXHP(hp);
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
	public int autoAttack() {
		System.out.println(Language.getString("Mage.Attack",this.getPlayerName()));
		return 2;
	}

	@Override
	public int block() {
		System.out.println(Language.getString("Mage.Block"));
		this.setHp(this.getHp()+1);
		return 0;
	}
	public int abilityThree() {
		System.out.println("Ability noch nicht bestimmt");
		return 0;
	}

	@Override
	public void getAbilities() {

		System.out.println("Noch nicht erläuterte Abilities");
		
	}

	

	@Override
	public void getAttackAndBlock() {
		System.out.println(Language.getString("Mage.AttackAndBlockDescription"));
		
	}

	@Override
	public void quickOverview() {
		System.out.println(Language.getString("Mage.QuickAbilitiesOverview"));

		
	}

}

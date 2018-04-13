package de.dpma.penandpaper.models.pc;

import de.dpma.penandpaper.models.PlayableChar;
import de.dpma.penandpaper.util.Language;

public class Warrior extends PlayableChar {

	public Warrior(int mp, int hp, String name) {
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
		System.out.println(Language.getString("Warrior.Attack"));
		return 3;
	}

	@Override
	public int block() {
		System.out.println(Language.getString("Warrior.Block"));
		this.setHp(this.getHp()+4);
		
		return 0;
	}

	@Override
	public void getAttackAndBlock() {
		System.out.println(Language.getString("Warrior.AttackAndBlockDescription"));
		
	}

	@Override
	public void quickOverview() {
		System.out.println(Language.getString("Warrior.QuickAbilitiesOverview"));

		
	
	
}}

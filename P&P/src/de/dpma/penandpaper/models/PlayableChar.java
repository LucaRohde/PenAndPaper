package de.dpma.penandpaper.models;

import de.dpma.penandpaper.util.Language;

public abstract class PlayableChar extends Char {
	private int mp;
	private String playerName;


	
	
	public String getPlayerName() {
		return playerName;
	}


	public void setPlayerName(String name) {
		this.playerName = name;
	}


	public int getMp() {
		return mp;
	}


	public void setMp(int mp) {
		this.mp = mp;
	}
	public int getHp() {
		
		return super.getHp();
	}

	public void setHp(int hp) {
		
		super.setHp(hp);
		
	}
	
	public int rest() {
		
		System.out.println(Language.getString("rest", playerName));
		
		setMp(getMp()+5);
		
		return 0;
	}
	
	public void getRest() {
		
		System.out.println(Language.getString("restDesc", playerName));
		
	}
	
	public abstract void quickOverview();
	
	public abstract int autoAttack();
	
	public abstract int block();
	
	public abstract int abilityOne();

	public abstract int abilityTwo();

	public abstract int abilityThree();
	
	public abstract void getAbilities();
	
	public abstract void getAttackAndBlock();
		
	
}

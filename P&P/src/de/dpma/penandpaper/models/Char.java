package de.dpma.penandpaper.models;

public abstract class Char {

	private int maxhp;
	private String name;
	private String IDName;
	private int hp;
	
	public String getIDName() {
		return IDName;
	}

	public void setIDName(String iDName) {
		IDName = iDName;
	}

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public void hpProof() {

		if (hp > maxhp) {
			this.setHp(maxhp);
			System.out.println("\n" + name + " besitzt volle HP. \nÜberheilung ist nicht möglich!\n");

		}

	}

	public int getMaxhp() {
		return maxhp;
	}

	public void setMAXHP(int maxhp) {

		this.maxhp = maxhp;
	}

}

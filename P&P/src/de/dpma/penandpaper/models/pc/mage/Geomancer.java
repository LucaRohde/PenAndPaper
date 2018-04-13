package de.dpma.penandpaper.models.pc.mage;

import de.dpma.penandpaper.models.pc.Mage;
import de.dpma.penandpaper.models.pc.races.Race;
import de.dpma.penandpaper.util.Language;

public class Geomancer extends Mage {

	public Geomancer(int raceNum) {
		super(20+Race.getRaceModMP(raceNum),10+Race.getRaceModHP(raceNum),Language.getString("Geomancer.Name"));
	}
	
	public void getAbilities() {
		
		System.out.println(Language.getString("Geomancer.AbilitiesDescription"));
		System.out.println(Language.getString("Geomancer.AbilitiesDescription.One"));
		System.out.println(Language.getString("Geomancer.AbilitiesDescription.Two"));
		System.out.println(Language.getString("Geomancer.AbilitiesDescription.Three"));
		
		
	}
	
public void quickOverview() {

		
		System.out.println(Language.getString("Geomancer.QuickAbilitiesOverview"));
		super.quickOverview();

	}
	@Override
	public int abilityOne() {
		System.out.println(Language.getString("Geomancer.AbilityOne",this.getPlayerName()));
		
		this.setMp(this.getMp()-3);
		return 4;
	}

	@Override
	public int abilityTwo() {
		System.out.println(Language.getString("Geomancer.AbilityTwo",this.getPlayerName()));
		this.setMp(this.getMp()-4);
		this.setHp(this.getHp()+5);
		return 0;
	}

	@Override
	public int abilityThree() {
		System.out.println(Language.getString("Geomancer.AbilityThree",this.getPlayerName()));
		this.setMp(this.getMp()-8);
		return 12;
	}


}

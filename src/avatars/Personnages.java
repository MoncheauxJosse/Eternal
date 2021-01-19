package avatars;

import interstats.Combatant;

public class Personnages extends Combatant {
	
	/**
	 * création de personnages, qui partiras dans le super combatant
	 */
	public Personnages(String nom, int vie, int force, int type) {
		super(nom, vie, force, type);
	}



	@Override
	public String toString() {
		return super.toString();
	}
	
	
}

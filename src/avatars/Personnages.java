package avatars;

import interstats.Combatant;

public class Personnages extends Combatant {
	
	/**
	 * cr�ation de personnages, qui partiras dans le super combatant
	 */
	public Personnages(String nom, int vie, int force) {
		super(nom, vie, force);
	}



	@Override
	public String toString() {
		return super.toString();
	}
	
	
}

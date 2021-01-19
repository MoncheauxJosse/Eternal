package avatars;

import interstats.Combatant;

public class Monstre extends Combatant {

	
	/**
	 * création de monstre, qui partiras dans le super combatant
	 */
	public Monstre(String nom, int vie, int force, int type) {
		super(nom, vie, force, type);
	}



	@Override
	public String toString() {
		return super.toString();
	}
}

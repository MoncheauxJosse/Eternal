package avatars;

import interstats.Combatant;
import Classe.Class;
public class Personnages extends Combatant {
	
	private Class classechoix;
	/**
	 * création de personnages, qui partiras dans le super combatant
	 */
	public Personnages(String nom, int vie, int force,int type, Class classe) {
		super(nom, vie, force, type);
		this.classechoix = classe;
	}



	public Class getClassechoix() {
		return classechoix;
	}



	public void setClassechoix(Class classechoix) {
		this.classechoix = classechoix;
	}



	@Override
	public String toString() {
		return super.toString()+"classe: "+classechoix;
	}

	
	
}

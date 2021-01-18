package avatars;

import interstats.Stat;

public class Personnages implements Stat {

	private int vie ;
	private int force;
	private String nom;
	
	/**
	 * création de personnage
	 * @param vie
	 * @param force
	 * @param nom
	 */
	public Personnages(int vie, int force, String nom) {
		super();
		this.vie = vie;
		this.force = force;
		this.nom = nom;
	}

	
	
	
	//--------------------------set and get------------------------
	public int getVie() {
		return vie;
	}

	public void setVie(int vie) {
		this.vie = vie;
	}

	public int getForce() {
		return force;
	}

	public void setForce(int force) {
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}




	@Override
	public String toString() {
		return "Personnage : " + nom +", vie=" + vie + ", force=" + force +"\n";
	}
	
	
}

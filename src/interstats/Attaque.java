package interstats;



public class Attaque implements Iattaque {

	private int degat;
    private String nom;
    private int chance;
	
	public Attaque(int degat, String nom) {
		super();
		this.degat = degat;
		this.nom = nom;
	}

	/**
	 * l'attaque sera raté ou reussit ou coup critique 
	 * selon le random chance
	 */
	@Override
	public int lancerAttaque() {

        // Génère un nombre aléatoire à virgule entre 0 e
		chance = (int) Math.floor(Math.random()*(11-1));

		// TODO Auto-generated method stub
		if(chance<=1) {
			echecCritique(degat);
			return this.degat;
		}else if(chance >= 9){
			coupCritique(degat);
			return this.degat;
		}else {
			System.out.println("degat " + degat);
			return this.degat;
		}
		
	}

	@Override
	public void setDegats(int degats) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * degat multiplier par 2
	 */
	@Override
	public void coupCritique(int degat) {
		// TODO Auto-generated method stub
				this.degat = this.degat*2;
				System.out.println("coup critique, x2");

	}
	/**
	 * degat = 0
	 */
	@Override
	public void echecCritique(int degat) {
		// TODO Auto-generated method stub
		System.out.println("echec critique");
		this.degat = 0;
		
	}

	@Override
	public String getNom() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public int getDegats() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setNom(String nom) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return "["+" nom=" + nom + ", degat=" + degat + "]";
	}

	
}

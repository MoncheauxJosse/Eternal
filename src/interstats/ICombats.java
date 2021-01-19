package interstats;

public interface ICombats {

	/**
	 * 
	 * @param adversaire peuvent attaquer
	 */
	
	 public void attaquer(ICombats adversaire);
	 
	 /**
	  * 
	  * @param degats peut etre defendu
	  */
	   public void defendre(int degats);

	
	/**
	 * tous les avatars ont de la vie
	 */
	public int getVie();
	
	/**
	 * tous les avatars on une force
	 */
	public int getForce();
	
	/**
	 * tout les avatars ont un nom
	 */
	public String getNom();
	public void setNom(String nom);
	public void setForce(int force);
	public void setVie(int vie);
		
	
}
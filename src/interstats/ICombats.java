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
	public static void getVie(){
		
	}
	
	/**
	 * tous les avatars on une force
	 */
	public static void getForce(){
		
}
	
	/**
	 * tout les avatars ont un nom
	 */
	public static void getNom(){
	}
}
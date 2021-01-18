package run;

import java.util.Scanner;
import avatars.Personnages;
public class Lancement {
	
	private Personnages heros ;
	private String nom;
	private int force;
	private int vie;
	 
	
	public Lancement() {
		lancement();
	}
	
/**
 * methode qui lance la création du personnage et demande les informations
 * verifie aussi si l'information est remplie
 */
	public void lancement() {
		try ( Scanner scanner = new Scanner( System.in ) ) {
			
			System.out.println( "créé votre personage !" );
            while( true ) {
            	
            	System.out.println( "écrivez votre nom " );
                this.nom = scanner.nextLine();
                
                System.out.println( "votre force " );
                this.force = scanner.nextInt();
                
                System.out.println( "votre vie " );
                this.vie = scanner.nextInt();
                
                // condition avec nom ne fonctione pas !
                	if ( this.force != 0 && this.vie != 0 && !nom.equals(null)) {
                		this.heros = new Personnages(this.vie,this.force,this.nom);
                		break;
                	}else {
                		System.out.println( "les champs remplies ne sont pas acceptés " );
                	
                	}
            }
            
            System.out.println( "personnage créé" );
            System.out.println(heros);
	}
		
		
		
		
	}

	public Personnages getHeros() {
		return heros;
	}

	public void setHeros(Personnages heros) {
		this.heros = heros;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getForce() {
		return force;
	}

	public void setForce(int force) {
		this.force = force;
	}

	public int getVie() {
		return vie;
	}

	public void setVie(int vie) {
		this.vie = vie;
	}

}

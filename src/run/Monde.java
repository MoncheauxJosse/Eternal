package run;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import avatars.Personnages;
public class Monde {
	
	private Personnages heros ;
	private String nom;
	private int force;
	private int vie;
	private List<Personnages> personne  = new ArrayList<>();
	
	public Monde() {
		lancement();
	}
	
/**
 * methode qui lance la création du personnage et demande les informations
 * verifie aussi si l'information est remplie
 */
	public void lancement() {
		try ( Scanner scanner = new Scanner( System.in ) ) {
			
			System.out.println( "créé le nombre de personnage !" );
			
			 int nombre = scanner.nextInt();
			
			for(int i = 1; i <=nombre ; i++) {
            while( true ) {
            	
            	System.out.println( "écrivez votre nom " );
                this.nom = scanner.nextLine();
                	
                	if (nom.equals("")) {
                		this.nom = scanner.nextLine();
                		}
                
                System.out.println( "votre force " );
                this.force = scanner.nextInt();
                
                System.out.println( "votre vie " );
                this.vie = scanner.nextInt();
                
                // si il n'y a pas 0 dans les stat et pas de vide dans le nom
                	if ( this.force != 0 && this.vie != 0 && !nom.equals("")) {
                		this.heros = new Personnages(this.vie,this.force,this.nom);
                		break;
                	}else {
                		System.out.println( "les champs remplies ne sont pas acceptés " );
                	
                	}
            }
            
            this.personne.add(this.heros);
			}
			System.out.println( personne );
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

	public List<Personnages> getPersonne() {
		return personne;
	}

	public void setPersonne(List<Personnages> personne) {
		this.personne = personne;
	}

	@Override
	public String toString() {
		return "Monde personnage=" + personne ;
	}
	

}

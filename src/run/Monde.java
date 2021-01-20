package run;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Classe.Class;
import avatars.Monstre;
import avatars.Personnages;
public class Monde {

	private Monstre monstre ;
	private List <Monstre> monstres = new ArrayList<>();
	private Personnages heros ;
	private String nom;
	private int force;
	private int vie;
	private int type;
	private List<Personnages> personne  = new ArrayList<>();
	private Boolean turn =true;
	private int classe;

	public Monde() {
		lancement();
		usine();
		combat();
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

					System.out.println( "votre type : feu=1, lumiere=2, eau=3, tenebre=4, terre=5, air=6 " );
					this.type = scanner.nextInt();
					//"Dev", "ScrumMaster", "ProductOwner", "adminsystem", "architecte"
					System.out.println( "votre classe : Dev=1, ScrumMaster=2, ProductOwner=3, adminsystem=4, architecte=5" );
					this.classe = scanner.nextInt();
					
					// si il n'y a pas 0 dans les stat et pas de vide dans le nom
					if ( this.force != 0 && this.vie != 0 && !nom.equals("")) {
						Class c = new Class(this.classe,this.type);
						
						this.heros = new Personnages(this.nom,this.vie,this.force,this.type,c);
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
	
	public void usine(){
	    // Creer un string pour le nom de votre monstre
	    // Creer une instance Monstre avec sont constructeur complet
	    // retourner le monstre
		
		String [] motDebut = { " blop" , " araignée"," esprit", " loup", " demon" ," Dragon"};
		String [] motFin = { "-volcan"," de lumiére","-aquatique" ,"-mortel" , "-terrest", "-Tempest",};
		 int index = (int) Math.floor(Math.random()*(7-1) + 1)-1;
		 int index2 = (int) Math.floor(Math.random()*(7-1) + 1)-1;
		 
		 String name = motDebut[index] + motFin[index2];
		 
		  Monstre m = new Monstre(name,3*(index+1),(index*2)+index2+1,index2+1);
		  
		  monstre = m ;
		  
		 System.out.println(m);
		 
	}
	/**
	 * Lancement du combat multiple via les personnage et le monstre 
	 * retourn le resulta etape par etape
	 * le monstre combat un personnage et si il tue le premier heros alor
	 * il passe au suivant
	 */
	public void combat()
	{
		for (Personnages heros : this.personne) 
			
		{
			
				while(heros.getVie() >0 && this.monstre.getVie() > 0) {
					
					if (this.turn == true) {
						
				      heros.attaquer(this.monstre);
				      turn = false;
				      
				    }
				    else {
				    	this.monstre.attaquer(heros);
				        turn = true;
				        
				    }
					
					
				}
			
		}
	}
	
	public void essai() {
		
		System.out.println(this.personne);
		
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

	
	public Monstre getMonstre() {
		return monstre;
	}

	public void setMonstre(Monstre monstre) {
		this.monstre = monstre;
	}

	public List<Monstre> getMonstres() {
		return monstres;
	}

	public void setMonstres(List<Monstre> monstres) {
		this.monstres = monstres;
	}

	
	public Boolean getTurn() {
		return turn;
	}

	public void setTurn(Boolean turn) {
		this.turn = turn;
	}
	
	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Monde personnage=" + personne ;
	}


	
	
}

package interstats;

import java.util.List;

public abstract class Combatant implements ICombats {
	
	private String type;
	private int vie ;
	private int force;
	private String nom;
	private Attaque n;
	private List <String> types = List.of("feu", "lumiere", "eau", "tenebre", "terre", "air");
	
	/**
	 * Constructeur prenant un int en type
	 * @param nom
	 * @param vie
	 * @param force
	 * @param type
	 */
        public Combatant(String nom, int vie, int force, int type){
            this.vie = vie;
            this.force = force;
            this.nom = nom ;
            this.type = choixType(type);
        }
        
        /**
         * prend le int choix et le relit a la list de string
         * por sortir le type en string
         * @param choix
         * @return
         */
        public String choixType(int choix) {
        	
        	String element = types.get(choix-1);
        	
        	return  element;
        }
        /**
         * Method pour que le combatant attauque
         * creer une attaque en prenant la force du combatant 
         * puis lance la methode lanceattaque qui se trouve dans attaque pour calculer
         * la chance de reussite , coup critique ou echec critique 
         * puis ajoute au degat 
         * et entre dans la methode defense
         */
        public void attaquer(ICombats adversaire) {
            System.out.println(this.getNom() + " attaque " + adversaire.getNom() );
            n =new Attaque(this.getForce(),"basic");
            int degat = n.lancerAttaque();
            adversaire.defendre(degat);
            System.out.println("Il reste à " + adversaire.getNom() + " : " + adversaire.getVie() + " pdv");
        }

        /**
         * reduit la vie en fonction des degat recue
         */
        public void defendre(int degats) {
            this.setVie(this.getVie() - degats);
        }

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

		
		public String getType() {
			return type;
		}


		public void setType(String type) {
			this.type = type;
		}

		

		public List<String> getTypes() {
			return types;
		}

		public void setTypes(List<String> types) {
			this.types = types;
		}

		@Override
		public String toString() {
			return "Combatant [ nom=" + nom +", vie=" + vie + ", force=" + force + ", type="+type+"]";
		}
        
        
}
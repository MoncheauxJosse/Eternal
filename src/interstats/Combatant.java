package interstats;
import interstats.Attaque;
public abstract class Combatant implements ICombats {
	
	private int vie ;
	private int force;
	private String nom;
	private Attaque n;

        public Combatant(String nom, int vie, int force){
            this.vie = vie;
            this.force = force;
            this.nom = nom ;
        }
        
        
        public void attaquer(ICombats adversaire) {
            System.out.println(this.getNom() + " attaque " + adversaire.getNom() );
            n =new Attaque(this.getForce(),"basic");
            int degat = n.lancerAttaque();
            adversaire.defendre(degat);
            System.out.println("Il reste à " + adversaire.getNom() + " : " + adversaire.getVie() + " pdv");
        }

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

		@Override
		public String toString() {
			return "Combatant [vie=" + vie + ", force=" + force + ", nom=" + nom + "]";
		}
        
        
}
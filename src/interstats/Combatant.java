package interstats;

public abstract class Combatant {
	
	private int vie ;
	private int force;
	private String nom;

        public Combatant(String nom, int vie, int force){
            this.vie = vie;
            this.force = force;
            this.nom = nom ;
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
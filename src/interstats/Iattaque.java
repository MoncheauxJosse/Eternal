package interstats;

public interface Iattaque {
	
	
    public int lancerAttaque();

  
    // Chance de toucher (entre 0 et 10)
    //si audessu coup critique
    //si en dessous de 10 echaec critique
    public void setDegats(int degats);
    public void coupCritique(int degat);
    public void echecCritique(int degat);
    // Getters et Setters
    public String getNom();
    public double getChanceToucher();
    public int getDegats();
    public void setNom(String nom);
    
}


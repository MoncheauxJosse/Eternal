package Classe;
import java.util.ArrayList;
import java.util.List;

import interstats.Attaque;

public class Class {
	private String nom;
	private List<Attaque> attaques = new ArrayList<>();
	private int type ;
	private List<String> types = new ArrayList<>();
	
	
	public Class(String nom, List<Attaque> attaques, int type, List<String> types) {
		super();
		this.nom = nom;
		this.attaques = attaques;
		this.type = type;
		this.types = types;
	}
	
	
	
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public List<Attaque> getAttaques() {
		return attaques;
	}
	public void setAttaques(List<Attaque> attaques) {
		this.attaques = attaques;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public List<String> getTypes() {
		return types;
	}
	public void setTypes(List<String> types) {
		this.types = types;
	}
	
	
}

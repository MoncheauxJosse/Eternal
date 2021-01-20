package Classe;
import java.util.ArrayList;
import java.util.List;

import interstats.Attaque;
import interstats.Iattaque;

public class Class {
	private List<String> nomClass= List.of("Dev", "ScrumMaster", "ProductOwner", "adminsystem", "architecte");
	private List<Iattaque> attaques = new ArrayList<>();
	private String classeChoisie ;
	private int type ;
	private List<String> types = new ArrayList<>();
	private Attaque attaque;
	
	public Class(int choixClass, int type) {
			this.classeChoisie = choixClasse(choixClass);
			this.type = type;
			this.attaques = liéAttaque(type);
			}
	
	public String choixClasse(int choix) {
    	
    	String element = nomClass.get(choix-1);
    	
    	return  element;
    }
	public List<Iattaque> liéAttaque(int choixClass) {
		if (choixClass==1) {
			
			this.attaques.add(attaque = new Attaque(2,"coup de clavier"));
			this.attaques.add(attaque = new Attaque(4,"nullExecption"));
		}
		return  this.attaques;
	}

	public List<String> getNomClass() {
		return nomClass;
	}

	public void setNomClass(List<String> nomClass) {
		this.nomClass = nomClass;
	}

	public List<Iattaque> getAttaques() {
		return attaques;
	}

	public void setAttaques(List<Iattaque> attaques) {
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

	public String getClasseChoisie() {
		return classeChoisie;
	}

	public void setClasseChoisie(String classeChoisie) {
		this.classeChoisie = classeChoisie;
	}

	@Override
	public String toString() {
		return    classeChoisie +", attaques=" + attaques +", types=" + types + "]";
	}
	
	
	
	
}

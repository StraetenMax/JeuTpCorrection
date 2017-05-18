package cnam;

public class PersonnageJoueur extends Personnage {
	//propriété
	private String nom;
	
	//constructeurs vide et initialisé
	public PersonnageJoueur(){
		super();
		nom = "";
		System.out.println("Création d'un personnage");			
	}
	
	public PersonnageJoueur(String cRace, int cTaille, int cPoids, String cNom){
		super(cRace, cTaille, cPoids);
		nom = cNom;
		System.out.println("Création d'un personnage initialisé");
	}
	
	//méthodes
	public void marche(){
		System.out.println("le personnageJoueur est entrain de marcher");
	}	
	public String description(){
		String pers = super.description()+", "+ this.getNom()+" est le nom";
		return pers;
	}
	
	
	//accesseur et mutateur
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	


}

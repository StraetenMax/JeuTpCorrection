package cnam;

public class Personnage {
	//propriétés
	private String race;
	private int taille;
	private int poids;
	
	//constructeurs vide et initialisé
	public Personnage(){
		race = "";
		taille = 0;
		poids = 0;
		System.out.println("Création d'un personnage");
				
	}
	
	public Personnage( String cRace, int cTaille, int cPoids){
		System.out.println("Création d'un personnage initialisé");
			race = cRace;
			taille = cTaille;
			poids = cPoids;
	}
	
	//accesseurs et mutateurs	
	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public int getTaille() {
		return taille;
	}


	public int getPoids() {
		return poids;
	}

	public void setPoids(int poids) {
		this.poids = poids;
	}
	public void setTaille(int taille) {
		this.taille = taille;
	}
	
	//méthodes
	public void personnageMarche(){
		 System.out.println("le personnage est entrain de marcher"); 	
	}
	public void personnageDormir(){
		System.out.println("le personnage est entrain de dormir");
	}
	public String description(){
		String pers = this.getRace()+" est la race, "+this.getTaille()+" m la taille, "+this.getPoids()+" kg le poids";
		return pers;
	}
}

	
package cnam;

public class PersonnageJoueurMedecin extends PersonnageJoueur {
	//propriétés
	private int nbMedicaments;
	
	//constructeur vide et initialisé
	public PersonnageJoueurMedecin(){
		super();
		nbMedicaments = 0;
	}
	public PersonnageJoueurMedecin(String cRace, int cTaille, int cPoids, String cNom, int cNbMedicaments){
		super(cRace,cTaille,cPoids,cNom);
		nbMedicaments =cNbMedicaments;	
	}
	
	//accesseur et mutateur
	
	
}

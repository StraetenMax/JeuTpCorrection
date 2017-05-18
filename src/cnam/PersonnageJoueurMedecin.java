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
	public int getNbMedicaments(){
		return nbMedicaments;
	}
	public void setNbMedicaments(int yNbMedicaments){
		nbMedicaments = yNbMedicaments;
	}
	
	//méthodes
	public String description(){
		String str = super.description()+this.getNbMedicaments()+" est nbMedicaments.";
		return str;
	}
	public boolean estPlusGrandQue(PersonnageJoueurMedecin str2){
		boolean str1;
		if(str2.getTaille()<this.getTaille()){
			str1 = true;
		}else{
			str1 = false;
		}
		return str1;
	}
	
	
}

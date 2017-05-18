package cnam;

public class TestPersonnage {

	public static void main(String[] args) {
		Personnage p = new Personnage();
		Personnage p1 = new Personnage("humain", 30, 120);
		System.out.println(p1.description());
		PersonnageJoueur per1 = new PersonnageJoueur();
		PersonnageJoueur per2 = new PersonnageJoueur("homme",20, 150, "Pierre");
		System.out.println(per2.description());
		
        //Intancier les classes
		Personnage P1 = new Personnage("Humain", 180, 75);
		PersonnageJoueur PJ1 = new PersonnageJoueur("Nain", 100, 90,"X");
		PersonnageJoueurGuerrier PJG1 = new PersonnageJoueurGuerrier("Orc", 200,180,"X", 40, 100,true);
		PersonnageJoueurGuerrier PJG2 = new PersonnageJoueurGuerrier("Elfe", 190, 90,"X", 25, 100,true);

		PersonnageJoueurMedecin PJM1 = new PersonnageJoueurMedecin("Humain", 175, 65,"X", 20);
		PersonnageJoueurMedecin PJM2 = new PersonnageJoueurMedecin("Elfe", 185, 80, "X", 26);
		
		
		
		
        //appeler les méthodes
		System.out.println(P1.description());
		System.out.println(PJ1.description());
		System.out.println(PJG1.description());
		
		System.out.println(PJG2.description());
		System.out.println(PJM1.description());
		System.out.println(PJM2.description());
		
		
		System.out.println(PJG1.estMoinsFortQue(PJG2));
		System.out.println(PJM1.estPlusGrandQue(PJM2));
		 

	
	
	
	
	
	}

}

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
		PersonnageJoueur PJ1 = new PersonnageJoueur("Nain", 100, 90, 30, 100);
		PersonnageJoueurGuerrier PJG1 = new PersonnageJoueurGuerrier("Orc", 200,180,"", 40, 100);
		PersonnageJoueurGuerrier PJG2 = new PersonnageJoueurGuerrier("Elfe", 190, 90,""; 25, 100);

		PersonnageJoueurMedecin PJM1 = new vec une race "Humain", 175, 65, 20);
		PersonnageJoueurMedecin PJM2 = new une race "Elfe"", une taille de 185, un poids de 80, un nombre de médicaments de 26
		
		
		
		
        //appeler les méthodes
		System.out.println(P1.description());
		System.out.println(PJ1.description());
		System.out.println(PJG1.description());
		
		System.out.println(PJG1.estMoinsFortQue(PJG2));
		System.out.println(PJM1.plusGrandQue(PJM2));
		 

	
	
	
	
	
	}

}

package cnam;

public class TestPersonnage {

	public static void main(String[] args) {
		Personnage p = new Personnage();
		Personnage p1 = new Personnage("humain", 30, 120);
		System.out.println(p1.description());
		PersonnageJoueur per1 = new PersonnageJoueur();
		PersonnageJoueur per2 = new PersonnageJoueur("homme",20, 150, "Pierre");
		System.out.println(per2.description());
		
	}

}

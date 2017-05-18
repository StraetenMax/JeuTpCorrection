package cnam;


public class PersonnageJoueurGuerrier extends PersonnageJoueur{
		//propriétés
		private int force;
		private int niveauEnergie;
		private boolean fatigue;
		
		//constructeurs vide et initialisé
		public PersonnageJoueurGuerrier(){
			super();
			force = 0;
			niveauEnergie = 0;
			fatigue = true;	
		}
		
		public PersonnageJoueurGuerrier(String cRace, int cTaille, int cPoids, String cNom, int cForce, int cNiveauEnergie, boolean cFatigue){
			super(cRace, cTaille, cPoids, cNom);
			force = cForce;
			niveauEnergie = cNiveauEnergie;
			fatigue = cFatigue;	
		}

		//accesseurs et mutateurs
		public int getForce() {
			return force;
		}
		public void setForce(int force) {
			this.force = force;
		}
		public int getNiveauEnergie() {
			return niveauEnergie;
		}

		public void setNiveauEnergie(int niveauEnergie) {
			this.niveauEnergie = niveauEnergie;
		}
		public boolean getFatigue() {
			return fatigue;
		}
		public void setFatigue(boolean fatigue) {
			this.fatigue = fatigue;
		}
		
		//méthodes
		public boolean estMoinsFortQue(PersonnageJoueurGuerrier pJG1){
			 boolean pJGEs;
			if(pJG1.getForce()< this.getForce()){
				pJGEs = true;
			}else{
				pJGEs = false;
			}
			return pJGEs;
		}
		public String description(){
			String str =super.description()+", "+this.getForce()+" est la force";
			return str;
		}
		
}

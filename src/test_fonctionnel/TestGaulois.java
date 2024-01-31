package test_fonctionnel;

import personnages.*;


public class TestGaulois {

	public static void main(String[] args) {
		
		Gaulois Vercingétorix = new Gaulois("Vercingétorix", 5);
		
		Village village = new Village(Vercingétorix);
		
		Soldat minus = new Soldat("Minus", 6, Grade.SOLDAT);
		
		Camp camp = new Camp(minus);
		
		
		village.ajouterGaulois(new Gaulois("Agecanonix", 1));
		village.ajouterGaulois(new Gaulois("Assurancetourix", 2));
		village.ajouterGaulois(new Gaulois("Astérix", 5));
		village.ajouterGaulois(new Gaulois("Obelix", 15));
		village.ajouterGaulois(new Gaulois("Prolix", 2));
		
		
		camp.ajouterSoldat(new Soldat("Brutus", 5, Grade.CENTURION));
		camp.ajouterSoldat(new Soldat("Milexcus", 6, Grade.SOLDAT));
		camp.ajouterSoldat(new Soldat("Tullius Octopus", 2, Grade.TESSERARIUS));
		camp.ajouterSoldat(new Soldat("Ballondebaudrus", 3, Grade.OPTIO));
		
		village.afficherVillage();
		camp.afficherCamp();
		
		Gaulois Abraracourcix = new Gaulois("Abraracourcix", 5);
		Soldat Briseradius = new Soldat("Briseradius",4,Grade.SOLDAT);
		Soldat Chorus = new Soldat ("Chorus",4,Grade.CENTURION);
		
		village.changerChef(Abraracourcix);
		camp.changerCommandant(Briseradius);
		camp.changerCommandant(Chorus);
		
	}

}

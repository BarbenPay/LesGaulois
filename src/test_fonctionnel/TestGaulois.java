package test_fonctionnel;

import personnages.*;


public class TestGaulois {

	public static void main(String[] args) {
		
		Gaulois Vercingetorix = new Gaulois("Vercingétorix", 5);
		
		Village village = new Village(Vercingetorix);
		
		Soldat minus = new Soldat("Minus", 6, Grade.SOLDAT);
		
		Camp camp = new Camp(minus);
		
		
		village.ajouterGaulois(new Gaulois("Agecanonix", 1));
		village.ajouterGaulois(new Gaulois("Assurancetourix", 2));
		village.ajouterGaulois(new Gaulois("Asterix", 5));
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


		minus.useEquipment(Equipement.CASQUE);
		minus.useEquipment(Equipement.PLASTRON);
		minus.useEquipment(Equipement.BOUCLIER);


		Druide Panoramix =  new Druide("Panoramix",1);
		village.ajouterGaulois(Panoramix);
		Panoramix.fabriquerPotion(3);
		Panoramix.donnerPotion(village.getGaulois("Asterix"));
		Panoramix.donnerPotion(village.getGaulois("Obelix"));
		Panoramix.donnerPotion(village.getGaulois("Assurancetourix"));
		Panoramix.donnerPotion(Abraracourcix);
		Panoramix.donnerPotion(village.getGaulois("Agecanonix"));

		village.getGaulois("Asterix").parler(" Bonjour à tous ");
		minus.parler("UN GAU... UN GAUGAU...");
		while(!village.getGaulois("Asterix").isPersonnageKnockedOut() && !minus.isPersonnageKnockedOut()){
			village.getGaulois("Asterix").frapper(minus);
			minus.frapper(village.getGaulois("Asterix"));
		}








		
	}

}

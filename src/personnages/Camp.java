package personnages;

public class Camp {
	
	private Soldat commandant;
	
	private Soldat[] soldats;
	
	private int nbSoldat;
	
	public Camp(Soldat commandant) {
		
		this.commandant = commandant;
		
		soldats = new Soldat[3];
		
		nbSoldat = 0;
		
	}

	public Soldat getCommandant() {
		return commandant;
	}
	
	public void ajouterSoldat(Soldat soldat) {
		if(nbSoldat != soldats.length) {
			soldats[nbSoldat]=soldat;
			nbSoldat++;
			soldat.parler("Je mets mon epee au service de Rome dans le camp dirige par " + this.getCommandant().getName());
		
		}else {
			this.getCommandant().parler("Desole " + soldat.getName()+" notre camp est complet !");
		}
	}
	
	public void afficherCamp() {
		System.out.println("Le camp dirige par " + this.getCommandant().getName() + " contient les soldats:");
		for(int i = 0; i<nbSoldat;i++) {
			System.out.println(soldats[i].getName());
		}
	}
	
	public void changerCommandant ( Soldat soldat) {
		if (soldat. getGrade().equals(Grade.CENTURION)) {
			this.commandant = soldat;
			soldat.parler("Moi " + soldat.getName() + " je prends la direction du camp romain.");
			
		}else {
			soldat.parler("Je ne suis pas suffisament grade pour prendre la direction du camp romain.");
		}
	}

}

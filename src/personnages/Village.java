package personnages;


public class Village {

	private Gaulois chef;
	
	private Gaulois[] villageGaulois;
	
	private int nbVillageois;
	
	public Village(Gaulois chef) {
		
		this.chef = chef;
		
		villageGaulois = new Gaulois[4];
		
		nbVillageois = 0;
		
	}

	public Gaulois getChef() {
		return chef;
	}
	
	public void ajouterGaulois(Gaulois gaulois) {
		if(nbVillageois != villageGaulois.length) {
		villageGaulois[nbVillageois] = gaulois;
		nbVillageois++;
		
		this.getChef().parler("Bienvenue " + gaulois.getName() + " !");
		
		}else{
			
			this.getChef().parler("Désolé " + gaulois.getName() + " mon village est déjà bien rempli.");
			
		}
	}
	
	public void afficherVillage() {
		System.out.println("Le village de " + this.getChef().getName() + " est habité par:");
		for(int i = 0; i<nbVillageois;i++) {
			System.out.println(villageGaulois[i].getName());
		}
	}
	
	
}

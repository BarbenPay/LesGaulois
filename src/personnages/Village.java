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
			
			this.getChef().parler("Desole " + gaulois.getName() + " mon village est deja bien rempli.");
			
		}
	}
	
	public void afficherVillage() {
		System.out.println("Le village de " + this.getChef().getName() + " est habite par:");
		for(int i = 0; i<nbVillageois;i++) {
			System.out.println(villageGaulois[i].getName());
		}
	}
	
	public void changerChef(Gaulois gaulois) {
		chef.parler("Je laisse mon grand bouclier au grand " + gaulois.getName());
		gaulois.parler("Merci !");
		this.chef = gaulois;
	}

	public Gaulois getGaulois(String name){
		for(int i = 0; i < nbVillageois; i++){
			if(this.villageGaulois[i].getName().equals(name)){
				return this.villageGaulois[i];
			}
		}
		return null;
	}
	
	
}

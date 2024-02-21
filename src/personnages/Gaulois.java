package personnages;

public class Gaulois extends Personnage{

	private int tempStrength = 0;
	
	public Gaulois(String name, int strength) {
		
		super(name,strength);
		
	}
	
	public String getAuteur() {
		
		return "gaulois";
		
	}

	public void frapper(Personnage personnage) {

		int force = (this.getStrength() * this.getTempStrength());

		System.out.println("Le " + this.getAuteur() + " " + this.getName() + " envoie un grand coup de force " + force + " au " + personnage.getAuteur()+ " " +personnage.getName() + ".");
		personnage.recevoirCoup(force);

	}

	public void setTempStrength(int value){
		this.tempStrength = value;
	}

	public int getTempStrength(){
		return this.tempStrength;
	}
	
}

	

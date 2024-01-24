package personnages;

public abstract class Personnage {
	
	private String name;
	
	private int strength;
	
	protected Personnage(String name, int strength){
		
		this.name = name;
		this.strength = strength;
		
	}
	
	public String getName() {
		
		return name;
		
	}
	
	public void parler(String sentenceToWrite) {
		
		System.out.println("Le "+ getAuteur()+" " + this.getName() + " : \"" + sentenceToWrite + "\"");
		
	}
	
	public abstract String getAuteur();
	
	public void frapper(Personnage personnage) {
		
		System.out.println("Le " + this.getAuteur() + " " + this.getName() + " envoie un grand coup dans la mâchoire du " + personnage.getAuteur()+ " " +personnage.getName() + ".");
		personnage.recevoirCoup(this.strength/3);
		
	}
	
	public void recevoirCoup(int hitValue) {
		strength -= hitValue;
		if(strength > 0) {
			this.parler("Aïe !");
		}else {
			strength = 0;
			this.parler("J’abandonne…");
		}
	}
	
	


}

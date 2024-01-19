package personnages;

public class Romain {
	
	private String name;
	
	private int strength;
	
	public Romain(String name, int strength) {
		
		this.name = name;
		
		this.strength = strength;
		
	}
	
	public String getName(){
		return(name);
	}
	
	public void parler(String sentenceToWrite){
		
		System.out.println("Le romain " + this.getName() + " : \"" + sentenceToWrite + "\"");
		
	}
	
	public void recevoirCoup(int valeur_coup) {
		strength -= valeur_coup;
		if(strength > 0) {
			this.parler("Aïe !");
		}else {
			strength = 0;
			this.parler("J’abandonne…");
		}
	}
}

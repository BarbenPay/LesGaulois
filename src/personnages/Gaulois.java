package personnages;

public class Gaulois {

	private String name;
	
	private int strength;
	
	public Gaulois(String name, int strength) {
		
		this.name = name;
		
		this.strength = strength;
		
	}
	
	public String getName(){
		return(name);
	}
	
	public void parler(String sentenceToWrite){
		
		System.out.println("Le gaulois " + this.getName() + " : \"" + sentenceToWrite + "\"");
		
	}
	
	public void frapper(Romain romain) {
		
		System.out.println(this.getName() + " envoie un grand coup dans la mâchoire de " + romain.getName() + ".");
		romain.recevoirCoup(this.strength/3);
		
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		
		Gaulois asterix = new Gaulois("Astérix", 8);
		
		System.out.println(asterix.getName());
		
	}
	
}

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
	
	
	
	
	
	
	public static void main(String[] args) {
		
		Gaulois asterix = new Gaulois("Astérix", 8);
		
		System.out.println(asterix.getName());
		
	}
	
}

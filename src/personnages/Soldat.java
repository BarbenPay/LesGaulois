package personnages;


public class Soldat extends Romain{
	
	Grade grade;
	
	public Soldat(String name, int strength,Grade grade) {
		
		super(name,strength);
		this.grade = grade;
		
	}
}


package personnages;


import java.util.Arrays;

public class Soldat extends Romain{
	
	private final Grade grade;

	private boolean[] equipmentUsed = new boolean[3];
	
	public Soldat(String name, int strength,Grade grade) {
		
		super(name,strength);
		this.grade = grade;

        Arrays.fill(equipmentUsed, false);
		
	}

	public void useEquipment(Equipement equipement){
		switch (equipement){
            case CASQUE -> {
                equipmentUsed[0] = true;
                System.out.println("Le " + grade + " " + this.getName() + " s'equipe avec un " + Equipement.CASQUE);
            }
			case PLASTRON -> {
				equipmentUsed[1] = true;
				System.out.println("Le " + grade + " " + this.getName() + " s'equipe avec un " + Equipement.PLASTRON);
			}
			case BOUCLIER -> {
				equipmentUsed[2] = true;
				System.out.println("Le " + grade + " " + this.getName() + " s'equipe avec un " + Equipement.BOUCLIER);
			}
		}
	}

	public Grade getGrade(){
		return grade;
	}

	@Override
	public void recevoirCoup(int hitValue) {

		if (equipmentUsed[0]) {
			System.out.println("Le casque absorbe 2 du coup");
			hitValue -= 2;
		}if (equipmentUsed[1]){
			System.out.println("Le plastron absorbe 3 du coup");
			hitValue -= 3;
		}if (equipmentUsed[2]){
			System.out.println("Le bouclier absorbe 3 du coup");
			hitValue -= 3;
		}

		if(hitValue < 0){ hitValue = 0;}

		this.setStrength(this.getStrength() - hitValue);
		if(this.getStrength() > 0) {
			this.parler("Aïe !");
		}else {
			this.setStrength(0);
			this.parler("J’abandonne…");
		}
	}
}


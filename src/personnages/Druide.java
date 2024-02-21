package personnages;
import java.util.Random;



public class Druide extends Gaulois{
	
	private Potion[] stockPotion;
	private int nbrePotionStockee;
	
	private Random r = new Random();
	
	public Druide(String name, int strength) {
		super(name,strength);
		stockPotion = new Potion[10];
		nbrePotionStockee = 0;
	}
	
	public void fabriquerPotion(int numberOfPotion) {
		
		if(nbrePotionStockee + numberOfPotion <= stockPotion.length) {

			
			int force = r.nextInt(5) +2;
			stockPotion[ nbrePotionStockee] = new Potion(force, numberOfPotion);
			nbrePotionStockee++;
			this.parler("J'ai concocté " + numberOfPotion + " doses de potion magique. Elle a une force de " + force + ".");
		}
		
	}

	public void donnerPotion(Gaulois gaulois){

		if (gaulois.getName().equals("Obelix")){
			this.parler("Non, Obélix Non !... Et tu le sais très bien !");
		}else{
			if (nbrePotionStockee != 0){
				gaulois.setTempStrength(this.stockPotion[nbrePotionStockee-1].usePotionAndGetStrength());
				if (this.stockPotion[nbrePotionStockee-1].getQuantity() == 0){
					nbrePotionStockee -=1;
				}
				this.parler("Tiens " + gaulois.getName() + " un peu de potion magique.");
			}else{
				this.parler("Desole "+ gaulois.getName() + " il n'y a plus une seule goutte de potion magique.");
			}
		}

	}

}

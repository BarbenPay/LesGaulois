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
			
			stockPotion[nbrePotionStockee] = new Potion(force,numberOfPotion); 
			
			
			
		}
		
	}

}

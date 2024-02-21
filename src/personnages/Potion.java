package personnages;

public class Potion {
	
	private int strength;
	private int quantity;
	
	public Potion(int strength, int quantity) {
		this.strength = strength;
		this.quantity = quantity;
	}

	public int usePotionAndGetStrength(){
		if (this.quantity != 0) {
			this.quantity -= 1;
			return this.strength;
		}
		return -1;
	}

	public int getQuantity(){
		return quantity;
	}

}

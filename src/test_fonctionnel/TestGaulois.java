package test_fonctionnel;

import personnages.Gaulois;
import personnages.Romain;

public class TestGaulois {

	public static void main(String[] args) {
		
		Gaulois asterix = new Gaulois("Astérix", 8);
		
		System.out.println(asterix.getName());
		
		asterix.parler("Salut tout le monde");
		
		Romain minus = new Romain("Minus", 6);
		
		minus.parler("UN GAU… UN GAUGAU…");
		
		/*for(int  i = 0; i < 2; i++) {
			minus.recevoirCoup(3);
		}*/
		
		asterix.frapper(minus);
		minus.frapper(asterix);
		asterix.frapper(minus);
		minus.frapper(asterix);
		asterix.frapper(minus);
	}

}

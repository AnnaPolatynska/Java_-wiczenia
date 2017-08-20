package J53;
//J53
/*Napisz program sk³adaj¹cy siê przynajmniej z dwóch klas. Który bêdzie imitowa³ kase fiskaln¹.  
* Sprzedawanie produktów 
*Wydruk zakupionych produktów wraz z cenami 
* Suma któr¹ trzeba zap³aciæ.  
 */

import java.util.HashMap;
import java.util.Scanner;

public class produkty {
	Scanner rl = new Scanner(System.in);
	HashMap<String, Double> mapa = new HashMap<String, Double>();
	
	produkty(){
		mapa.put("chleb", 1.23);
		mapa.put("mleko", 2.99);
	}
	public double oblicz(){
		float sum = 0;
		System.out.println("Podaj nazwê produktu: ");
		String rr = rl.nextLine();		
		while( (!rr.equals("end")) && (!rr.equals("END")) ){
			if(mapa.containsKey(rr)){
				sum += mapa.get(rr);
			} else {
				System.out.println("Z³a nazwa produktu: ");
			}
			rr = rl.nextLine();
		}
		System.out.println("Cena za twoje zakupy: " + sum + "z³");
		rl.close();
		return sum;
	}
}
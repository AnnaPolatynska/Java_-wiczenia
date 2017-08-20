package J53;
//J53
/*Napisz program sk�adaj�cy si� przynajmniej z dw�ch klas. Kt�ry b�dzie imitowa� kase fiskaln�.  
* Sprzedawanie produkt�w 
*Wydruk zakupionych produkt�w wraz z cenami 
* Suma kt�r� trzeba zap�aci�.  
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
		System.out.println("Podaj nazw� produktu: ");
		String rr = rl.nextLine();		
		while( (!rr.equals("end")) && (!rr.equals("END")) ){
			if(mapa.containsKey(rr)){
				sum += mapa.get(rr);
			} else {
				System.out.println("Z�a nazwa produktu: ");
			}
			rr = rl.nextLine();
		}
		System.out.println("Cena za twoje zakupy: " + sum + "z�");
		rl.close();
		return sum;
	}
}
package Sekwencje;
//J 50 i J51
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
//J 50
/*Napisz program kt�ry b�dzie wy�wietla� cen� produktu w zale�no�ci od podanej nazwy produktu. 
* I b�dzie sumowa� zakupione towary. Do czasu a� u�ytkownik wpisz� s�owo �koniec� po czym wy�wietli sum� do zap�aty.  
* Produkty: Mleko, jajka, chleb, m�ka, cukier, bu�ki, pomidory, woda, pomara�cze, ser 
* Ceny dowolne. 
*/ 
public class J50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//program kt�ry b�dzie wy�wietla� cen� produktu a� do wpisania end --------------------moje ale dzia�a
		//Map<TypKlucza, TypWarto�ci> zbior = new HashMap< TypKlucza, TypWarto�ci >(); 
		
		/*Scanner n = new Scanner(System.in);
		
		HashMap< String, Double > map = new HashMap <String, Double>(); 
		map.put("mleko", 3.20);
		map.put("jaja", 2.80);
		map.put("chleb", 3.2);
		map.put("m�ka", 7.8);
		map.put("cukier", 2.9);
		map.put("bu�ki", 3.4);
		map.put("pomidory", 3.1);
		map.put("woda", 2.4);
		map.put("pomara�cze", 3.4);
		map.put("ser", 1.3);
		
		float suma=0;
		System.out.println("Podaj towar: ");
		
		String znak = n.nextLine();
		
		while(!znak.equals("end")){ //wykrywa znaki drukowane i pisane && (!znak.equals("END"))
			if(map.containsKey(znak)){
				
				suma+=map.get(znak);	
				}else{
					System.out.println("nie posiadamy tego towaru");
				}
			
			//System.out.println(mapa.keySet()); //dost�pne klucze
			//System.out.println(mapa.values());//dost�pne warto�ci
			
			znak= n.nextLine();
			
		}
		System.out.println("kupi�e�" + znak);
		System.out.println("kupi�e� za " + suma+ "z�");
		n.close(); 		
		*/
				
		//System.out.println(mapa.values());//dost�pne warto�ci
		
		//J 51 ----------------------------------------------------------------------------------------------------wz�r
				/*Do poprzedniego �wiczenia dodaj funkcjonalno�� wykrywania tego �e produkt jest ju� w koszyku. 
				* I zapytaj o potwierdzenie u�ytkownika czy na pewno chce doda� ponownie ten produkt
				*/
					
					Scanner pierwszy = new Scanner(System.in);
					Scanner drugi = new Scanner(System.in);
					HashMap<String, Double> mapa = new HashMap<String, Double>();
					ArrayList<String> lista = new ArrayList<String>();
					mapa.put("chleb", 1.23);
					mapa.put("mleko", 2.99);
					mapa.put("jaja", 3.99);
					mapa.put("m�ka", 2.20);
					mapa.put("cukier", 3.69);
					mapa.put("bu�ki", 0.99);
					mapa.put("pomidory", 13.30);
					mapa.put("woda", 1.99);
					mapa.put("pomara�cze", 19.40);
					mapa.put("ser", 21.90);
					
					float sum = 0;
					System.out.println("Podaj nazw� produktu: ");
					String produkty = pierwszy.nextLine();		// 1skaner
					while( (!produkty.equals("end")) && (!produkty.equals("END")) ){
						if(mapa.containsKey(produkty) && !lista.contains(produkty)){
							sum += mapa.get(produkty);
							lista.add(produkty);
						} else if(mapa.containsKey(produkty) && lista.contains(produkty)){
							System.out.println("Czy na pewno chcesz doda� ten produkt(t/n)?: "); //====== je�eli 2X wpisz� jedno to pyta czy to pomy�ka
							String xx = drugi.nextLine(); //2 skaner
							if (xx.equals("t")){
								sum += mapa.get(produkty);
								lista.add(produkty);	
							}
						} else {
							System.out.println("Z�a nazwa produktu: ");
						}
						produkty = pierwszy.nextLine();
					}
					System.out.println("Cena za twoje zakupy: " + sum + "z�");
					pierwszy.close();
					drugi.close();
	}

}

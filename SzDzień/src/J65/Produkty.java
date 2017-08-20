package J65;
/*J65
 * Getter i Setter 
 Napisz program kt�ry b�dzie imitowa� magazyn.  Z wykorzystaniem obiektowo�ci.  
 Menu wyboru co chcemy zrobi� w programie: 
 przyjmowa� / wydawa� produkty z magazynu 
 Dodawa� produkty i ich ceny 
 Kasowa� produkty 
 Sprawdza� stany magazynowe produkt�w.  
 Pokazywa� ceny produkt�w 
 Przy pokazywaniu ceny produktu nale�y uwzgl�dni� r�ne stawki vat kt�re mog� by� okre�lane przez u�ytkownika.  
 */
import java.util.Scanner;

import J65A.MagazynA;

public class Produkty {
	
	public static void main(String[] args) {
		Magazyn m1 = new Magazyn();
		Scanner menu = new Scanner(System.in);
		
		while(true){
			System.out.println("Co chesz zrobi�: D-dodaj, U-usu�, L-lista, Q-wyj�cie");
			String m = menu.nextLine();
			if(m.equals("D")){
				m1.dodajProdukt(new Magazyn());
			} 
			if (m.equals("L")){
				m1.stanyProdukty();
			}
			if (m.equals("U")){
				m1.usunProdukt(new Magazyn());
			}
			if (m.equals("Q")){
				System.out.println("koniec!");
				break;
			}
		}
		menu.close();
	}

}

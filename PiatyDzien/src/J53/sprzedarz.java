package J53;

//J53
/*Napisz program sk�adaj�cy si� przynajmniej z dw�ch klas. Kt�ry b�dzie imitowa� kase fiskaln�.  
* Sprzedawanie produkt�w 
*Wydruk zakupionych produkt�w wraz z cenami 
* Suma kt�r� trzeba zap�aci�.  
*/

import java.util.ArrayList;
// ------------po wpisaniu produkt�w chleb i mleko podlicza cen� za zakupy -----------reaguje na z�e nazwy 

public class sprzedarz {
	ArrayList<Double> lista = new ArrayList<Double>();
	public void utarg(ArrayList<Double> lista){
		this.lista = lista;
		
		for(Double i : lista){
			System.out.println("netto " + i);
			System.out.println("brutto " + i*1.23);
		}
	}	
	public static void main(String[] args) {
		ArrayList<Double> sklep = new ArrayList<Double>();
		
		produkty p1 = new produkty();
		sklep.add(p1.oblicz());

		
		sprzedarz statystyka = new sprzedarz();
		statystyka.utarg(sklep);
	}

}

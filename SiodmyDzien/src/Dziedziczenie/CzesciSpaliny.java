package Dziedziczenie;
//J67

/*Stwórz projekt, w którym wykorzystując dziedziczenie stworzysz prostą hierarchię klas odwzorowujących części w hurtowni 
 * motoryzacyjnej zgodnie z poniższą specyfikacją:  Każda część w hurtowni (Part) posiada swój unikalny numer identyfikacyjny, 
 * którego nie można zmienić, przechowuje nazwę producenta, model i serię produktu 
 Części takie jak Opony (Tire) i Felgi (Wheel) posiadają dodatkowo informację o rozmiarze i szerokości 
 Części (ExhaustPart) układu wydechowego posiadają dodatkową informację, czy jest ona zgodna z europejskim standardem emisji spalin 
 Dopisz krótką klasę testową, w której utworzysz kilka obiektów reprezentujących części i wyświetl informacje o nich. 
 */
public class CzesciSpaliny extends Part{

	boolean stnd; //czy standardowy

	public CzesciSpaliny(String nazwa, String model, String seria, boolean stnd) {
		super(nazwa, model, seria);
		this.stnd = stnd;
	}
	
	
	
}

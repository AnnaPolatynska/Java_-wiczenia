package Dziedziczenie;
//J67

/*Stwórz projekt, w którym wykorzystując dziedziczenie stworzysz prostą hierarchię klas odwzorowujących części w hurtowni 
* motoryzacyjnej zgodnie z poniższą specyfikacją:  Każda część w hurtowni (Part) posiada swój unikalny numer identyfikacyjny, 
* którego nie można zmienić, przechowuje nazwę producenta, model i serię produktu 
Części takie jak Opony (Tire) i Felgi (Wheel) posiadają dodatkowo informację o rozmiarze i szerokości 
Części (ExhaustPart) układu wydechowego posiadają dodatkową informację, czy jest ona zgodna z europejskim standardem emisji spalin 
Dopisz krótką klasę testową, w której utworzysz kilka obiektów reprezentujących części i wyświetl informacje o nich. 
*/
public class Opony extends Part{
	
	int rozmiar;
	int szerokosc;
	int wysokosc;
	
	//konstruktor
		public Opony(String nazwa, String model, String seria, int rozmiar, int szerokosc, int wysokosc) {
			super(nazwa,model,seria);
			this.rozmiar = rozmiar;
			this.szerokosc=szerokosc;
			this.wysokosc=wysokosc;
		}

}

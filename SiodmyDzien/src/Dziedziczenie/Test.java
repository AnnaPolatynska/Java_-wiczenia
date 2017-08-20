package Dziedziczenie;
//J67

/*Stwórz projekt, w którym wykorzystując dziedziczenie stworzysz prostą hierarchię klas odwzorowujących części w hurtowni 
* motoryzacyjnej zgodnie z poniższą specyfikacją:  Każda część w hurtowni (Part) posiada swój unikalny numer identyfikacyjny, 
* którego nie można zmienić, przechowuje nazwę producenta, model i serię produktu 
Części takie jak Opony (Tire) i Felgi (Wheel) posiadają dodatkowo informację o rozmiarze i szerokości 
Części (ExhaustPart) układu wydechowego posiadają dodatkową informację, czy jest ona zgodna z europejskim standardem emisji spalin 
Dopisz krótką klasę testową, w której utworzysz kilka obiektów reprezentujących części i wyświetl informacje o nich. 
*/
public class Test {

	public static void main(String[] args) {
		Opony t1=new Opony("Zimowa", "Michelin", "M32", 18, 60, 155);
		System.out.println(t1.NR + " "+ t1.model + " "+t1.nazwa+ " "+ t1.seria);
		
		Wheel w1= new Wheel("Super Felga", "BBS", "BBS123", 18);
		System.out.println(w1.model + " "+ w1.nazwa + " "+w1.cale);

		CzesciSpaliny s1= new CzesciSpaliny ("kopciuch", "S", "123", true);
		System.out.println(s1.model + " "+ s1.nazwa + " "+ s1.stnd);
		
	}

}

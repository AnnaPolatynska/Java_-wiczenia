package J56;
/*
 *  Napisz program, który bêdzie siê sk³ada³ z dwóch klas:  
 Pracownik - przechowuj¹ca takie dane jak imiê, nazwisko i wiek pracownika, oraz co najmniej trzy konstruktory, 
 które pos³u¿¹ do inicjowania obiektów z ró¿nymi parametrami - w przypadku gdy przyk³adowo konstruktor przyjmuje tylko 1 parametr, 
 zainicjuj pozosta³e pola jakimiœ domyœlnymi wartoœciami.  
 Firma - klasa testowa, w której utworzysz kilka obiektów klasy Pracownik i wyœwietlisz dane na ekran.   

 */
import J54Przeciazanie.Operacje;

public class Firma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//----------------------------------------------------------------------------------zad 56 zrobiæ
		Operacje o1= new Operacje();
		System.out.println(o1.dodaj(2,3));
		System.out.println(o1.dodaj(2,3,4));
		System.out.println(o1.dodaj(2.23,3.65));
		System.out.println(o1.dodaj(2.24,3.32,3.21));
		
	}

}

package J56;
/*
 *  Napisz program, kt�ry b�dzie si� sk�ada� z dw�ch klas:  
 Pracownik - przechowuj�ca takie dane jak imi�, nazwisko i wiek pracownika, oraz co najmniej trzy konstruktory, 
 kt�re pos�u�� do inicjowania obiekt�w z r�nymi parametrami - w przypadku gdy przyk�adowo konstruktor przyjmuje tylko 1 parametr, 
 zainicjuj pozosta�e pola jakimi� domy�lnymi warto�ciami.  
 Firma - klasa testowa, w kt�rej utworzysz kilka obiekt�w klasy Pracownik i wy�wietlisz dane na ekran.   

 */
import J54Przeciazanie.Operacje;

public class Firma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//----------------------------------------------------------------------------------zad 56 zrobi�
		Operacje o1= new Operacje();
		System.out.println(o1.dodaj(2,3));
		System.out.println(o1.dodaj(2,3,4));
		System.out.println(o1.dodaj(2.23,3.65));
		System.out.println(o1.dodaj(2.24,3.32,3.21));
		
	}

}

package J54Przeciazanie;
/* Napisz program sk�adaj�cy si� z dw�ch klas.  
Pierwsza niech zawiera kilka metod o nazwie dodaj(), ale zwracaj�cych r�ne typy wynik�w i przyjmuj�cych po minimum dwa parametry 
typ�w liczbowych wybranych przez Ciebie. Ich zadaniem jest zwr�cenie, lub wy�wietlanie sumy podanych argument�w.  
W drugiej klasie Testowej utw�rz obiekt tej klasy i sprawd� dzia�anie swoich metod, wy�wietlaj�c wyniki dzia�a� na ekranie.  
Dodatkowo ka�da z metod niech wy�wietla jaki zwraca typ i rodzaj argument�w kt�re pobra�a, aby� wiedzia�, kt�ra z nich zadzia�a�a.  
*/
public class Operacje {
	//---------------------------------------------------------OK	
	public void printType(int a){
		System.out.println("int");
	}
	public void printType(double a){
		System.out.println("double");
	}
	public int dodaj(int a, int b){
		return a + b;
	}
	public int dodaj(int a, int b, int c){
		return a + b + c;
	}
	public double dodaj(double a, double b){
		return a + b;
	}
	public double dodaj(double a, double b, double c){
		return a + b + c;
	}
	public int odejmij(int a, int b){
		return a - b;
	}
	public int odejmij(int a, int b, int c){
		return a - b - c;
	}
	public double odejmij(double a, double b){
		return a - b;
	}
	public double odejmij(double a, double b, double c){
		return a - b - c;
	}	
}
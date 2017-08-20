package J68;
/* Stwórz klasę Punkt2D, która przechowuje informacje na temat punktu na przestrzeni dwuwymiarowej (współrzędne x oraz y). 
 * Zawierająca dwa konstruktory:   bezparametrowy ustawiający pola na wartość 0, oraz   przyjmujący dwa argumenty i 
 * ustawiający pola obiektu zgodnie z podanymi parametrami.   Dodaj metody które pozwolą na przemieszczanie punktu w przestrzeni.  
 Następnie napisz klasę Punkt3D dziedziczącą po Punkt2D, reprezentującą punkt w trójwymiarze (dodatkowe pole z).  
 Przesłoń metody z punktu 2D tak żeby pasowały do punktu 3D 
 */
public class Test {

	public static void main(String[] args) {
		Punkt2D p11 = new Punkt2D();
		p11.print();
		p11.move(-2, 4);
		p11.print();
		Punkt2D p12 = new Punkt2D(2,4);
		p12.print();
		p12.move(-2, 4);
		p12.print();
		Punkt3D p1 = new Punkt3D();
		p1.print();
		p1.move(-2, 4);
		p1.print();
		Punkt3D p2 = new Punkt3D(3,5,5);
		p2.print();
		p2.move(-2, 4);
		p2.print();
	}

}

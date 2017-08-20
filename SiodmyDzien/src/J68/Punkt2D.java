package J68;
/* Stwórz klasę Punkt2D, która przechowuje informacje na temat punktu na przestrzeni dwuwymiarowej (współrzędne x oraz y). 
 * Zawierająca dwa konstruktory:   bezparametrowy ustawiający pola na wartość 0, oraz   przyjmujący dwa argumenty i 
 * ustawiający pola obiektu zgodnie z podanymi parametrami.   Dodaj metody które pozwolą na przemieszczanie punktu w przestrzeni.  
 Następnie napisz klasę Punkt3D dziedziczącą po Punkt2D, reprezentującą punkt w trójwymiarze (dodatkowe pole z).  
 Przesłoń metody z punktu 2D tak żeby pasowały do punktu 3D 
 */
public class Punkt2D {
	int x;
	int y;
	
	public void move(int a, int b){
		this.x = x + a;
		this.y = y + b;
	}
	public void print(){
		System.out.println("Aktualne położenie: ["+ x +","+ y +"]");
	}
	public Punkt2D() {
	}
	public Punkt2D(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
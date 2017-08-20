package PrzeciazanieMetod;

public class Przeciazanie {

	String imie, imie2, nazwisko, nazwisko2;//klasa
	
	public Przeciazanie(String imie, String imie2, String nazwisko, String nazwisko2) { //automatycznie tworzenie construktora
		super();
		this.imie = imie;
		this.imie2 = imie2;
		this.nazwisko = nazwisko;
		this.nazwisko2 = nazwisko2;
	}

	public Przeciazanie(String imie, String imie2, String nazwisko) {
		super();
		this.imie = imie;
		this.imie2 = imie2;
		this.nazwisko = nazwisko;
	}
// przeci¹¿anie przez zmienn¹ liczbê parametrów lub pzez zmianê typu parametrów
	public Przeciazanie(String imie, String nazwisko) {
		super();
		this.imie = imie;
		this.nazwisko = nazwisko;
	}

	
	public void dodaj(int a, int b){ //metody musz¹ nazywaæ siê tak samo by mo¿naby³o je przeci¹¿yæ
	System.out.println("wynik: " + (a+b));
	}
	
	public void dodaj(double a, double b){
		System.out.println("wynik: " + (a+b));
		}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
// przeci¹zanie zmienn¹ liczb¹ parametrów
		Przeciazanie p1= new Przeciazanie("Anna", "Maria", "Nowak", "Kowalska");
		Przeciazanie p2= new Przeciazanie("Katarzyna", "Olga", "Podlaska"); //brak 2 nazwiska zwraca b³¹d musimy przeci¹¿yæ
		Przeciazanie p3= new Przeciazanie("Jan", "Kowalski");
	
//przeci¹¿anie zmiennym typem parametrów
		
		p1.dodaj(2,5);
		p1.dodaj(3.18,5.2);
		
	}

}

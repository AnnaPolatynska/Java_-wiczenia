package DrugaPaczka;
// operatory cz2 porównanie zbiorów
public class Operatory2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x= 5;
		int y = 10;
		System.out.println("x>y " + (x>y));
		System.out.println("x<y " + (x<y));
		System.out.println("x!=y " + (x!=y));
		System.out.println("x==y " + (x==y));
		boolean instance = "Kasia" instanceof String; //instanceof sprawdza czy Kasia jest ci¹giem znaków//
		System.out.println(instance);
		
		
		boolean logic = true; 
		System.out.print("x<10 && y<11? "); //and//
		System.out.println(x<10 && y<11); 
		System.out.print("x<10 && y<10? "); 
		System.out.println(x<10 && y<10); 
		System.out.print("x<10 || y<10? "); //or//
		System.out.println(x<10 || y<10); 
		System.out.print(logic); 
		System.out.print(" , !logic = "); 
		System.out.println(!logic); 
		System.out.print("Warunek z³o¿ony !(x<10 && y<10) "); 
		System.out.println(!(x<10 && y<10)); 
		
		int wynik = x<y?x:y; //je¿eli spe³niony warunek zwróæ x je¿eli nie Y//
				 
		System.out.println(wynik); 
		
		
		
		
		
		
	}

}

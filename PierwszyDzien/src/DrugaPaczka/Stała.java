package DrugaPaczka;
//J 7  Napisz program, w kt�rym zadeklarujesz kilka sta�ych i  zmiennych r�nych typ�w o dowolnych nazwach, 
//a nast�pnie wy�wietlisz je w kolejnych liniach tekstu.  
// Zobacz co si� stanie przy pr�bie nadania po raz drugi warto�ci jakiej� sta�ej. 
public class Sta�a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String firstName; 
		//deklaracja//
		firstName = "Ernest";
		
		String lastName = "Krystian"; 
		//deklaracja i incjalizacja//
		
		final String pesel ="123456789";
		int Age= 26;
		double Height = 175;
		
		 System.out.print("Cze�� "); 
	     System.out.print(firstName); 
	     System.out.print(" "); 
	     System.out.println(lastName); 
	     System.out.println("Info:"); 
	     System.out.print("Tw�j PESEL to: "); 
	     System.out.println(pesel); 
	     System.out.print("Masz "); 
	     System.out.print(Age); 
	     System.out.println(" lat"); 
	     System.out.print("Wzrost: "); 
	     System.out.print(Height); 
	     System.out.print("cm"); 
		
		
		
		
		
		
		
		
		
	}

}

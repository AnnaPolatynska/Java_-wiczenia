package DrugaPaczka;
//J 7  Napisz program, w którym zadeklarujesz kilka sta³ych i  zmiennych ró¿nych typów o dowolnych nazwach, 
//a nastêpnie wyœwietlisz je w kolejnych liniach tekstu.  
// Zobacz co siê stanie przy próbie nadania po raz drugi wartoœci jakiejœ sta³ej. 
public class Sta³a {

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
		
		 System.out.print("Czeœæ "); 
	     System.out.print(firstName); 
	     System.out.print(" "); 
	     System.out.println(lastName); 
	     System.out.println("Info:"); 
	     System.out.print("Twój PESEL to: "); 
	     System.out.println(pesel); 
	     System.out.print("Masz "); 
	     System.out.print(Age); 
	     System.out.println(" lat"); 
	     System.out.print("Wzrost: "); 
	     System.out.print(Height); 
	     System.out.print("cm"); 
		
		
		
		
		
		
		
		
		
	}

}

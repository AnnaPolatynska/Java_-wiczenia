import java.io.FilterInputStream;
import java.util.Scanner;
import java.util.Scanner;
public class J25 {
//J 25
	// Napisz program zliczaj¹cy litery, znaki bia³e, cyfry wprowadzone z klawiatury. 
	public static void main(String[] args) {
				
		Scanner cosik = new Scanner(new FilterInputStream(System.in){
			@Override
			public void close(){}
		});
	
		System.out.println("Podaj tekst do zwrócenia jako obiekt: ");
		String odw = cosik.nextLine();
		StringBuffer nowyBufor = new StringBuffer(odw);// metoda StringBuffer
		System.out.println(nowyBufor.toString());// zwraca w postaci obiektu
		
			
				
//podaje ile ma znaków podany ci¹g
				String wyraz;
				System.out.println("Podaj jakiœ ci¹g znaków ");
				wyraz = cosik.nextLine();
				System.out.println("W troim ci¹gu jest " + wyraz.length() + " znaków");
				cosik.close();		
	}

}

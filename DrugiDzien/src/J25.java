import java.io.FilterInputStream;
import java.util.Scanner;
import java.util.Scanner;
public class J25 {
//J 25
	// Napisz program zliczaj�cy litery, znaki bia�e, cyfry wprowadzone z klawiatury. 
	public static void main(String[] args) {
				
		Scanner cosik = new Scanner(new FilterInputStream(System.in){
			@Override
			public void close(){}
		});
	
		System.out.println("Podaj tekst do zwr�cenia jako obiekt: ");
		String odw = cosik.nextLine();
		StringBuffer nowyBufor = new StringBuffer(odw);// metoda StringBuffer
		System.out.println(nowyBufor.toString());// zwraca w postaci obiektu
		
			
				
//podaje ile ma znak�w podany ci�g
				String wyraz;
				System.out.println("Podaj jaki� ci�g znak�w ");
				wyraz = cosik.nextLine();
				System.out.println("W troim ci�gu jest " + wyraz.length() + " znak�w");
				cosik.close();		
	}

}

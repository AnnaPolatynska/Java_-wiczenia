package Sekwencje;

import java.util.ArrayList;
import java.util.Scanner;
//J49
//Napisz program który bêdzie pobiera³ od u¿ytkownika ci¹gi znaków i bêdzie je dodawa³ do listy do czasu a¿ u¿ytkownik wpisze „end”. 

public class J49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//---------------------------------------------kontrolka-----program pobieraj¹cy ci¹gi znaków do listy a¿ u¿ytkownik napisze "end"
		
		
		Scanner n = new Scanner(System.in);
		System.out.println("Podaj ci¹g znaków: ");
		
		ArrayList<String> lista = new ArrayList<String>();
		
		String znak = n.nextLine();
		
		
		while(!znak.equals("end")){
			lista.add(znak);
			znak= n.nextLine();
			
		}
		
		n.close(); 		
		
		System.out.println(lista);
		
		
	
		
	}
}


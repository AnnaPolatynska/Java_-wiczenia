package Sekwencje;

import java.util.ArrayList;
import java.util.Scanner;
//J49
//Napisz program kt�ry b�dzie pobiera� od u�ytkownika ci�gi znak�w i b�dzie je dodawa� do listy do czasu a� u�ytkownik wpisze �end�. 

public class J49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//---------------------------------------------kontrolka-----program pobieraj�cy ci�gi znak�w do listy a� u�ytkownik napisze "end"
		
		
		Scanner n = new Scanner(System.in);
		System.out.println("Podaj ci�g znak�w: ");
		
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


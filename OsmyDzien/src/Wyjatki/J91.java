package Wyjatki;

import java.util.InputMismatchException;
import java.util.Scanner;

/*Napisz program pobieraj�cy od u�ytkownika liczb�. 
 * Je�eli u�ytkownik wpisze znak w miejsce liczby program powinien obd�u�y� wyj�tek i wykona� si� ponownie oraz poprosi� 
 * o poprawne wpisanie warto�ci.  
*/
public class J91 {

	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int number = 0;
	boolean error = true;
	
	
	while(error){
		System.out.println("podaj liczb� ca�kowit� lub zako�cz Q ");
		try{
		number=sc.nextInt();
		System.out.println("poda�e� liczb� "+ number);
		error=false;
		}catch (InputMismatchException e){
			if(sc.hasNext("Q")){
				break;
			} else {
				System.out.println("nie poda�e� liczby ca�kowitej. Popraw warto�� ");
				sc.nextLine();
			}
		//Q nie jest liczb� ale program ma go przyj��
		
	
		}
	}
	sc.close();
}
}
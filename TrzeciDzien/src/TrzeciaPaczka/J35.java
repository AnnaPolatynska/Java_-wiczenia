package TrzeciaPaczka;
import java.util.Scanner;
public class J35 {
//J35
	/*Napisz program, który wczytuje od u¿ytkownika liczbê ca³kowit¹ dodatni¹ n, 
	 * a nastêpnie wyœwietla na ekranie wszystkie potêgi liczby 2 nie wiêksze, ni¿ podana liczba. */
	// ----------------------------------------------------------------------------------------OK
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner rl = new Scanner(System.in);
		System.out.println("Podaj liczbê ca³kowit¹ A: ");
		
		int liczba = rl.nextInt();
		
		for (int i=0; i <= liczba; i++){
		System.out.println (Math.pow(2, i));
							
		rl.close();
		
		
		}	
	}
}
		
		
		
		
		
		
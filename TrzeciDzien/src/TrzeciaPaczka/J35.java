package TrzeciaPaczka;
import java.util.Scanner;
public class J35 {
//J35
	/*Napisz program, kt�ry wczytuje od u�ytkownika liczb� ca�kowit� dodatni� n, 
	 * a nast�pnie wy�wietla na ekranie wszystkie pot�gi liczby 2 nie wi�ksze, ni� podana liczba. */
	// ----------------------------------------------------------------------------------------OK
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner rl = new Scanner(System.in);
		System.out.println("Podaj liczb� ca�kowit� A: ");
		
		int liczba = rl.nextInt();
		
		for (int i=0; i <= liczba; i++){
		System.out.println (Math.pow(2, i));
							
		rl.close();
		
		
		}	
	}
}
		
		
		
		
		
		
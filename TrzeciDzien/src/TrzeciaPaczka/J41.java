package TrzeciaPaczka;

import java.util.Scanner;

public class J41 {
//J41
	/* Napisz program, dla podanej liczby ca�kowitej wy�wietla jej dzielniki. 
	 * Przyk�adowo, dla liczby 21 dzielniki to: 1, 3, 7, 21. */
	//-------------------------------------------------------------------------------ok
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner rl = new Scanner(System.in);
		System.out.println("Podaj jak� liczbe ca�kowit� wi�ksz� od zera");
		int liczba = rl.nextInt();
		System.out.println("Liczba " + liczba + " jest podzielna przez: ");
		if(liczba >0){
			for (int i = 1; i<liczba+1; i++){
				if(liczba %i == 0){
					System.out.println(i);
				}
			}
		} else {
		System.out.println("Liczba mniejsza od zera");
		}
	rl.close();
	}

}

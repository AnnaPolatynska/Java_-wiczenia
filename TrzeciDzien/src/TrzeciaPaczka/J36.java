package TrzeciaPaczka;

import java.util.Scanner;
//J36
/*Napisz program, kt�ry wczyta liczby podane przez u�ytkownika dot�d, dop�ki nie wykryta zostanie liczba 0.  
 * Nast�pnie wy�wietli� sum� wszystkich podanych liczb. */

public class J36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//zlicza a� trafi na 0----------------------------------------------------OK
		Scanner rl = new Scanner(System.in);
		System.out.println("Podaj wszystki liczby: ");
		int line = 0;
		int sum = 0;
		boolean hasZERO = false;
		do{ 
			line = rl.nextInt();
			if(line != 0 ){
				sum+=line;
			} 
			else{
				hasZERO = true;
		}
		} while(!hasZERO);
			System.out.println("Suma = " +sum);
			rl.close();		
	}
}

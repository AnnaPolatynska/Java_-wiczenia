package Tablice;

import java.io.FilterInputStream;
import java.util.Random;
import java.util.Scanner;
//J46
/*Napisz program, kt�ry wczytuje od u�ytkownika liczb� ca�kowit�, a nast�pnie wy�wietla jej reprezentacj� w kodzie binarnym (ZM). 
 * Podczas konwersji liczby nale�y kolejne jej bity zapisywa� w pomocniczej tablicy liczb ca�k. o rozmiarze 32. 
 * Konwersji nale�y dokona� korzystaj�c z operacji dzielenia ca�kowitego oraz operacji modulo. 
 *  */
public class J46 {

	public static void main(String[] args) {
		
		// wersja kr           ---------------------------------------------------ok
		
		System.out.println("Podaj liczb� do przekszta�cenia na kod binarny: ");
		Scanner rl = new Scanner(System.in);
		int liczba = rl.nextInt();
		int[] tabl = new int[32];
		
		for(int i=tabl.length - 1; i >= 0 ; i--){
			tabl[i] = liczba % 2;
			liczba /= 2;
		}
		for(int i : tabl){
			System.out.print(i);
		}
		rl.close();
	}
}
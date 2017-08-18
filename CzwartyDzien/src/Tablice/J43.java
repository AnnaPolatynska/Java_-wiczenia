

package Tablice;

import java.util.Random;


public class J43 {
//J 43             ------------------Wartości losowe
	/*
	Napisz program, który: 
utworzy tablicę 10 liczb całkowitych i wypełni ją wartościami losowymi z przedziału [−10,...,10],  
wypisze na ekranie zawartość tablicy,  • wyznaczy najmniejszy oraz największy element w tablicy,  
wyznaczy średnią arytmetyczną elementów tablicy,  • wyznaczy ile elementów jest mniejszych, ile większych od średniej.  
wypisze na ekranie zawartość tablicy w odwrotnej kolejności, tj. od ostatniego do pierwszego. 
 
Wszystkie wyznaczone wartości powinny zostać wyświetlone na ekranie. 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//-----------------      --------------------  -------------------ok 
		
		int [] randInt = new int[10];
		Random generator = new Random();
		//losowanie
		for(int i = 0; i<randInt.length; i++){
			randInt[i] = generator.nextInt(21)-10;
		}
		//wypisanie 
		System.out.println("Losowanie ");
		for(int i = 0; i<=randInt.length -1; i++){
			System.out.print(randInt[i]);
			System.out.print(" ");
		}
		// wypisanie odwrotne
		System.out.println("Wypisane odwrotnie ");
		for(int i = randInt.length -1; i>=0; i--){
			System.out.print(randInt[i]);
			System.out.print(" ");
		}
		// max i min
		int tempMax = randInt[0];
		int tempMin = randInt[0];
		for(int i = 1; i<=randInt.length-1; i++){
			if(tempMax < randInt[i]){
				tempMax = randInt[i];
			}
			if(tempMin > randInt[i]){
				tempMin = randInt[i];
			}
		}		
		System.out.print("\nNajmniejszy: "+tempMin+" \nNajwiększy: "+tempMax);
		//srednia
		int sum = 0;
		for (int i = 0; i<= randInt.length - 1; i++){
			sum += randInt[i];
		}
		float ave=sum/randInt.length;
		System.out.print("\nŚrednia arytmetyczna: "+ave);
		//ile elementów jest > a ile mniejszych od sredniej
		int licznikM = 0;
		int licznikW = 0;
		for(int i = 0; i<=randInt.length-1; i++){
			if(randInt[i]>ave){
				licznikW ++;
			}
			if(randInt[i]<ave){
				licznikM ++;
			}
		}
		System.out.print("\nLiczba elementów większych od średniej: "+licznikW);
		System.out.print("\nLiczba elementów mniejszych od średniej: "+licznikM);
		
		
		
		
	}

}


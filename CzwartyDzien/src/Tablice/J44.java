package Tablice;
//J 44
/*Napisz program, który utworzy tablicê 20 liczb ca³kowitych z przedzia³u 1...10, 
* a nastêpnie wypisze na ekranie ile razy ka¿da z liczb z tego przedzia³u powtarza siê w tablicy. 
*/


//----------------------------------------------iloœæ powtórzeñ losowego
import java.util.Random;

public class J44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//tablica 20 liczb od1 do 10
		//ile liczb siê powtórzy
		
		int [] randInt = new int[20];
		Random generator = new Random();
		//losowanie
		for(int i = 0; i<randInt.length; i++){
			randInt[i] = generator.nextInt(10)+1; //od 1 do 10
		}
		//wypisanie 
		System.out.println("Losowanie ");
		
		/* 1 sposób for a nie while
		for(int i = 0; i<=randInt.length -1; i++){
			System.out.print(randInt[i]);
			System.out.print(" ");
		*/
		
		/* 2 sposób while
		int licznik = 0; 
			while(licznik<20){ 
				//ile wyœwietlaæ 20 liczb
			System.out.print(randInt[licznik]); 
			licznik++; 
			System.out.print(" ");
			}
		*/
			//ile liczb siê powtórzy----------------------------------------------------			ok
			for(int i = 1; i<11; i++){ //i++ puszcza dla kolejnych liczb
				int counter= 0;
				for(int j = 0; j<=randInt.length -1; j++){ //pozycja tab
						if (randInt[j] == i){
							counter++;
							}
						}
			
		// tumo¿e byæ if sprawdzaj¹cy odfiltrowanie tych co 0 razy wystêpuj¹
				if (counter>0){
					System.out.println(i+" powtarza siê w tablicy "+ counter +" razy");
				}
			}
	}
}

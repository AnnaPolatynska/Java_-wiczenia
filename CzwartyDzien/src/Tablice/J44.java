package Tablice;
//J 44
/*Napisz program, kt�ry utworzy tablic� 20 liczb ca�kowitych z przedzia�u 1...10, 
* a nast�pnie wypisze na ekranie ile razy ka�da z liczb z tego przedzia�u powtarza si� w tablicy. 
*/


//----------------------------------------------ilo�� powt�rze� losowego
import java.util.Random;

public class J44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//tablica 20 liczb od1 do 10
		//ile liczb si� powt�rzy
		
		int [] randInt = new int[20];
		Random generator = new Random();
		//losowanie
		for(int i = 0; i<randInt.length; i++){
			randInt[i] = generator.nextInt(10)+1; //od 1 do 10
		}
		//wypisanie 
		System.out.println("Losowanie ");
		
		/* 1 spos�b for a nie while
		for(int i = 0; i<=randInt.length -1; i++){
			System.out.print(randInt[i]);
			System.out.print(" ");
		*/
		
		/* 2 spos�b while
		int licznik = 0; 
			while(licznik<20){ 
				//ile wy�wietla� 20 liczb
			System.out.print(randInt[licznik]); 
			licznik++; 
			System.out.print(" ");
			}
		*/
			//ile liczb si� powt�rzy----------------------------------------------------			ok
			for(int i = 1; i<11; i++){ //i++ puszcza dla kolejnych liczb
				int counter= 0;
				for(int j = 0; j<=randInt.length -1; j++){ //pozycja tab
						if (randInt[j] == i){
							counter++;
							}
						}
			
		// tumo�e by� if sprawdzaj�cy odfiltrowanie tych co 0 razy wyst�puj�
				if (counter>0){
					System.out.println(i+" powtarza si� w tablicy "+ counter +" razy");
				}
			}
	}
}

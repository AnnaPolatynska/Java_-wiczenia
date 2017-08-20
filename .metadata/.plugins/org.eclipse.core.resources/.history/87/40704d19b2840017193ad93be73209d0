package Tablice;
//J45
/*Napisz program, który: 
 stworzy tablicę (macierz) 5 x 5 liczb całkowitych,  
 wypełnij ją losowymi wartościami z zakresu {−5,−4,...,5},  
 dla każdej kolumny wyznacz minimum,  
 dla każdej kolumny wyznaczy maksimum. 
 
Program ma wyświetlać tablicę wypełnioną liczbami oraz tablice z minimami oraz maksymami. 
*/
import java.util.Random;

public class J45_macierz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//// ------------------------------------------------- macierze od -5 do 5 --wzór
		int[][] tabl = new int[5][5]; //macierz[][]
		//generowanie
		Random generator = new Random();
		for(int i = 0; i < tabl.length; i++){
			for(int j = 0; j < tabl[i].length; j++){
				tabl[i][j] = generator.nextInt(11)-5; //liczby z pozycji od -5 do 5 (wraz z zerem )jest ich 11 
			}
		}
		//wypisywanie
		for(int i = 0; i < tabl.length; i++){ 
			//i to wiersze
			
			for(int j = 0; j < tabl[i].length; j++){
			//j to kolumny
				
				System.out.print(+ tabl[i][j]+"\t"); // "\t" enter między wierszami co 5 liczb
			}
			System.out.println("");
		}
		//liczymy minima i maksima
		int tempMin = tabl[0][0];
		int tempMax = tabl[0][0];
		int[][] maxMin = new int[2][5];
		for(int j = 0; j<tabl.length; j++){
			for(int i = 0; i<tabl[j].length; i++){
			//System.out.print(tabl[i][j]);
			if(tempMin>tabl[i][j]){
				tempMin = tabl[i][j];
			}
			if(tempMax<tabl[i][j]){
				tempMax = tabl[i][j];
				}
			}
			maxMin[0][j] = tempMax;
			maxMin[1][j] = tempMin;
			tempMax = 0;
			tempMin = 0;
		}
		//Wypisywanie
		System.out.println("");
		for(int i = 0; i<maxMin.length; i++){
			for(int j = 0; j<maxMin[i].length; j++){
				System.out.print(maxMin[i][j]+"\t");
			}
			System.out.println("");
		}
		
		
		
		
	}
}

package Tablice;
//J47
/*Wykonaj operacje dodawania dw�ch macierzy jednostkowych wymiaru 3x3 za pomoc� tablic. */
import java.util.Random;

public class J47_dod_maciery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//J47 ======================================================dodawanie 2X tablice takie same generowane losowo
		Random generator = new Random();
		//generowanie 1 macierzy
		int[][] tablA = new int[3][3]; //macierz[][]
		for(int i = 0; i < tablA.length; i++){
			for(int j = 0; j < tablA[i].length; j++){
				tablA[i][j] = generator.nextInt(3); //
			}
		}
		
		for(int i = 0; i < tablA.length; i++){ 
			
			for(int j = 0; j < tablA[i].length; j++){
							
			System.out.print((tablA[i][j]) +"\t"); // "\t" enter mi�dzy wierszami dodawanie macierzy
			}
			System.out.println("");
		
		}
		
		
		//generowanie 2 macierzy [][]
		/*int[][] tablB = new int[3][3]; 
		
		for(int k = 0; k < tablB.length; k++){
			for(int l = 0; l < tablB[i].length; l++){
				tablB[k][l] = generator.nextInt(3); //
				
			}
		}
				
				*/
		//wypisywanie
		System.out.println("");
		for(int i = 0; i < tablA.length; i++){ 
			//i to wiersze
			
			for(int j = 0; j < tablA[i].length; j++){
			//j to kolumny
				
				System.out.print((tablA[i][j])+(tablA[i][j])+"\t"); // "\t" enter mi�dzy wierszami dodawanie macierzy
			}
			System.out.println("");
		}
		
		
		
		
		
		
		

	}
}
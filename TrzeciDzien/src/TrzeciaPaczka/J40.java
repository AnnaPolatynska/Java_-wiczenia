package TrzeciaPaczka;

import java.util.Scanner;
//J40
/*Napisz program rysuj¹cy w konsoli „choinkê” z³o¿on¹ ze znaków gwiazdki (*).
 * U¿ytkownik programu powinien podaæ liczbê ca³kowit¹ n, n > 0, okreœlaj¹c¹ wysokoœæ choinki (liczbê wierszy). */
public class J40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner rl = new Scanner(System.in);
			System.out.println("Podaj wysokoœæ choinki: ");
			int wysChoi = rl.nextInt();
			
			for(int w = 0; w <= wysChoi; w++){
				for(int i = 1; i <= wysChoi - w ; i++){
					System.out.print(" ");
				}
				for(int j = wysChoi; j > wysChoi- 2*w+1; j--){
					System.out.print("*");
				}		
				System.out.println();
			}
			for(int k = 0; k < wysChoi - 1; k++ ){
			System.out.print(" ");
			}
			System.out.print("*");
			rl.close();
		
		
		
		
		
		//program rysuj¹cy gwiazdki u¿ytkownik okreœla liczbê ca³kowit¹ = wysokoœci choinki (liczbê wierszy)---------ROZJECHANA choinka
		/*Scanner rl = new Scanner(System.in);
		System.out.println("Podaj liczbê wierszy: ");
		int wysChoi = rl.nextInt(); //przechodzi do nastêpnej linii
		
		for (int w=0; w <= wysChoi; w++){
			for(int i = 1; i <= wysChoi - w; i++){
				System.out.print (" ");
			}
			for(int j = wysChoi; j >= wysChoi - 2*w+1; j--){
				System.out.print ("*");
			}
			System.out.println(); 
			for(int k = 0; k < wysChoi-1; k++){
			}
		}
			System.out.print ("*");
			System.out.println(" "); 
	
	
		//	for(int i = wysChoi; j>wysChoi -2*w+1; j--)
		//	System.out.println ("*");
		
		rl.close();
		*/	
		
		}
	}



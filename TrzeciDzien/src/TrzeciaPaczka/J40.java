package TrzeciaPaczka;

import java.util.Scanner;
//J40
/*Napisz program rysuj�cy w konsoli �choink� z�o�on� ze znak�w gwiazdki (*).
 * U�ytkownik programu powinien poda� liczb� ca�kowit� n, n > 0, okre�laj�c� wysoko�� choinki (liczb� wierszy). */
public class J40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner rl = new Scanner(System.in);
			System.out.println("Podaj wysoko�� choinki: ");
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
		
		
		
		
		
		//program rysuj�cy gwiazdki u�ytkownik okre�la liczb� ca�kowit� = wysoko�ci choinki (liczb� wierszy)---------ROZJECHANA choinka
		/*Scanner rl = new Scanner(System.in);
		System.out.println("Podaj liczb� wierszy: ");
		int wysChoi = rl.nextInt(); //przechodzi do nast�pnej linii
		
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



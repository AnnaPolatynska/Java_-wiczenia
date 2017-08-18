package TrzeciaPaczka;
import java.util.Scanner;
public class J34 {
//J34
	/*Napisz program pobieraj¹cy od u¿ytkownika dwie liczby ca³kowite A oraz B, A < B, 
	 * a nastêpnie wyznaczaj¹cy sumê ci¹gu liczb od A do B, czyli sumê ci¹gu (A,A + 1,...,B). 
	 * Obliczenia nale¿y wykonaæ trzykrotnie stosuj¹c kolejno pêtle: while, do-while, for.*/
	// ----------------------------------------------------------------------------------------OK
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		Scanner sc = new Scanner(System.in);
		System.out.println("Podaj liczbê A: ");
		int A = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Podaj liczbê B: ");
		int B = sc.nextInt();
		int sum=0;
		int i = 0;
		
		if (A < B){
			for( i=A; i<=B; i++){ 
			sum+=i;
			}
			System.out.println("suma ci¹gu=" + sum);
		}
		
		sc.close();
		
		
		/*Wzór M
		Scanner sc = new Scanner(System.in);
		System.out.print("Podaj liczbê: ");
		int num1 = sc.nextInt();
		System.out.print("Podaj liczbê: ");
		int num2  = sc.nextInt();
		int sum = 0;
		int i = 0;
		if(num1 < num2){
		for (i = num1; i<=num2; i++){
		sum += i;
		}
		System.out.println("Suma ci¹gu="+sum);
		}
		sc.close();
		*/
		
		
		
		
		
		
		
		
		
		
	}

}

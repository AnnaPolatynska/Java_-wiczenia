package TrzeciaPaczka;
import java.util.Scanner;
public class J34 {
//J34
	/*Napisz program pobieraj�cy od u�ytkownika dwie liczby ca�kowite A oraz B, A < B, 
	 * a nast�pnie wyznaczaj�cy sum� ci�gu liczb od A do B, czyli sum� ci�gu (A,A + 1,...,B). 
	 * Obliczenia nale�y wykona� trzykrotnie stosuj�c kolejno p�tle: while, do-while, for.*/
	// ----------------------------------------------------------------------------------------OK
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		Scanner sc = new Scanner(System.in);
		System.out.println("Podaj liczb� A: ");
		int A = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Podaj liczb� B: ");
		int B = sc.nextInt();
		int sum=0;
		int i = 0;
		
		if (A < B){
			for( i=A; i<=B; i++){ 
			sum+=i;
			}
			System.out.println("suma ci�gu=" + sum);
		}
		
		sc.close();
		
		
		/*Wz�r M
		Scanner sc = new Scanner(System.in);
		System.out.print("Podaj liczb�: ");
		int num1 = sc.nextInt();
		System.out.print("Podaj liczb�: ");
		int num2  = sc.nextInt();
		int sum = 0;
		int i = 0;
		if(num1 < num2){
		for (i = num1; i<=num2; i++){
		sum += i;
		}
		System.out.println("Suma ci�gu="+sum);
		}
		sc.close();
		*/
		
		
		
		
		
		
		
		
		
		
	}

}

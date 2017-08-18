import java.io.FilterInputStream;
import java.util.Scanner;
// J26 
/* Napisz prosty kalkulator dla liczb zmiennoprzecinkowych, który pozwala u¿ytkownikowi kolejno na: 
 Wprowadzenie pierwszej liczby 
 Wprowadzenie jednego z podstawowych dzia³añ matematycznych (plus, minus, podziel, pomnó¿) - w postaci znaków +, -, /, * 
 Wprowadzenie drugiej liczby 
*/
public class J26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner costam = new Scanner(new FilterInputStream(System.in){
			@Override
			public void close(){}
		});
		
		//kalkulator 2 liczby
	
		System.out.println("Podaj 1 liczbê: ");
		double A = costam.nextDouble(); //nextDouble  czyta kolejn¹ liczbê zmiennoprzecinkow¹ //
		System.out.println("Podaj 2 liczbê: ");
		double B = costam.nextDouble();
		double C = (A+B);
		double D = (A-B);
		double E = (A/B);
		double F = (A*B);
		
		costam.close();
		
		String dzialanie = "1" //wybiera które dzia³anie jako jedyne ma byæ zrobione przy brekach//
				+ "";
		
		switch(dzialanie){
		
		case "1":
			System.out.println( "A +B :" + C );
			
			//break;
			// likwidacja breka => wykonuje siê kolejna
			
		case "2":
			System.out.println("A -B :" + D );
			//break;
			
		case "3":
			System.out.println("A /B :" + E );
			break; //aktywny break niweluje dalsze dzia³ania
			
		case "4":
			System.out.println("A *B :" + F );
			break; 
			
			
		default:
			System.out.println("koniec");
			break;
		
			
	}
				
	}

}

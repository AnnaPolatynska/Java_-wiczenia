import java.io.FilterInputStream;
import java.util.Scanner;
// J26 
/* Napisz prosty kalkulator dla liczb zmiennoprzecinkowych, kt�ry pozwala u�ytkownikowi kolejno na: 
 Wprowadzenie pierwszej liczby 
 Wprowadzenie jednego z podstawowych dzia�a� matematycznych (plus, minus, podziel, pomn�) - w postaci znak�w +, -, /, * 
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
	
		System.out.println("Podaj 1 liczb�: ");
		double A = costam.nextDouble(); //nextDouble  czyta kolejn� liczb� zmiennoprzecinkow� //
		System.out.println("Podaj 2 liczb�: ");
		double B = costam.nextDouble();
		double C = (A+B);
		double D = (A-B);
		double E = (A/B);
		double F = (A*B);
		
		costam.close();
		
		String dzialanie = "1" //wybiera kt�re dzia�anie jako jedyne ma by� zrobione przy brekach//
				+ "";
		
		switch(dzialanie){
		
		case "1":
			System.out.println( "A +B :" + C );
			
			//break;
			// likwidacja breka => wykonuje si� kolejna
			
		case "2":
			System.out.println("A -B :" + D );
			//break;
			
		case "3":
			System.out.println("A /B :" + E );
			break; //aktywny break niweluje dalsze dzia�ania
			
		case "4":
			System.out.println("A *B :" + F );
			break; 
			
			
		default:
			System.out.println("koniec");
			break;
		
			
	}
				
	}

}

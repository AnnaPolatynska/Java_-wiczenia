import java.io.FilterInputStream;
import java.util.Locale;
import java.util.Scanner;
import java.math.*;
//J 21
//Napisz program porównuj¹cy dwie liczby podane przez u¿ytkownika za pomoc¹ wszystkich znanych Ci operatorów porównania. 

public class J21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner costam = new Scanner(new FilterInputStream(System.in){
			@Override
			public void close(){}
		});
		
		//porównanie 2 liczby
		System.out.println("Podaj 1 liczbê: "); //pobierz liczbê
		double A = costam.nextDouble(); //liczba A  ma = liczbie pobranej przez skaner costam - nextDouble  czyta kolejn¹ liczbê zmiennoprzecinkow¹ //
		System.out.println("Podaj 2 liczbê: ");
		double B = costam.nextDouble();
		
		boolean W = (A>B);
		System.out.println( W + "A jest wiêksze od B");
		boolean M = A<B;
		System.out.println( M + "A jest mniejsze od B");
		boolean Row = A==B;
		System.out.println(Row + "A jest równe B");
		boolean R = A != B;
		System.out.println(R + "A jest ró¿ne od B"); 
				
				
		costam.close();
		
		
		
	}

}

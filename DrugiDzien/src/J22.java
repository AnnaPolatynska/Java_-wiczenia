import java.io.FilterInputStream;
import java.util.Scanner;
import static java.lang.Math.*;
//J22
// Napisz program obliczaj¹cy pole powierzchni szeœciok¹ta foremnego dla zadanej wartoœci boku

public class J22 {
	public static void main(String[] args) {
	
		Scanner cos = new Scanner(new FilterInputStream(System.in){
			@Override
			public void close(){}
		});
		
		System.out.println("Podaj 1 liczbê: ");
		double A = cos.nextDouble(); //nextDouble  czyta kolejn¹ liczbê zmiennoprzecinkow¹ //
		
		//polepowierzchni szeœciok¹ta foremnego
		
		double pole = ((3*sqrt(3)*(pow(A, 2)))/2);
		System.out.println("pole powierzchni wynosi " + pole);
		cos.close();
		
		
		
		
	}
			
}

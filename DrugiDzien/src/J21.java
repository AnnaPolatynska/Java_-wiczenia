import java.io.FilterInputStream;
import java.util.Locale;
import java.util.Scanner;
import java.math.*;
//J 21
//Napisz program por�wnuj�cy dwie liczby podane przez u�ytkownika za pomoc� wszystkich znanych Ci operator�w por�wnania. 

public class J21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner costam = new Scanner(new FilterInputStream(System.in){
			@Override
			public void close(){}
		});
		
		//por�wnanie 2 liczby
		System.out.println("Podaj 1 liczb�: "); //pobierz liczb�
		double A = costam.nextDouble(); //liczba A  ma = liczbie pobranej przez skaner costam - nextDouble  czyta kolejn� liczb� zmiennoprzecinkow� //
		System.out.println("Podaj 2 liczb�: ");
		double B = costam.nextDouble();
		
		boolean W = (A>B);
		System.out.println( W + "A jest wi�ksze od B");
		boolean M = A<B;
		System.out.println( M + "A jest mniejsze od B");
		boolean Row = A==B;
		System.out.println(Row + "A jest r�wne B");
		boolean R = A != B;
		System.out.println(R + "A jest r�ne od B"); 
				
				
		costam.close();
		
		
		
	}

}

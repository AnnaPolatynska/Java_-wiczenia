import java.io.FilterInputStream;
import java.util.Locale;
import java.util.Scanner;
import java.math.*;
public class J20 {
// J20
//Napisz program obliczaj�cy �redni� z trzech liczb podanych przez u�ytkownika
	
	public static void main(String[] args) { //void oznacza �e metoda nic nie zwraca//
		// TODO Auto-generated method stub
				
		Scanner costam = new Scanner(new FilterInputStream(System.in){
			@Override
			public void close(){}
		});
		//input.useLocale(Locale.US); 
		
		// Scanner=klasa=typ <deklaracja czego u�ywamy> co�tam = imie dowolna nazwa <metoda=public static co robi>//
		//j20 ernest = new j20; new nowy obiekt, ma w sobie metody klas nadrz�dnych i to co mu dopiszemy//
		//er.chodzi -->kropka oznacza metod� 
		//obiekt co� co reprezentuje dany typ, jest opisana
		//klasa niemowlak Ala = metoda wrzeszczy//
		
		 
		System.out.println("Podaj 1 liczb�: ");
		double A = costam.nextDouble(); //nextDouble  czyta kolejn� liczb� zmiennoprzecinkow� //
		System.out.println("Podaj 2 liczb�: ");
		double B = costam.nextDouble();
		System.out.println("Podaj 3 liczb�: ");
		double C = costam.nextDouble(); 
		double srednia=(A+B+C)/3;
		
		//System.out.println("�rednia z podanych liczb wynosi: " + round(((A+B+C)/3)2); zaokr�glenie nie dzia�a
		
		System.out.println("�rednia z podanych liczb wynosi: " + srednia);
		costam.close();
		
	}

}



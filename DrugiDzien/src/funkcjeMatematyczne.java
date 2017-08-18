import static java.lang.Math.*;
import static java.lang.Math.sqrt;

import java.math.BigInteger;

public class funkcjeMatematyczne {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	
		 int x= 5;
		double y= 9.0;
		/* 1 sposób
		 * double pierwiastek = Math.sqrt(y);
		double potega = Math.pow(y, x);*/
		double pierwiastek = sqrt(y);
		double potega = pow (y,x);
		double gf= abs(x);
		
		System.out.println("Pierwiastek z "+ y + " wynosi " + pierwiastek);
		System.out.println("Potega z "+ y +" podniesiona do potegi "+ x + " wynosi " + potega);

		long i = 7855423554552l;
		long j = 785555656545l;
		//wielkie liczby//
	//nowy tworzony przez konstruktor//
		BigInteger bigBIGInt= new BigInteger("5548963322569855532266552525556565555555226555555");
		
		
		
		BigInteger bigIntJ = BigInteger.valueOf(j);//obiekt typu Biginteger//
		System.out.println(bigIntJ.toString());
		
		BigInteger bigIntI = BigInteger.valueOf(i);
		System.out.println(bigIntI.toString());
		//string daje dowoln¹ d³ugoœæ intigera//
		
		BigInteger temp= bigIntJ.add(bigIntI);//dodajemy add//
		System.out.println(temp.toString());
		
		System.out.println(bigBIGInt.toString());
		
		//println to metoda//
		
		
/* J 17  Napisz program w którym zadeklarujesz dwie wielkie liczby i wyœwietl 
* dzia³ania matematyczne +-/* dla tych liczb. 		
 */
		
		BigInteger bigIntA= new BigInteger("555933324896332256985553226655259");
		BigInteger bigIntB= new BigInteger("2489633229986588556656985553226");
		
		System.out.println(bigIntA.toString());
		System.out.println(bigIntB.toString());
		//add +//
		BigInteger S = bigIntA.add (bigIntB);
		System.out.println("suma A i B: "+ S);
		
		//subtract -//
		BigInteger R = bigIntA.subtract (bigIntB);
		System.out.println("roznica A i B: "+ R);
		
		//multiply * //
		BigInteger M = bigIntA.multiply (bigIntB);
		System.out.println("mnozenie A i B: "+ M);
		
		// divide  dzielenie//
		BigInteger D = bigIntA.divide (bigIntB);
		System.out.println("dzielenie A przez B: "+ D);
		
/*J18
* Napisz program w który wykorzystasz poznane funkcje matematyczne. I wypisz ich wyniki na ekranie.   	
*/
		
		double a= 8;
		double b= 7;
		double c= pow(a,b);
		System.out.println( "liczba a podniesion¹ do potêgi b to: " + c);
		
		double d= sqrt(a);
		System.out.println( "liczba a podniesion¹ do kwadratu to: " + d);
		
		double r=5.5;
		
		double P = Math.PI;
		double pole= (PI*pow(r,2));
		System.out.println("pole ko³a: " + pole);
		
		System.out.println("obwod okregu: "+ (2*PI*r));
		
	}

}

package DrugaPaczka;

import java.util.Random;

public class J12 {
	// J12
	/* Napisz program, kt�ry wykonuje wszystkie znane Ci operacje arytmetyczne dla dw�ch liczb zadanych w programie 
	 * i w wyniku dzia�ania wy�wietla wszystkie rezultaty. */
	
	public static void main(String[] args) {
		int a=15;
		int b=12;
		
		int c= a+b;
		System.out.println("dodawanie" + c);
		float d= a/b;
		System.out.println(d);
		int e= a*b;
		System.out.println(e);
		int f= a-b;
		System.out.println(f);
		int g= a%b;
		System.out.println(f);
		System.out.println("-------------------");
		
/*J13
 * Napisz program wykonuj�cy poni�sze obliczenia: 
-5 + 8 * 6 
 (55+9) % 9  
 20 + -3*5 / 8 
 5 + 15 / 3 * 2 - 8 % 3 
 */
		int z=7;
		
		int h= -a+b;
		System.out.println(-5+8*6);
		System.out.println((55+9) %9);
		System.out.println(20+(-3*5)/8);
		System.out.println(5+15/3*2-8%3);
		
		
		
// J14    Napisz program, w kt�ry b�dzie wypisywa� dan� liczb� pomno�on� przez kolejne liczby naturalne mniejsze od 10. 	
		System.out.println("--------J14-----------program wpisuje liczb� przez kolejne liczby do 10");
		int licz1 = 1; 
			
		System.out.println(licz1++*5); 
		System.out.println(licz1++*5); 
		System.out.println(licz1++*5); 
		System.out.println(licz1++*5); 
		System.out.println(licz1++*5); 
		System.out.println(licz1++*5); 
		
		
/*Napisz program, w kt�rym zadeklarujesz dwie zmienne typu int o nazwach x oraz y. Przypisz do nich losowe, r�ne warto�ci, 
 * a nast�pnie za pomoc� operator�w logicznych i matematycznych wy�wietl wynik nast�puj�cych zda� logicznych: 
 Czy x jest wi�ksze od y? 
 Czy x pomno�one przez 2 jest wi�ksze od y?
  Czy y jest mniejsze od sumy x+3 i jednocze�nie wi�ksze od x pomniejszonego o 2? 
   Czy iloczyn liczb x i y jest parzysty? (Wykorzystaj do sprawdzenia operacj� modulo) 
 Wynik ka�dego zdania logicznego wypisuj przed wypisaniem do zmiennej typu boolean o nazwie result. 
 Podpowied�, do utworzenia losowej liczby wykorzystaj metod� Random.nextInt () , 
 aby by�o to mo�liwe, musisz j� zaimportowa� przed zdefiniowaniem klasy
 */
		System.out.println("--------J16-----------boolowskie");
		Random gen= new Random(); //cnt+shift+o �ci�ga bibliotek�//
		int x= gen.nextInt(10);
		int y= gen.nextInt(10);
		boolean result;
	
		System.out.println("x to: " + x);
		System.out.println("y to: " +y);
		
		System.out.println(x>y); 
		result = x>y;
		System.out.println((x*2)>y); 
		result = ((x*2)>y);
		System.out.println(((x+3)>y)&&(y<(x-2))); 
		result = (((x+3)>y)&&(y<(x-2)));
		System.out.println((x*y)%2==0); 
		result = ((x*y)%2==0);
		
		
		
		
		
		
		
	}
}

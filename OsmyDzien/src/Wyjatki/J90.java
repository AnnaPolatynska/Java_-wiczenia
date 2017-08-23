package Wyjatki;

import java.util.Random;

/*Napisz trzy nowe wyj�tki oraz metod�, kt�ra za ka�dym wywo�anie b�dzie losowo zg�asza�a jeden z nich. 
Otocz wywo�anie tej metody instrukcj� try-catch zawieraj�c� po jednym bloku catch dla ka�dego z wyj�tk�w. 
Niech ka�dy blok catch wypisuje, kt�ry wyj�tek z�apa�a. 
*/
public class J90 {

	private class MyException1 extends Exception{}
	private class MyException2 extends Exception{}


	public void losuj() throws MyException1, MyException2, MyExceptions{
		Random r= new Random();
		switch(r.nextInt(3)){	//chc� wylosowa� 1 z 3 opcji
		
		case 0:
			throw new MyException1();
											// wywo�anie konstruktora klasy MyException1
		case 1:
			throw new MyException2();
		case 2:
			throw new MyExceptions();
		}
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		J90 test1= new J90();				//wywo�uj� na konstruktorze domy�lnym
		try{
			test1.losuj();     				//losowanie wyj�tku
		}catch (MyException1 e){
			System.out.println("Z�apano wyj�tek 1 klasy: " + e.getClass());
		}catch (MyException2 e){
			System.out.println("Z�apano wyj�tek 2 klasy: "+ e.getClass());
		}catch (MyExceptions e){
				System.out.println("Z�apano wyj�tek 3 klasy: "+ e.getClass());
		}
				// zwraca pakiet/ klas� i numer wyj�tku = class Wyjatki.J90$MyException2

	}
}

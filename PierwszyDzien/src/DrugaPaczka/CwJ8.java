package DrugaPaczka;
//J8
/* Zadeklaruj cztery zmienne typu String.  
Dwa z nich zainicjuj jakimiœ wyrazami a trzeciemu przypisz ci¹g znaków utworzony z dwóch wczeœniejszych zmiennych.  
Do czwartej zmiennej przypisz trzeci¹ do której dodasz jeszcze jeden ci¹g znaków 
Nastêpnie wyœwietl trzeci¹ zmienn¹ wy³¹cznie przy pomocy wielkich liter i czwart¹ zmienn¹ wy³¹cznie przy pomocy ma³ych liter.  
 */
public class CwJ8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String words1= "Marchewka Pietruszka Rodzynki Ser";
		String words2= "orzechy s³onecznik dynia pestka";
		String words3 = words1 + words2;
		String words4= words3 + "KWADRAT ko³o KLEPSYDRA gwiazda ELIPSA";
		
		//1 sposób//
		String zmienna1= words1.toUpperCase();
			
		System.out.println(words1);
		System.out.println(words2);
		System.out.println(words3);
		System.out.println(words4);
		System.out.println(zmienna1);
		
		//2sposób //
		System.out.println(words4.toLowerCase());
		
//J9
//jak¹ d³ugoœæ ci¹g znaków//
/*W tym samym programie wyœwietl jak¹ d³ugoœæ ma ci¹g znaków z czwartej zmiennej 
Wyœwietl jakie znaki wystêpuj¹ na 2, 5 indeksie w trzeciej zmiennej. 
Oraz trzeci od koñca znak czwartej zmiennej. 
*/	
		System.out.println(words4);
		
		System.out.println("zmienna ma d³ugoœæ: " + words1.length());
		System.out.println("znak na 2 i 5 pozycji to: " + words4.charAt(2)+words4.charAt(5));
		System.out.println("trzeci od koñca to: " + words4.charAt(words4.length()-3));
		
		
	
	}

}

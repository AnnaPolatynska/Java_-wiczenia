package DrugaPaczka;
//J8
/* Zadeklaruj cztery zmienne typu String.  
Dwa z nich zainicjuj jakimi� wyrazami a trzeciemu przypisz ci�g znak�w utworzony z dw�ch wcze�niejszych zmiennych.  
Do czwartej zmiennej przypisz trzeci� do kt�rej dodasz jeszcze jeden ci�g znak�w 
Nast�pnie wy�wietl trzeci� zmienn� wy��cznie przy pomocy wielkich liter i czwart� zmienn� wy��cznie przy pomocy ma�ych liter.  
 */
public class CwJ8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String words1= "Marchewka Pietruszka Rodzynki Ser";
		String words2= "orzechy s�onecznik dynia pestka";
		String words3 = words1 + words2;
		String words4= words3 + "KWADRAT ko�o KLEPSYDRA gwiazda ELIPSA";
		
		//1 spos�b//
		String zmienna1= words1.toUpperCase();
			
		System.out.println(words1);
		System.out.println(words2);
		System.out.println(words3);
		System.out.println(words4);
		System.out.println(zmienna1);
		
		//2spos�b //
		System.out.println(words4.toLowerCase());
		
//J9
//jak� d�ugo�� ci�g znak�w//
/*W tym samym programie wy�wietl jak� d�ugo�� ma ci�g znak�w z czwartej zmiennej 
Wy�wietl jakie znaki wyst�puj� na 2, 5 indeksie w trzeciej zmiennej. 
Oraz trzeci od ko�ca znak czwartej zmiennej. 
*/	
		System.out.println(words4);
		
		System.out.println("zmienna ma d�ugo��: " + words1.length());
		System.out.println("znak na 2 i 5 pozycji to: " + words4.charAt(2)+words4.charAt(5));
		System.out.println("trzeci od ko�ca to: " + words4.charAt(words4.length()-3));
		
		
	
	}

}

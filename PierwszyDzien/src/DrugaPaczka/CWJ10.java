package DrugaPaczka;
//J10
/*Przy u¿yciu metody substring wyœwietl na ekranie dwa pierwsze wyrazy wykorzystuj¹c wy³¹cznie czwart¹ zmienn¹ typu String*/
public class CWJ10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1= "Marchewka";
		String s2 ="Pietruszka";
		String s4= s1+s2;
		
		
		System.out.println("zmienna 1 ma d³ugoœæ: " + s1.length());
		System.out.println("zmienna 2 ma d³ugoœæ: " + s2.length());
		
				String hello = "Witaj ";
				String world = "Œwiecie!";
				String powitanie = hello+world;
				System.out.println(powitanie);
				
				String czesc = powitanie.substring(0, 6) + "uczniu";
				System.out.println(czesc);

			}
			
		
		
	}


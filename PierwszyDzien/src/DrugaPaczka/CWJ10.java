package DrugaPaczka;
//J10
/*Przy u�yciu metody substring wy�wietl na ekranie dwa pierwsze wyrazy wykorzystuj�c wy��cznie czwart� zmienn� typu String*/
public class CWJ10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1= "Marchewka";
		String s2 ="Pietruszka";
		String s4= s1+s2;
		
		
		System.out.println("zmienna 1 ma d�ugo��: " + s1.length());
		System.out.println("zmienna 2 ma d�ugo��: " + s2.length());
		
				String hello = "Witaj ";
				String world = "�wiecie!";
				String powitanie = hello+world;
				System.out.println(powitanie);
				
				String czesc = powitanie.substring(0, 6) + "uczniu";
				System.out.println(czesc);

			}
			
		
		
	}


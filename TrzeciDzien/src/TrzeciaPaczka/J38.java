package TrzeciaPaczka;
import java.util.Random;
import java.util.Scanner;
public class J38 {
//J38
	/*Gra w �Za du�o, za ma�o�. 
	 * Komputer losuje liczb� z zakresu 1...100, a gracz (u�ytkownik) ma za zadanie odgadn��, 
	 * co to za liczba poprzez podawanie kolejnych warto�ci. Je�eli podana warto�� jest: 
	 * wi�ksza � wy�wietlany jest komunikat �Poda�e� za du�� warto��,  
	 * mniejsza � wy�wietlany jest komunikat �Poda�e� za ma�� warto��,  
	 * identyczna z wylosowan� � wy�wietlany jest komunikat �Gratulacje� i gra si� ko�czy. */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
// zgadywanie liczb----------------------------------------------------------OK
		Random generator = new Random();
		Scanner rl = new Scanner (System.in);
		int res = (int)generator.nextInt(100);
		System.out.println("");
		int proba;
		
		do{
			System.out.println("podaj liczb�");
			proba =rl.nextInt();
			if(res < proba){
				System.out.println("za du�o");
			}else if (res>proba){
				System.out.println("za ma�o");
			}else{
				System.out.println("Gratulacje! to ta liczba");
				}
			}while(proba !=res);
		System.out.println("Szukana liczba to " + res);
			
			rl.close();
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}



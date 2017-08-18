package TrzeciaPaczka;
import java.util.Random;
import java.util.Scanner;
public class J38 {
//J38
	/*Gra w ”Za du¿o, za ma³o”. 
	 * Komputer losuje liczbê z zakresu 1...100, a gracz (u¿ytkownik) ma za zadanie odgadn¹æ, 
	 * co to za liczba poprzez podawanie kolejnych wartoœci. Je¿eli podana wartoœæ jest: 
	 * wiêksza – wyœwietlany jest komunikat „Poda³eœ za du¿¹ wartoœæ”,  
	 * mniejsza – wyœwietlany jest komunikat „Poda³eœ za ma³¹ wartoœæ”,  
	 * identyczna z wylosowan¹ – wyœwietlany jest komunikat „Gratulacje” i gra siê koñczy. */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
// zgadywanie liczb----------------------------------------------------------OK
		Random generator = new Random();
		Scanner rl = new Scanner (System.in);
		int res = (int)generator.nextInt(100);
		System.out.println("");
		int proba;
		
		do{
			System.out.println("podaj liczbê");
			proba =rl.nextInt();
			if(res < proba){
				System.out.println("za du¿o");
			}else if (res>proba){
				System.out.println("za ma³o");
			}else{
				System.out.println("Gratulacje! to ta liczba");
				}
			}while(proba !=res);
		System.out.println("Szukana liczba to " + res);
			
			rl.close();
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}



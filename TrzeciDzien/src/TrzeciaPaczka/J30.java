package TrzeciaPaczka;
import java.util.Scanner;
// J30
/*Napisz program, kt�ry pobiera od u�ytkownika liczb� ca�kowit� dodatni�, 
 * a nast�pnie wy�wietla na ekranie kolejno wszystkie liczby nieparzyste nie wi�ksze od podanej liczby. 
 * Przyk�ad, dla 15 program powinien wy�wietli� 1, 3, 5, 7, 9, 11, 13, 15.
 * */ 
public class J30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//liczby nieparzyste nie wi�ksze od podanej liczby
		
		
		Scanner L = new Scanner(System.in);
		System.out.println("Podaj liczb� ca�kowit� wi�ksz� od zera: ");
		int liczb = L.nextInt();
		
		while(liczb<1)
		liczb=L.nextInt();
		
		for(int i = 1; i <= liczb; i=i+2){
		System.out.println(i);
			
		
		}
		
		L.close();
		
		//wz�r 2 spos�b ->M
		/*public static void main(String[] args) {
			Scanner num = new Scanner(System.in);
			System.out.println("Podaj liczb� ca�kowit� wi�ksz� od zera");
			int lim = num.nextInt();
			if (lim > 0){
				for (int i = 1; i<=lim; i++){
						if(i%2 != 0){
							System.out.println(i);
						}
				}
			} else { 
				System.out.println("Liczba musi by� wi�ksza od zera!");
			}
			num.close();
		
		*/
		
		
		
		
		
		
		
		/*Scanner n = new Scanner(System.in);
		Scanner txt = new Scanner(System.in);
		System.out.println("Podaj ile razy chcesz wypisa� tekst (max: 10)");
		int liczba = n.nextInt();
		
		String[] teksty = new String[liczba];
		
		for(int i = 0; i <= liczba-1; i++){
			System.out.println("Podaj tekst do wy�wietlenia");
			String text = txt.nextLine();
			teksty[i] = text;		
		}
		txt.close();
		int j = liczba-1;
		System.out.println("Z while");
		while(j >= 0){
			System.out.println(teksty[j]);
			j --;
		}
		System.out.println("Z for each");
		for(String var: teksty){
			System.out.println(var);
		}
		n.close();
		
		
		*/
		
	}

}

package Wyjatki;

import java.util.Scanner;

public class TabliceWyjatki {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// z ograniczeniem ilo�ci wprowadzanych znak�w
		
		Scanner sc=new Scanner(System.in);
		 
		String[] liczby = new String [10];
		String dec;
		int i=0;
		int index;

		while (true){
			System.out.println("podaj element tablicy: (Q) wyj�cie");
			dec=sc.nextLine();
			if(dec.equals("Q")){
				System.out.println(" wyj�cie");
				break;
			}else{
				// nie spe�nia wymogu 10 danych wprowadzanych do tablicy uwaga {}
			}
				liczby[i] = dec;
				i++;
				//by przy kolejnym wprowadza�o do kolejnego indeksu
			}
					}
		while(true){
			try{			
			System.out.println("wybierz element kt�ry chcesz wy�wietli�  (Q) wyj�cie");
			index = sc.nextInt();
			if(index==0){
				System.out.println(" wyj�cie");
				break;
			}
			System.out.println(liczby[index-1]);
			}catch(InputMismatchException e){
				System.out.println("nale�y poda� liczb�");
				sc.nextLine();
			}catch{ArrayIndexOutOfBoundsException e){
				System.out.println("nie ma takiego indeksu");
				sc.nextLine();
				
			}

			
			
			
		sc.close();
		}

			}
		
		
		
		
		
		/*
 Scanner sc=new Scanner(System.in);
 
String[] liczby = new String [10];
String dec;
int i=0;
int index;

while (true){
	System.out.println("podaj element tablicy: (Q) wyj�cie");
	dec=sc.nextLine();
	if(dec.equals("Q")){
		System.out.println(" wyj�cie");
		break;
	}else{
		// nie spe�nia wymogu 10 danych wprowadzanych do tablicy uwaga {}
	}
		liczby[i] = dec;
		i++;
		//by przy kolejnym wprowadza�o do kolejnego indeksu
	}
			}
while(true){
	try{			
	System.out.println("wybierz element kt�ry chcesz wy�wietli�  (Q) wyj�cie");
	index = sc.nextInt();
	if(index==0){
		System.out.println(" wyj�cie");
		break;
	}
	System.out.println(liczby[index-1]);
	}catch(InputMismatchException e){
		System.out.println("nale�y poda� liczb�");
		sc.nextLine();
	}catch{ArrayIndexOutOfBoundsException e){
		System.out.println("nie ma takiego indeksu");
		sc.nextLine();
		
	}

	
	
	
sc.close();
}

	}
*/


		/*2
		String[] liczby = new String [10];
		String dec;
		int i=0;
		int index;
	
		while (true){
			System.out.println("podaj element tablicy: (Q) wyj�cie");
			dec=sc.nextLine();
			if(dec.equals("Q")){
				System.out.println(" wyj�cie");
				break;
			}else{
				liczby[i] = dec;
				i++;
				//by przy kolejnym wprowadza�o do kolejnego indeksu
			}
					}
		while(true){
			System.out.println("wybierz element kt�ry chcesz wy�wietli�  (Q) wyj�cie");
			index = sc.nextInt();
			if(index==0){
				System.out.println(" wyj�cie");
				break;
			}
			System.out.println(liczby[index-1]);
		}
		
		sc.close();
	}

}

*/



		/* samo wprowadzenie
		Scanner sc=new Scanner(System.in);
		
		String[] liczby = new String [10];
		String dec;
		int i=0;
	
		while (true){
			System.out.println("podaj element tablicy: (Q) wyj�cie");
			dec=sc.nextLine();
			if(dec.equals("Q")){
				System.out.println(" wyj�cie");
				break;
			}else{
				liczby[i] = dec;
				i++;
				//by przy kolejnym wprowadza�o do kolejnego indeksu
			}
			
		}
		sc.close();
	}

}
*/
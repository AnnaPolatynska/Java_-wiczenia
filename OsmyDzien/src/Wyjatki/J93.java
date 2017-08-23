package Wyjatki;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*Napisz program w kt�rym u�ytkownik b�dzie mia� poda� �cie�k� dost�pu do pliku.  
 * Gdy b�dzie poprawna nale�y wy�wietli� zawarto�� pliku na ekranie 
 * W przypadku gdy b�dzie ona b��dna nale�y obs�u�y� wyj�tek i poprosi� u�ytkownika o poprawn� �cie�k�.  
 */
public class J93 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String path= "";
		boolean error = true;
		while(error){	//flaga do boolana je�eli zmieni si� na false ko�czy dzia�anie bo brak b�edu
			try{
				System.out.println("wpisz �cie�k� dost�pu do plikuJ81");
				path = sc.nextLine();
				File testFile= new File(path);
		
				Scanner fsc = new Scanner(testFile);
		
				while(fsc.hasNextLine()){
					System.out.println(fsc.nextLine());
				}
				fsc.close();
				error=false;
			}catch(FileNotFoundException e){
				System.out.println("z�a �cie�ka jeszcze raz");
			}
		
		}
		sc.close();
	}
}
// je�eli wpisze dobr� �cie�k� to wypisze zawarto�� pliku C:\Users\Ania\Desktop\J81.txt

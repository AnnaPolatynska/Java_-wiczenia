package Wyjatki;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*Napisz program w którym u¿ytkownik bêdzie mia³ podaæ œcie¿kê dostêpu do pliku.  
 * Gdy bêdzie poprawna nale¿y wyœwietliæ zawartoœæ pliku na ekranie 
 * W przypadku gdy bêdzie ona b³êdna nale¿y obs³u¿yæ wyj¹tek i poprosiæ u¿ytkownika o poprawn¹ œcie¿kê.  
 */
public class J93 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String path= "";
		boolean error = true;
		while(error){	//flaga do boolana je¿eli zmieni siê na false koñczy dzia³anie bo brak b³edu
			try{
				System.out.println("wpisz œcie¿kê dostêpu do plikuJ81");
				path = sc.nextLine();
				File testFile= new File(path);
		
				Scanner fsc = new Scanner(testFile);
		
				while(fsc.hasNextLine()){
					System.out.println(fsc.nextLine());
				}
				fsc.close();
				error=false;
			}catch(FileNotFoundException e){
				System.out.println("z³a œcie¿ka jeszcze raz");
			}
		
		}
		sc.close();
	}
}
// je¿eli wpisze dobr¹ œcie¿kê to wypisze zawartoœæ pliku C:\Users\Ania\Desktop\J81.txt

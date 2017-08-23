package pliki;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
/*Napisz program kt�ry b�dzie pobiera� ci�gi znak�w od u�ytkownika i b�dzie je zapisywa� w kolejnych liniach pliku tekstowego 
 * dop�ki u�ytkownik nie w pisz� �koniec� 
 * Nast�pnie wy�wietl ca�y zawarto�� pliku do kt�rego zosta� wpisany tekst. 
 */
 // ==========================================================================================================                    OK
public class J83 {
	public static void main(String[] arg) throws FileNotFoundException{
		File plik = new File("J83");
		Scanner odczyt = new Scanner(System.in);
		
		PrintWriter zapis = new PrintWriter("J83.txt");
		zapis.println("  ");
		String end = "";
		
		System.out.println("wypisz kolejne linie do pliku: ");
		//equals gdy ma wpisa� sam "koniec" a contains gdy w tek�cie wpisywanym wyst�pi s�owo koniec
		while (!end.toLowerCase().equals("koniec")){
			end=odczyt.nextLine();
			if(!end.toLowerCase().equals("koniec")){
				zapis.println(end);
			}
		}
		zapis.close();
	
		//odczyt
		
		Scanner odczyt2 = new Scanner("J83.txt");
		while (odczyt2.hasNextLine()){
			System.out.println(odczyt2.nextLine());
		}
			odczyt.close();
			odczyt2.close();
		}
}
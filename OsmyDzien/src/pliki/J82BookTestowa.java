package pliki;
import java.io.File;
/*Stw�rz klas� Book, kt�ra b�dzie mia�a pola nazwa, autor, rokWydania. 
Odczytaj z pliku dane nazwa, autor, rokWydania kt�re b�d� przedzielone przecinkiem i stw�rz obiekty klasy Book na podstawie danych odczytanych z pliku.  
Nast�pnie wypisz dane wszystkich stworzonych obiekt�w typu Book.  
*/
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class J82BookTestowa {
	public static void main(String[] arg) throws FileNotFoundException{
		
		ArrayList<J82Book>myBooks= new ArrayList<>();
		
		File myBook = new File("J82.txt");
		Scanner odczyt = new Scanner(myBook);
		// tworzy wzorzec = przycina po autorze, roku wydania itd i wstawia przecinek
		odczyt.useDelimiter(",|\r\n");
		while(odczyt.hasNextLine()){
			String odczytNazwa = odczyt.next();
			String odczytAutor = odczyt.next();
			String odczytRok = odczyt.next();
			
			J82Book nextBook = new J82Book(odczytNazwa, odczytAutor,odczytRok );
			myBooks.add(nextBook);
		}
		System.out.println("moje ksi��ki");
		for(J82Book b :myBooks){
			System.out.println("Nazwa: "+ b.getNazwa()+"\nAutor: "+ b.getAutor()+"\nRok: " +b.getRok());
		}
		
		
		odczyt.close();
	}
}

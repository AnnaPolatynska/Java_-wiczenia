package pliki;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Pliki_testowe {

	public static void main(String[] args) throws FileNotFoundException {
		File plik = new File("Pliczek.txt");
		Scanner stream = new Scanner(plik);
		/*PrintWriter zapis = new PrintWriter("Pliczek.txt");
		zapis.println("Ala ma kota, a kot ma Al�");
		zapis.close();
		String text = stream.nextLine();
		System.out.println(text);
		stream.close();*/

	}

}

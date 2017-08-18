import java.io.FilterInputStream;
import java.util.Locale;
import java.util.Scanner;
/*J 19
 *  Napisz program który pobiera od u¿ytkownika imiê i wyœwietla napis „Witaj na kursie Javy!!!”. 
 */
public class J19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(new FilterInputStream(System.in){
			@Override
			public void close(){}
		});
		
		
		System.out.println("Podaj Imie: ");
		String imie = input.nextLine(); // nextLine() – odczytuje kolejny wiersz String 
		System.out.println(imie + ", witaj na kursie Javy :-)");
		input.close();

		
	}

}

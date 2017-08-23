package J84;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/*Napisz aplikację, która będzie pozwalała wczytać informacje o pracownikach firmy, albo pobierając je od użytkownika, albo wczytując je z dysku.  
Klasy, które powinna posiadać aplikacja:  Person - klasa reprezentująca osobę (imię nazwisko) 
Employee - klasa reprezentująca pracownika (imię, nazwisko, wypłata) - rozszerza klasę Person 
Company - klasa przechowująca tablicę pracowników, powinna móc przechowywać informacje o 3 pracownikach 
CompanyApp - klasa, która pozwala wczytywać dane od użytkownika i zapisać je na dysku lub odczytać dane z dysku i wyświetlić je na ekranie. 
*/
//---------------------------------------------------------------------------------------------------------menu wpisywanie do pliku
//w1 zapis za while zamknij plik po wpisaniu
public class CompanyApp {
public static void main(String[] args) throws IOException {
	Scanner rl = new Scanner(System.in);
	Company comp = new Company();
	File f1 = new File("Firma.txt");
	Scanner odczyt = new Scanner(f1);
	
	String end = "";
	int i = 0;
	while(true){
		System.out.println("(1)-zapis, (2)-odczyt, (3)-koniec");
		end = rl.nextLine();
		if(end.equals("1")){				//zapis
			// Dopisywanie do pliku -> (true)
			FileWriter w1 = new FileWriter(f1, true);
			while(i < comp.getPracownicy().length){					
				Employee emp = new Employee();
				System.out.println("Podaj imię: ");
				end = rl.nextLine();
				emp.setImie(end);
				w1.write(end +", ");
				
				System.out.println("Podaj nazwisko: ");
				end = rl.nextLine();
				emp.setNazwisko(end);
				w1.write(end+", ");
				
				System.out.println("Podaj pensja: ");
				end = rl.nextLine();
				emp.setWyplata(end);
				w1.write(end + "\n");
				i ++;
			}
			w1.close();
		} else if (end.equals("2")){		//odczyt
			Scanner rl1 = new Scanner(f1);
			while(rl1.hasNextLine()){
				System.out.println(rl1.nextLine());
			}
			rl1.close();
		} else if (end.equals("3")){		//wyjście
			break;
		}
	}
	rl.close(); odczyt.close();
}
}

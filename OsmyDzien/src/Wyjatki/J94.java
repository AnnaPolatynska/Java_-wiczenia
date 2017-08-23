package Wyjatki;

import java.util.InputMismatchException;
import java.util.Scanner;

/*Napisz program kt�ry zbiera informacje o u�ytkownikach imi�, nazwisko, wiek. Je�eli kt�ra� z warto�ci jest b��dna nale�y zwr�ci� wyj�tek o 
 * tym �e warto�� jest b��dna. Np.. puste imi� itd.. 
 * Nast�pnie po wy�wietleniu komunikatu wyj�tku nale�y ponowi� pr�b� pozyskania danej kt�ra by�a b��dna. 
 * Na koniec wszystkie dane o wpisanych u�ytkownikach trzeba zapisa� do pliku. I wy�wietli� zawarto�� pliku. 
 */
public class J94 {

	J94(){
		
	}
	
	public void odczytString(String nazwaDanej){
		System.out.println(" ");
		
	}
	
	public void odczytInt(int nazwaDanej){
		System.out.println(" ");
	}
	//nullPointer nie stwierdzi czy to string bo widzi jako string o 0 znak�w, muszisz po d�ugo�ci
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		User u1 = new User();
		
		while(true){
		System.out.println("Podaj imie");
		try{
		String imie_sc = sc.nextLine();
		if(imie_sc.isEmpty()){
			throw new NullPointerException();
		}
		u1.setImie(imie_sc);
		break;
		} catch (NullPointerException e){
			System.out.println("Imie nie mo�e by� puste");
		}
		}
		while(true){
		System.out.println("Podaj nazwisko");
		try{
		String nazwisko_sc = sc.nextLine();
		if(nazwisko_sc.isEmpty()){
			throw new NullPointerException();
		}
		u1.setNazwisko(nazwisko_sc);
		break;
		} catch (NullPointerException e){
			System.out.println("nazwisko nie mo�e by� puste");
		}
		}
		while(true){
		System.out.println("Podaj wiek");
		try{
		int wiek_sc = sc.nextInt();
		u1.setWiek(wiek_sc);
		break;
		} catch (InputMismatchException e){
			System.out.println("Wiek musi by� int");
			sc.nextLine();
		}		
		}
		System.out.println(u1.getImie() + u1.getNazwisko() + u1.getWiek());
		
		sc.close();
	}
}


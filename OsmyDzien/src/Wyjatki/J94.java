package Wyjatki;

import java.util.InputMismatchException;
import java.util.Scanner;

/*Napisz program który zbiera informacje o u¿ytkownikach imiê, nazwisko, wiek. Je¿eli któraœ z wartoœci jest b³êdna nale¿y zwróciæ wyj¹tek o 
 * tym ¿e wartoœæ jest b³êdna. Np.. puste imiê itd.. 
 * Nastêpnie po wyœwietleniu komunikatu wyj¹tku nale¿y ponowiæ próbê pozyskania danej która by³a b³êdna. 
 * Na koniec wszystkie dane o wpisanych u¿ytkownikach trzeba zapisaæ do pliku. I wyœwietliæ zawartoœæ pliku. 
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
	//nullPointer nie stwierdzi czy to string bo widzi jako string o 0 znaków, muszisz po d³ugoœci
	
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
			System.out.println("Imie nie mo¿e byæ puste");
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
			System.out.println("nazwisko nie mo¿e byæ puste");
		}
		}
		while(true){
		System.out.println("Podaj wiek");
		try{
		int wiek_sc = sc.nextInt();
		u1.setWiek(wiek_sc);
		break;
		} catch (InputMismatchException e){
			System.out.println("Wiek musi byæ int");
			sc.nextLine();
		}		
		}
		System.out.println(u1.getImie() + u1.getNazwisko() + u1.getWiek());
		
		sc.close();
	}
}


package J65;

/*Napisz program który bêdzie imitowa³ magazyn.  Z wykorzystaniem obiektowoœci.  
 Menu wyboru co chcemy zrobiæ w programie: 
 przyjmowaæ / wydawaæ produkty z magazynu 
 Dodawaæ produkty i ich ceny 
 Kasowaæ produkty 
 Sprawdzaæ stany magazynowe produktów.  
 Pokazywaæ ceny produktów 
 Przy pokazywaniu ceny produktu nale¿y uwzglêdniæ ró¿ne stawki vat które mog¹ byæ okreœlane przez u¿ytkownika.  
 */

//======================================================================bez zmiany stanu produktów=============dodaj /usuñ / wyjœcie  OK

import java.util.ArrayList;
import java.util.Scanner;

public class Magazyn {
	private String nazwa; 
	private int cena;
	private int ilosc;
	public int id = 1;
	public ArrayList<Magazyn> produkty = new ArrayList<Magazyn>();
	Scanner sc = new Scanner(System.in);
	
	public String getNazwa() {
		return nazwa;
	}
	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}
	public int getCena() {
		return cena;
	}
	public void setCena(int cena) {
		this.cena = cena;
	}
	public int getIlosc() {
		return ilosc;
	}
	public void setIlosc(int ilosc) {
		this.ilosc = ilosc;
	}
	public void dodajProdukt(Magazyn m1){
		sc.nextLine();
		
		System.out.println("Podaj nazwê: ");
		m1.setNazwa(sc.nextLine());
		System.out.println("Podaj cenê: ");
		m1.setCena(sc.nextInt());
		System.out.println("Podaj iloœæ: ");
		m1.setIlosc(sc.nextInt());
		produkty.add(m1);
	}
	public void usunProdukt(Magazyn m1){
		System.out.println("Podaj id produktu do usuniêcia: ");
		id = sc.nextInt();
		produkty.remove(id-1);
		System.out.println("Produkt usuniêto!");
	}
	
	///sprawdzamy listê produktów For-each po liœcie produktów
	public void stanyProdukty(){
		for(Magazyn m1 : produkty){
		System.out.println("Id: " + id);
		System.out.println("Nazwa: " + m1.getNazwa());
		System.out.println("Cena: " + m1.getCena());
		System.out.println("Ilosc: " +m1.getIlosc());
		System.out.println("==============================");
		}
	}
}
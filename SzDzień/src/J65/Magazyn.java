package J65;

/*Napisz program kt�ry b�dzie imitowa� magazyn.  Z wykorzystaniem obiektowo�ci.  
 Menu wyboru co chcemy zrobi� w programie: 
 przyjmowa� / wydawa� produkty z magazynu 
 Dodawa� produkty i ich ceny 
 Kasowa� produkty 
 Sprawdza� stany magazynowe produkt�w.  
 Pokazywa� ceny produkt�w 
 Przy pokazywaniu ceny produktu nale�y uwzgl�dni� r�ne stawki vat kt�re mog� by� okre�lane przez u�ytkownika.  
 */

//======================================================================bez zmiany stanu produkt�w=============dodaj /usu� / wyj�cie  OK

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
		
		System.out.println("Podaj nazw�: ");
		m1.setNazwa(sc.nextLine());
		System.out.println("Podaj cen�: ");
		m1.setCena(sc.nextInt());
		System.out.println("Podaj ilo��: ");
		m1.setIlosc(sc.nextInt());
		produkty.add(m1);
	}
	public void usunProdukt(Magazyn m1){
		System.out.println("Podaj id produktu do usuni�cia: ");
		id = sc.nextInt();
		produkty.remove(id-1);
		System.out.println("Produkt usuni�to!");
	}
	
	///sprawdzamy list� produkt�w For-each po li�cie produkt�w
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
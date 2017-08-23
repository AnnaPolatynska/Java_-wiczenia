package J84;
/*Napisz aplikacjê, która bêdzie pozwala³a wczytaæ informacje o pracownikach firmy, albo pobieraj¹c je od u¿ytkownika, albo wczytuj¹c je z dysku.  
Klasy, które powinna posiadaæ aplikacja: 
Person - klasa reprezentuj¹ca osobê (imiê nazwisko) 
Employee - klasa reprezentuj¹ca pracownika (imiê, nazwisko, wyp³ata) - rozszerza klasê Person 
Company - klasa przechowuj¹ca tablicê pracowników, powinna móc przechowywaæ informacje o 3 pracownikach 
CompanyApp - klasa, która pozwala wczytywaæ dane od u¿ytkownika i zapisaæ je na dysku lub odczytaæ dane z dysku i wyœwietliæ je na ekranie. 
*/
public class Person {

	private String imie;
	private String nazwisko;
	
	public String getImie() {
		return imie;
	}
	public void setImie(String imie) {
		this.imie = imie;
	}
	public String getNazwisko() {
		return nazwisko;
	}
	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}
}
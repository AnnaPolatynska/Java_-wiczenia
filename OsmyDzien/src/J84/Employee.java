package J84;
/*Napisz aplikacj�, kt�ra b�dzie pozwala�a wczyta� informacje o pracownikach firmy, albo pobieraj�c je od u�ytkownika, albo wczytuj�c je z dysku.  
Klasy, kt�re powinna posiada� aplikacja: 
 Person - klasa reprezentuj�ca osob� (imi� nazwisko) 
Employee - klasa reprezentuj�ca pracownika (imi�, nazwisko, wyp�ata) - rozszerza klas� Person 
Company - klasa przechowuj�ca tablic� pracownik�w, powinna m�c przechowywa� informacje o 3 pracownikach 
CompanyApp - klasa, kt�ra pozwala wczytywa� dane od u�ytkownika i zapisa� je na dysku lub odczyta� dane z dysku i wy�wietli� je na ekranie. 
*/
public class Employee extends Person{
		private String wyplata;

		public String getWyplata() {
			return wyplata;
		}
		public void setWyplata(String wyplata) {
			this.wyplata = wyplata;
	}
}
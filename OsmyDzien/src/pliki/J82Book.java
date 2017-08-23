package pliki;
/*Stwórz klasê Book, która bêdzie mia³a pola nazwa, autor, rokWydania. 
Odczytaj z pliku dane nazwa, autor, rokWydania które bêd¹ przedzielone przecinkiem i stwórz obiekty klasy Book na podstawie danych odczytanych z pliku.  
Nastêpnie wypisz dane wszystkich stworzonych obiektów typu Book.  
*/
public class J82Book {

	private String nazwa;
	private String autor;
	private String rok;
	
	public String getNazwa() {
		return nazwa;
	}
	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getRok() {
		return rok;
	}
	public void setRokWydania(String rok) {
		this.rok = rok;
	}
	
	public J82Book(String nazwa, String autor, String rok) {
		super();
		this.nazwa = nazwa;
		this.autor = autor;
		this.rok = rok;
	}
	
	
}

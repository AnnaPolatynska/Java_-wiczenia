package J66;
/*J66
 * Utw�rz program sk�adaj�cy si� z dw�ch klas: 
 Student - pozwala przechowywa� informacj� o imieniu, nazwisku i numerze indeksu studenta 
 University - klasa z metod� main, w kt�rej utworzysz kilku (co najmniej 2 student�w) 
 W klasie Student zdefiniuj zmienn� statyczn�, kt�ra wraz z tworzeniem nowego obiektu tej klasy b�dzie zwi�kszana, 
 a tym samym pozwoli �ledzi� ilo�� student�w na uczelni. 

 Po utworzeniu co najmniej dw�ch student�w w klasie university, wy�wietl liczb� student�w na uczelni. 
 * */
public class Uniwesytet {

	public static void main(String[] args) {

Student s1 = new Student("adam", "Kowalski", 56896);
Student s2 = new Student("Jan", "Wi�niewski", 56153);
Student s3 = new Student("Alicja", "Wi�niewska", 56666);
	}

}

package J66;
/*J66
 * Utwórz program sk³adaj¹cy siê z dwóch klas: 
 Student - pozwala przechowywaæ informacjê o imieniu, nazwisku i numerze indeksu studenta 
 University - klasa z metod¹ main, w której utworzysz kilku (co najmniej 2 studentów) 
 W klasie Student zdefiniuj zmienn¹ statyczn¹, która wraz z tworzeniem nowego obiektu tej klasy bêdzie zwiêkszana, 
 a tym samym pozwoli œledziæ iloœæ studentów na uczelni. 

 Po utworzeniu co najmniej dwóch studentów w klasie university, wyœwietl liczbê studentów na uczelni. 
 * */
public class Uniwesytet {

	public static void main(String[] args) {

Student s1 = new Student("adam", "Kowalski", 56896);
Student s2 = new Student("Jan", "Wiœniewski", 56153);
Student s3 = new Student("Alicja", "Wiœniewska", 56666);
	}

}

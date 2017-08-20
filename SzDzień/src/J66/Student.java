package J66;
/*J66
 * Utwórz program sk³adaj¹cy siê z dwóch klas: 
 Student - pozwala przechowywaæ informacjê o imieniu, nazwisku i numerze indeksu studenta 
 University - klasa z metod¹ main, w której utworzysz kilku (co najmniej 2 studentów) 
 W klasie Student zdefiniuj zmienn¹ statyczn¹, która wraz z tworzeniem nowego obiektu tej klasy bêdzie zwiêkszana, 
 a tym samym pozwoli œledziæ iloœæ studentów na uczelni. 

 Po utworzeniu co najmniej dwóch studentów w klasie university, wyœwietl liczbê studentów na uczelni. 
 * */
public class Student {

	
	private String imie, nazwisko;
	private int index;
	public static int id;  //musi byæ static
	
	public Student(String imie, String nazwisko, int index){
		id++;
		this.imie = imie;
		this.nazwisko=nazwisko;
		this.index=index;
		System.out.println("mamy ju¿ "+id+"studentów");
		}
	
}

package J72;
/*Stw�rz klas� Organizm zawieraj�c� dowolne pola i metody, kt�re mo�na by przypisa� wersji dowolnego organizmu. 
 * 
 * 
 * 
 * Nast�pnie stw�rz klasy Bakteria , Ro�lina oraz Zwierz� dziedzicz�ce cechy po klasie Organizm ale tak�e dostosowuj�c je 
 * do charakterystyki tych grup organizm�w. 
 * �wiczenia J75 
W osobnej klasie napisz program, kt�ry stworzy obiekty typu Zwierze, Bakteria oraz Roslina oraz ich u�yje, najlepiej w formie 
interakcji mi�dzy tymi obiektami (np. zwierz� �zjada� ro�lin� albo �walczy� z innym zwierz�ciem). */
public class OrganizmyTestowe {
	
		public static void main(String[] args) {
			Bakteria b1 = new Bakteria();
			b1.przypiszDna("bakterii AACEDDEDAAE");
			b1.zmienSzkodliwosc("bardzo szkodliwa");
			b1.info();
			
			Zwierze z1 = new Zwierze();
			z1.przypiszDna("Zwierzaka CCADDEAACCCEDAAA");
			z1.zmienNogi(9);
			z1.info();
//ro�lina
			Roslina r1 = new Roslina();
			r1.przypiszDna("Rosliny ACCDACCE");
			r1.zmienDl_lodygi(36);
			r1.info();
			
			z1.eat(r1);
			z1.eat(z1);
			
		}
}

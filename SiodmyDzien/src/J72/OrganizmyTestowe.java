package J72;
/*Stw�rz klas� Organizm zawieraj�c� dowolne pola i metody, kt�re mo�na by przypisa� wersji dowolnego organizmu. 
 * 
 * 
 * 
 * Nast�pnie stw�rz klasy Bakteria , Ro�lina oraz Zwierz� dziedzicz�ce cechy po klasie Organizm ale tak�e dostosowuj�c je 
 * do charakterystyki tych grup organizm�w. */
public class OrganizmyTestowe {
	
		public static void main(String[] args) {
			Bakteria b1 = new Bakteria();
			b1.przypiszDna("dna bakterii: AACEDDEDAAE");
			b1.zmienSzkodliwosc("bardzo szkodliwa");
			b1.info();
			
			Zwierze z1 = new Zwierze();
			z1.przypiszDna("Dna zwierzaka: CCADDEAACCCEDAAA");
			z1.zmienNogi(9);
			z1.info();
//ro�lina
			Roslina r1 = new Roslina();
			r1.przypiszDna("Dna ro�liny: ACCDACCE");
			r1.zmienDl_lodygi(36);
			r1.info();
			
			z1.eat(r1);
			z1.eat(z1);
			
		}
}

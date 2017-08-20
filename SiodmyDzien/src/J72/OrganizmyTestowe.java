package J72;
/*Stwórz klasê Organizm zawieraj¹c¹ dowolne pola i metody, które mo¿na by przypisaæ wersji dowolnego organizmu. 
 * 
 * 
 * 
 * Nastêpnie stwórz klasy Bakteria , Roœlina oraz Zwierzê dziedzicz¹ce cechy po klasie Organizm ale tak¿e dostosowuj¹c je 
 * do charakterystyki tych grup organizmów. */
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
//roœlina
			Roslina r1 = new Roslina();
			r1.przypiszDna("Dna roœliny: ACCDACCE");
			r1.zmienDl_lodygi(36);
			r1.info();
			
			z1.eat(r1);
			z1.eat(z1);
			
		}
}

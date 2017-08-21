package J72;
/*Stwórz klasê Organizm zawieraj¹c¹ dowolne pola i metody, które mo¿na by przypisaæ wersji dowolnego organizmu. 
 * 
 * 
 * 
 * Nastêpnie stwórz klasy Bakteria , Roœlina oraz Zwierzê dziedzicz¹ce cechy po klasie Organizm ale tak¿e dostosowuj¹c je 
 * do charakterystyki tych grup organizmów. 
 * Æwiczenia J75 
W osobnej klasie napisz program, który stworzy obiekty typu Zwierze, Bakteria oraz Roslina oraz ich u¿yje, najlepiej w formie 
interakcji miêdzy tymi obiektami (np. zwierzê „zjada” roœlinê albo „walczy” z innym zwierzêciem). */
public class Roslina extends Organizm{
		int dl_lodygi;
		
		public String przypiszDna(String DNA){
			super.przypiszDna(DNA);
			return DNA;
		}
		public void zmienDl_lodygi(int dl_lodygi){
			this.dl_lodygi = dl_lodygi;
		}
		@Override
		public void info() {
			System.out.println("DNA: "+DNA+" dlugosc lodygi: "+dl_lodygi);		
		}

	}


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


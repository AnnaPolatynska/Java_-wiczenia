package J72;
/*Stwórz klasê Organizm zawieraj¹c¹ dowolne pola i metody, które mo¿na by przypisaæ wersji dowolnego organizmu. 
  
 * Nastêpnie stwórz klasy Bakteria , Roœlina oraz Zwierzê dziedzicz¹ce cechy po klasie Organizm ale tak¿e dostosowuj¹c je 
 * do charakterystyki tych grup organizmów. 
 * Æwiczenia J75 
* W osobnej klasie napisz program, który stworzy obiekty typu Zwierze, Bakteria oraz Roslina oraz ich u¿yje, najlepiej w formie 
interakcji miêdzy tymi obiektami (np. zwierzê „zjada” roœlinê albo „walczy” z innym zwierzêciem). */

public class Zwierze extends Organizm{

	int liczbaNog = 4;
	
	public String przypiszDna(String DNA){
		super.przypiszDna(DNA);
		return DNA;
	}
	
	public void zmienNogi(int liczbaNog){
		this.liczbaNog = liczbaNog;
	}
	public void eat(Organizm o){
		if(o instanceof Roslina){
		System.out.println("Zwierzak zjada roœlinê");
		}
		if(o instanceof Zwierze){
		System.out.println("Zwierzak walczy ze zwierzakiem");
		}
	}
	
	@Override
	public void info() {
		System.out.println("DNA: "+DNA+" liczba nóg: "+liczbaNog);		
	}

}

package Obiekty;

public class CarShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// wywo³ywanie z clasy Car
		
		System.out.println("Kupujemy auto: ");
		
		//odwo³ujê siê do ca a samochodu takiego nie ma
		CarShop cs= new CarShop();
		
		Car bmw = new Car(4, "bia³y", "z³oty", "chrom", "BMW", "X5", 100000);// wywo³anie siê do clasy (jak do folderu)Car
		System.out.println("Kupi³eœ: "+bmw.marka+" "+bmw.model);
		System.out.println("do zap³aty: "+bmw.cena);
		
		boolean res = bmw instanceof Car;
		boolean res2 = cs instanceof CarShop; //czy obiekt przynale¿y do klasy
		System.out.println(res); 
		System.out.println(res2);
		
		bmw.brutto(); // zwraca z fabryki
		//bmw.brutto();
		//System.out.println(cena_brutto_rabat);
		
		/*
		//rabat
		System.out.println("po rabacie: " +bmw.rabat());
		bmw.brutto();
		System.out.println();
		*/
		
		
		//double cena_brutto_rabat = bmw.nettoTobrutto(80000);
		System.out.println("po rabacie"+bmw.rabat());
		System.out.println(bmw.cenaBrutto());
		
	}
}
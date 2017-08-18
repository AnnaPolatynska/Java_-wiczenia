package DrugaPaczka;

public class ZmienneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//deklaracja i inicjalizacja razem//
		int liczba1 = 5; 
		int liczba2 = liczba1; //liczba 2 te¿5//
		System.out.println(liczba1+liczba2); 
		System.out.println("1 przyk³ad "+liczba1+liczba2); //nie zsumuje tylko wypisze//
		System.out.println("2 przyk³ad "+(liczba1+liczba2)); //zsumuje//
		//double przechowuje liczby do 8 miejsc po przecinku, inny sposób wywo³ywania przed inicjalizacj¹//
		double liczba3, liczba4; 
		liczba3 = 5.0; 
		liczba4 = 3.3; 
		//przy double nie trzeba przy liczbie literki tak jak przy float f po liczbie//
		
		
		System.out.println(liczba3); 
		System.out.println(liczba4); 

	}

}

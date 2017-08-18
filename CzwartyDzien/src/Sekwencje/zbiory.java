package Sekwencje;
import java.util.ArrayList;
import java.util.HashSet;



public class zbiory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//hashSet
		
		HashSet<Integer> zbior = new HashSet<Integer>(); 
		zbior.add(2);
		zbior.add(5);
		zbior.add(1);
		zbior.add(8);
		
		HashSet<Integer> zbior2 = new HashSet<Integer>(); 
		zbior2.addAll(zbior);
		System.out.println(zbior);
		System.out.println(zbior2); //posortowany
		
		HashSet<String> zbior3 = new HashSet<String>(); 
		zbior3.add("Kaœka");
		zbior3.add("Ola");
		zbior3.add("Zoœka");
		zbior3.add("Ania");
		zbior3.add("Hania");
		System.out.println(zbior3);
		System.out.println(zbior3.contains("Zoœka")); //czy zawiera
		System.out.println(zbior3.contains("Edmund"));
		System.out.println(zbior3.remove("Ola")); 
		
		zbior3.clear(); //wyczyszczenie zbioru
		System.out.println(zbior3.isEmpty()); //czy pusty
		
		HashSet<String> nowySet = new HashSet<String>(); 
		nowySet.add("1"); 
		nowySet.add("2"); 
		nowySet.add("3"); 
		System.out.println(nowySet.contains("2")); 
		System.out.println(nowySet.isEmpty()); 
		nowySet.remove("3"); 
		System.out.println(nowySet.size()); 
		nowySet.clear(); 
		 
		
	}

}

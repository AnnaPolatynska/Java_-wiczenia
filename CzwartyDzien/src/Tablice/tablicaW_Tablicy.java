package Tablice;

public class tablicaW_Tablicy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// wypisuje imiona z nazwiskami
		String[] firstNames = {"Karol", "Basia", "Kasia"};
		String[] lastNames = {"Kowalski", "Nowakowska", "Wadecka"};
		String[][] firstLast = {firstNames, lastNames};
		          
		
		
		for(int i=0; i <= firstNames.length- 1; i++){
				System.out.print(firstLast[0][i]);
				System.out.print(" "); //spacja pomiêdzy imieniem a nazwiskiem
				System.out.println(firstLast[1][i]);
		};
		System.out.print("");
		
	
		
		
		System.out.print("Pierwsza osoba to: ");
		System.out.println(firstLast[0][0] + " " + firstLast[1][0]);
		System.out.print("Druga osoba to: ");
		System.out.println(firstLast[0][1] + " " + firstLast[1][1]);
		System.out.print("Trzecia osoba to: ");
		System.out.println(firstLast[0][2] + " " + firstLast[1][2]);
		
		
		
	}

}

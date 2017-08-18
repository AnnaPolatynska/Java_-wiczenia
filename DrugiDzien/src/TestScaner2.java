import java.io.FilterInputStream;
import java.util.Locale;
import java.util.Scanner;

public class TestScaner2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(new FilterInputStream(System.in){
			@Override
			public void close(){}
		});
		
		input.useLocale(Locale.US);  
		//narzucamy lokalizacjê wiêc mo¿na wpisaæ jedynie:5.6 przy 5,6 zwraca b³¹d, je¿eli chcemy , to wska¿ Francjê//
		System.out.println("Podaj A: "); 
		double A = input.nextDouble(); //nextDouble nie zjada pustych linii
		
		input.nextLine();
		// zjedzenie pustej linii po numerycznych//
		
		System.out.println("Podaj imiê: "); 
		String imie= input.nextLine(); //daje stringa w konsoli//
		System.out.println("witaj: "+ imie +" :-)"); 
				
				
		System.out.println("Podaj B: "); 
		double B = input.nextDouble(); 
		input.close(); 
		System.out.println("A + B = " + (A+B)); 
		
		
		
		
		
		
	}

}

import java.io.FilterInputStream;
import java.util.Scanner;

public class J27 {
// J27
//Napisz program sprawdzaj�cy czy podana liczba jest z przedzia�u <0,1>. 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner costam = new Scanner(new FilterInputStream(System.in){
			@Override
			public void close(){}
		});
		
		System.out.println("Podaj 1 liczb�: ");
		double a = costam.nextDouble(); 
		//liczba badana	
	
		// mo�na te� if(a >= 0)&&(a<=1)
		
		if(a >= 0) { 
			System.out.println("wi�ksza od 0"); 	
		
			if(a<=1) { 
				System.out.println("mniejsza od 1"); 
			}
		
			else{
			System.out.println("nie mie�ci si� w przedziale"); 
			}
		}     
	}
	
				
	}



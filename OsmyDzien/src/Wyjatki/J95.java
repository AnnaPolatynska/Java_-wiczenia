package Wyjatki;

import java.util.Scanner;

// J95
// Napisz program kalkulator kt�ry reaguje na wyj�tki i prosi o poprawienie wpisu. 
public class J95 {
		
		private double a;
		private double b;
		
		public double getA() {
			return a;
		}
		public void setA(double a) {
			this.a = a;
		}
		public double getB() {
			return b;
		}
		public void setB(double b) {
			this.b = b;
		}

		public double add(double a, double b){
			return a + b;
		}
		public double sub(double a, double b){
			return a - b;
		}
		public double multi(double a, double b){
			return a * b;
		}
		public double div(double a, double b){
			return a / b;
		}
		}
	
		
	/*            --------------------------------------------moje z�e
	 * public double A;
	 
	public double B;
	
	public double getA() {
		return A;
	}

	public void setA(double a) {
		A = a;
	}

	public double getB() {
		return B;
	}

	public void setB(double b) {
		B = b;
	}

	public static void main(String[] args) {
		
		Scanner odczytA= new Scanner(System.in);
		double odczA = odczytA.nextDouble();
		
		Scanner odczytB= new Scanner(System.in);
		double odczB = odczytB.nextDouble();
		
		System.out.println("Podaj liczb� A: ");
		
		System.out.println("Podaj liczb� B: ");
		
		double suma=odczA+odczB;
		double roznica=odczA-odczB;
		double mnozenie= odczA*odczB;
		double dzielenie = odczA/odczB;
		
		System.out.println( "suma liczb A i B to: " + suma);
		
		System.out.println( "r�nica liczb A i B to: " + roznica);
		
		System.out.println( "mno�enie liczb A i B to: " + mnozenie);
		
		System.out.println( "dzielenie liczby A przez B to: " + dzielenie);
		
		
		odczytA.close();
		odczytB.close();
		
	}
	
}
*/
import java.io.FilterInputStream;
import java.util.Scanner;
import static java.lang.Math.*;
import java.math.*;

public class J23zwroryMat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cosik = new Scanner(new FilterInputStream(System.in){
			@Override
			public void close(){}
		});
		
		
		
		System.out.println("Podaj x1 liczb�: ");
		double x1 = cosik.nextDouble();
		System.out.println("Podaj x2 liczb�: ");
		double x2 = cosik.nextDouble(); 
		System.out.println("Podaj y1 liczb�: ");
		double y1 = cosik.nextDouble();
		System.out.println("Podaj y2 liczb�: ");
		double y2 = cosik.nextDouble(); 
		//odleg�o�ci mi�dzy 2 punktami
		
		double a=Math.PI;
				
		double odleglosc = sqrt(pow((x1-x2),2)+pow(((cos((x1*Math.PI)/180))*(y2-y1)),2));
		
				//((3*sqrt(3) pierwiastek
				//*(pow(A, 2) pot�ga
		System.out.println("odleg�o�c wynosi: " + odleglosc*111);
		cosik.close();
	}

}

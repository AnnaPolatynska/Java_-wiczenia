import java.io.FilterInputStream;
import java.util.Scanner;
import static java.lang.Math.*;
import java.math.*;
public class J24odwrotnie {
// J24
//Napisz program, kt�ry wy�wietla napis w kolejno�ci liter odwrotnej wzgl�dem orygina�u. 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner cosik = new Scanner(new FilterInputStream(System.in){
				@Override
				public void close(){}
			});
			
		System.out.println("Podaj tekst: ");
		String odw = cosik.nextLine();
		StringBuffer nowyBufor = new StringBuffer(odw);// metoda StringBuffer
		System.out.println(nowyBufor.reverse());
		
		cosik.close();
			
			
			
		
			
			
			
		
	}

}

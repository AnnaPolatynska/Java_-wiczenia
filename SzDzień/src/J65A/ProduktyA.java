package J65A;
//------------------------------------------------------------------------------nadpisuje tym samym popraw
	import java.util.Scanner;

	public class ProduktyA {
		
		public static void main(String[] args) {
			MagazynA m1 = new MagazynA();
			Scanner menu = new Scanner(System.in);
			
			while(true){
				System.out.println("Co chesz zrobiæ: D-dodaj, U-usuñ, Z-zmieñ, L-lista, Q-wyjœcie");
				String m = menu.nextLine();
				if(m.equals("D")){
					m1.dodajProdukt(new MagazynA());
				} 
				if (m.equals("L")){
					m1.stanyProdukty();
				}
				if (m.equals("Z")){
					m1.zmienStan();
				}
				if (m.equals("U")){
					m1.usunProdukt(new MagazynA());
				}
				if (m.equals("Q")){
					System.out.println("koniec!");
					break;
				}
			}
			menu.close();
		}

	}

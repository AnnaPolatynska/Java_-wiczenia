package KlasaAbstrakcyjna;

public class Jablka extends Owoce{

	
	
	public void printInfo(){
		
		System.out.print(owoce + " "+ dojrzaly+ " " + odmiana);
	}
	
	public void zmien(String zmiana){
	}
	
	
	public static void main(String[] args) {
		Jablka j1 =new Jablka();
		j1.zmien("Champion");
		j1.printInfo();
		j1.dojrzewanie();
		j1.printInfo();
		
		
		

	}

}

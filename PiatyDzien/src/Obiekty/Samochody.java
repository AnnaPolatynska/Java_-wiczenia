package Obiekty;

public class Samochody {

	
	int IloscDrzwi;
	String kolorNadwozia;
	String kolorFelg;
	String kolorOpon;
	String marka;
	String model;
	
	// string kolorNadwozia, kolorFelg, kolorOpon;  2 sposób zapisu
	
	
	
	Samochody(int IloscDrzwi, String kolorNadwozia, String kolorFelg, String kolorOpon, String marka, String model
			){this.IloscDrzwi= IloscDrzwi;
			this.kolorNadwozia= kolorNadwozia;
			this.kolorFelg=kolorFelg;
			this.kolorOpon=kolorOpon;
			this.marka=marka;
			this.model=model;	}
	//konstruktor nazwa = nazwa klasy
	//konstruktor this = self w pythonie
	
	public static void main(String[] args) {//metoda g³ówna
		// TODO Auto-generated method stub

		
		Samochody garbus= new Samochody(4, "niebieski", "czerwony", "czarny", "VW", "Garbus");//klasa samochody
		
		Samochody syrenka=new Samochody(4, "zielony" , "pomarañczowy", "czarny", "s103", "Syrena");
		
		Samochody fiat=new Samochody(2, "bia³y", "niebieski", "br¹zowy", "126p", "Fiat");
		
		//wyposa¿a garbusa w cechy
		/*garbus.IloscDrzwi=4;
		garbus.kolorNadwozia="niebieski";
		garbus.kolorFelg="czerwony";
		garbus.kolorOpon="czarny";
		garbus.marka="VW";
		garbus.model="Garbus";
		*/
		System.out.println("IloscDrzwi: " + garbus.IloscDrzwi);
		System.out.println(garbus.kolorNadwozia);
		System.out.println(garbus.kolorFelg);
		System.out.println(garbus.kolorOpon);
		System.out.println(garbus.marka);
		System.out.println(garbus.model);
		
		
		//System.out.println(garbus); //b³êdne odwo³anie = adres komórki pamiêci
		
		System.out.println("IloscDrzwi: " + syrenka.IloscDrzwi);
		System.out.println(syrenka.kolorNadwozia);
		System.out.println(syrenka.kolorFelg);
		System.out.println(syrenka.kolorOpon);
		System.out.println(syrenka.marka);
		System.out.println(syrenka.model);
		
		System.out.println("IloscDrzwi: " + fiat.IloscDrzwi);
		System.out.println(fiat.kolorNadwozia);
		System.out.println(fiat.kolorFelg);
		System.out.println(fiat.kolorOpon);
		System.out.println(fiat.marka);
		System.out.println(fiat.model);
		
	}

}

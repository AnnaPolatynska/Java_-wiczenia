package Obiekty;

public class Car {

	//na sztywno		
		int IloscDrzwi;
		double cena;
		String kolorNadwozia;
		String kolorFelg;
		String kolorOpon;
		String marka;
		String model;
		
		
		//nowa metoda 
		
		public double cenaBrutto(){
			double brutto= cena*1.23;
			return brutto;
					//nalicza sklep a nie fabryka
			//return cena*1.23;
			}
		
		public void brutto(){
			System.out.println("Do zap³aty");
			System.out.println("cena netto" + cena);
			System.out.println("cena brutto" + cena*1.23);
		}
		
		
		public double rabat(){
			cena= cena*0.9;
			return cena;
		}
		
		
		
		
		
		// string kolorNadwozia, kolorFelg, kolorOpon;  2 sposób zapisu
				
		Car(int IloscDrzwi, String kolorNadwozia, String kolorFelg, String kolorOpon, String marka, String model,int cena
				){this.IloscDrzwi= IloscDrzwi;
				this.kolorNadwozia= kolorNadwozia;
				this.kolorFelg=kolorFelg;
				this.kolorOpon=kolorOpon;
				this.marka=marka;
				this.model=model;
				this.cena=cena;
				}
		//konstruktor nazwa = nazwa klasy
		//konstruktor this = self w pythonie
		
		/*
		public static void main(String[] args) { //po tym wywo³ujemy
			// TODO Auto-generated method stub

			
			Car garbus= new Car(4, "niebieski", "czerwony", "czarny", "VW", "Garbus", 1500);//klasa samochody
			
			Car syrenka=new Car(4, "zielony" , "pomarañczowy", "czarny", "s103", "Syrena", 1200);
			
			Car fiat=new Car(2, "bia³y", "niebieski", "br¹zowy", "126p", "Fiat", 1000);
			
			//wyposa¿a garbusa w cechy
			/*garbus.IloscDrzwi=4;
			garbus.kolorNadwozia="niebieski";
			garbus.kolorFelg="czerwony";
			garbus.kolorOpon="czarny";
			garbus.marka="VW";
			garbus.model="Garbus";
			*/
			/*System.out.println("IloscDrzwi: " + garbus.IloscDrzwi);
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
			*/
	}

//}

package SpecyfikatoryDostêpu;

//import Gatunki.*; //importuje wszystko
import Gatunki.GatunekJ61; //importuje Gatunek
//import Nazwa pakietu.Nazwa klasy

//public widoczna miêdzy pakietami ale w 1 projekcie(dniu)

public class Specyfikatory {
	public static void main(String[] args){
	/*	GatunekJ61 orzelBielik = new GatunekJ61("bielik", "orze³", 90);
		
		orzelBielik.wypiszGatunki(); //wywo³anie metody do 
		*/
		//kot.wypiszGatunki(); nie zadzia³a bo inny gatunek
		
		
		//GetSet gs1 =new GetSet();
		GetSet gs2 =new GetSet(4, "napis");
		//System.outPrintln(gs1.a);// nie odwo³a siê
		//System.outPrintln(gs1.b);
		
		System.out.println(gs2.getA());
		gs2.setA(15);
		System.out.println(gs2.getA());
		
		System.out.println(gs2.getB());
		gs2.setB("nowy napis");
		System.out.println(gs2.getB());
		
		System.out.println(gs2.isC());
		gs2.setC(true);
		System.out.println(gs2.isC());
		
		System.out.println(gs2.getZnaczek());// znak pusty
		
		
	}
}
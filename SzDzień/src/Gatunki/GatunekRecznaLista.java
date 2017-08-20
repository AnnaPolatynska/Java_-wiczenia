package Gatunki;

public class GatunekRecznaLista {
		String rodzaj,gatunek;
		int chrom;
		static GatunekRecznaLista last=null;
		GatunekRecznaLista prevoius=null;
		static void Wypisz_wszystkie() {
			GatunekRecznaLista temp=last;
			while (temp !=null) {
				System.out.println(temp.opisz());
				temp=temp.prevoius;
			}
		};
		public GatunekRecznaLista(String rodzaj, String gatunek, int chrom) {
			super();
			this.rodzaj = rodzaj;
			this.gatunek = gatunek;
			this.chrom = chrom;
			this.prevoius = last;
			last=this;
		}
		public String opisz() {
			return ("Rodzaj: " + rodzaj +" gatunek: " + gatunek + " liczba chromosomów " + chrom);
		}
		public String gatunek() {
			return gatunek;
		}
		public String rodzaj() {
			return rodzaj;
		}
		public int chrom() {
			return chrom;
		}
		
	public static void main(String[] args) {
		GatunekRecznaLista a= new GatunekRecznaLista("b","a",2);
		GatunekRecznaLista b= new GatunekRecznaLista("b","a",2);
		GatunekRecznaLista c= new GatunekRecznaLista("b","a",2);
		GatunekRecznaLista d= new GatunekRecznaLista("b","a",2);
		GatunekRecznaLista e= new GatunekRecznaLista("b","a",2);
		GatunekRecznaLista f= new GatunekRecznaLista("b","a",2);
		GatunekRecznaLista g= new GatunekRecznaLista("b","a",2);
		GatunekRecznaLista.Wypisz_wszystkie();

	}

}

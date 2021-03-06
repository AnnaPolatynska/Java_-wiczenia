package Gatunki;


	import java.util.ArrayList;

	/*J61
	 * Stw�rz program Gatunki w kt�rym b�dzie utworzonych kilka obiekt�w typu GatunekKlasa Gatunek powinna zawiera�:
	pola przechowuj�ce: nazw� rodzaju
	nazw� gatunkow�
	liczb� chromosom�w
	Opis metody:

	podaj�c� pe�n� nazw� (Rodzaj + gatunek)
	podaj�c� liczb� chromosom�w

	wypisuj�c� wszystkie dane Gatunek o warto�ciach p�l takich samych jak w
	obiekcie, w kt�rym zosta�a wywo�ana.
	W programie powinny by� u�yte wszystkie metody
	 */
	//------------------------------------------------------------------S�awka   J61 --------------bez J62-----------nie rusza�
	public class GatunekJ61 {
		String nazwaGatunku, rodzaj;
		int liczcbaChromosomow;
		
		static ArrayList<GatunekJ61> listaGatunkow = new ArrayList<>();
		
		public GatunekJ61(String nazwaGatunku, String rodzaj, int liczcbaChromosomow) {
			super();
			this.nazwaGatunku = nazwaGatunku;
			this.rodzaj = rodzaj;
			this.liczcbaChromosomow = liczcbaChromosomow;
			listaGatunkow.add(this);
		}
		public String printRodzajGatunek() {
			return "rodzaj: " + this.rodzaj + " gatunek: " + this.nazwaGatunku;
		}

		public String printLiczbaChromosom�w() {
			return "liczba chromosom�w: " + this.liczcbaChromosomow;
		}
		
		public String printWszystkieDane() {
			return  this.printRodzajGatunek() +"\n"+ this.printLiczbaChromosom�w();
		}
		
		public void wypiszGatunki() {
			for(GatunekJ61 v : listaGatunkow) {
				if(v.rodzaj.equals(this.rodzaj)){
					System.out.println(v.printWszystkieDane()+"\n\n");
				}
			}
		}

		// metoda main
		public static void main(String[] args) {
			GatunekJ61 orzelBielik = new GatunekJ61("bielik", "orze�", 90);
			GatunekJ61 orzelPrzedni = new GatunekJ61("przedni", "orze�", 91);
			GatunekJ61 orzelBielik2 = new GatunekJ61("bielik2", "orze�ffff", 92);
			GatunekJ61 orzelBielik3 = new GatunekJ61("bielik3", "orze�", 90);
			GatunekJ61 kot = new GatunekJ61("kot", "europejska", 90);
			
			
			orzelPrzedni.wypiszGatunki();
		//	===============================================================potrzebane do Specyfikatora=========================
					
					
					
					
					
		}
		

	}



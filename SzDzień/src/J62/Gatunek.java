package J62;

import java.util.ArrayList;
import java.util.Random;
/*
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

public class Gatunek {
	
	String nazwaGatunku, rodzaj;
	int liczcbaChromosomow;
	Chromosom[] tabChromosomow; 
	
	
	
	
	static ArrayList<Gatunek> listaGatunkow = new ArrayList<>();
	
	public Gatunek(String nazwaGatunku, String rodzaj, int liczcbaChromosomow) {
		super();
		this.nazwaGatunku = nazwaGatunku;
		this.rodzaj = rodzaj;
		
		this.liczcbaChromosomow = liczcbaChromosomow;
		this.tabChromosomow = new Chromosom[liczcbaChromosomow];
		
		//uzupe�nianie tabeli z chromosomami
		Random rand = new Random();
		for(int i = 0; i < tabChromosomow.length; i++) {
			tabChromosomow[i] = new Chromosom(i+1, rand.nextInt(50));
		}
		
		listaGatunkow.add(this);
	}
	
	public String printChromosomy() {
		
		String chromosomy = "";
		
		for(int i = 0; i < this.tabChromosomow.length; i++) {
			chromosomy = chromosomy + "chromosom: " + (i+1) +
					"\td�ugo��: "+this.tabChromosomow[i].dlugoscRamieniaChromosomu+"\n";
		}
		
		return chromosomy;
	}
	

	public String printRodzajGatunek() {
		return "rodzaj: " + this.rodzaj + " gatunek: " + this.nazwaGatunku;
	}

	public String printLiczbaChromosom�w() {
		return "liczba chromosom�w: " + this.liczcbaChromosomow;
	}
	
	public String printWszystkieDane() {
		return  this.printRodzajGatunek() +"\n"+
				this.printLiczbaChromosom�w()+"\n" + this.printChromosomy();
	}
	
	
	
	public void wypiszGatunki() {
		for(Gatunek v : listaGatunkow) {
			if(v.rodzaj.equals(this.rodzaj)){
				System.out.println(v.printWszystkieDane()+"\n");
			}
		}
	}

	// metoda main
	public static void main(String[] args) {
		Gatunek orzelBielik = new Gatunek("bielik", "orze�", 3);
		Gatunek orzelPrzedni = new Gatunek("przedni", "orze�",2);
		Gatunek orzelBielik2 = new Gatunek("bielik2", "orze�ffff", 4);
		Gatunek orzelBielik3 = new Gatunek("bielik3", "orze�", 2);
		Gatunek kot1 = new Gatunek("europejski", "kot", 3);
		Gatunek kot2 = new Gatunek("rosyjski", "kot", 2);
		
		kot2.wypiszGatunki();
		
	}
	

}

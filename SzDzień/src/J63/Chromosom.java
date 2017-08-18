package J63;
/*�wiczenia J63 
Zmodyfikuj program Gatunki tak aby: 
 u�ytkownik mia� mo�liwo�� wprowadzania nowych gatunk�w 
wprowadza� dane (gatunki, ich parametry, ��cznie z chromosomami*/


public class Chromosom {
	
	int numerChromosomu, dlugoscRamieniaChromosomu;
	boolean pluciowy;
	
	Chromosom(int nCh, int dCh){
		if(nCh > 0) {
			this.numerChromosomu = nCh;
		}
		
		if(dCh >= 0) {
			this.dlugoscRamieniaChromosomu = dCh;
		}
		this.pluciowy = false;
	}
	
	Chromosom(int nCh, int dCh, boolean pluciowy){
		if(nCh > 0) {
			this.numerChromosomu = nCh;
		}
		
		if(dCh >= 0) {
			this.dlugoscRamieniaChromosomu = dCh;
		}
		this.pluciowy = pluciowy;
	}

}

package J71;
/*Stw�rz klas� KontoBankowe kt�ra b�dzie reprezentowa�a wirtualn� reprezentacje konta bankowego. Przynajmniej nrKonta i saldo; 
 * W klasie konto bankowe stw�rz metody addSaldo, subbSaldo oraz przynajmniej dwie metody abstrakcyjne: interest, addDebit  
 * Nast�pnie stw�rz klas� KontoBank1 i KontoBank2 kt�ra b�dzie rozszerza� klas� KontoBankowe.  
 * Zaimplementuj wszystkie abstrakcyjne metody. 
 *  Przetestuj dzia�anie kont bankowych, dane maj� by� wprowadzanie przez u�ytkownika.  
*/
public class kontoTest {

			public static void main(String[] args) {
				KontoParibas m1 = new KontoParibas();
				m1.addDebit();
				m1.addSaldo(1000);
				m1.subSaldo(500);
				m1.intrest(15648, 3000);
				
				KontoPKO p1 = new KontoPKO();
				p1.addDebit();
				p1.addSaldo(1000);
				p1.subSaldo(500);
				p1.intrest(15848, 3000);
	}

}

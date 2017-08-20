package J71;
/*Stwórz klasê KontoBankowe która bêdzie reprezentowa³a wirtualn¹ reprezentacje konta bankowego. Przynajmniej nrKonta i saldo; 
 * W klasie konto bankowe stwórz metody addSaldo, subbSaldo oraz przynajmniej dwie metody abstrakcyjne: interest, addDebit  
 * Nastêpnie stwórz klasê KontoBank1 i KontoBank2 która bêdzie rozszerzaæ klasê KontoBankowe.  
 * Zaimplementuj wszystkie abstrakcyjne metody. 
 *  Przetestuj dzia³anie kont bankowych, dane maj¹ byæ wprowadzanie przez u¿ytkownika.  
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

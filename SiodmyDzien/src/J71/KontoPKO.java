package J71;
/*Stwórz klasê KontoBankowe która bêdzie reprezentowa³a wirtualn¹ reprezentacje konta bankowego. Przynajmniej nrKonta i saldo; 
 * W klasie konto bankowe stwórz metody addSaldo, subbSaldo oraz przynajmniej dwie metody abstrakcyjne: interest, addDebit  
 * Nastêpnie stwórz klasê KontoBank1 i KontoBank2 która bêdzie rozszerzaæ klasê KontoBankowe.  
 * Zaimplementuj wszystkie abstrakcyjne metody. 
 *  Przetestuj dzia³anie kont bankowych, dane maj¹ byæ wprowadzanie przez u¿ytkownika.  
*/
public class KontoPKO extends KontoBankowe {

	@Override
	void addDebit() {
		System.out.println("Nie uznajemy kont debetowych");	
				
	}

	@Override
	void intrest(int nrKonta, float saldo) {
		System.out.println("Dane rachunku: \nnr rachunku: "+nrKonta+"\nsaldo: "+saldo);
				
	}	
}

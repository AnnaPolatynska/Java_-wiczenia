package DrugaPaczka;
// operatorymatematyczne
public class Operatory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 17;
		double b= 4;
		double c= a+b;
		System.out.println(c);
		c=a-b;
		System.out.println(c);	//nadpisujemy kolejny raz//
		c=a*b;
		System.out.println(c);	
		c=a/b; 
		//bez reszty zdzielenia je�eli a i b s� int liczy bez znak�w po przecinku musi by� doble doble da reszt� z dzielenia// 
		System.out.println(c);	
		
		//2 spos�b liczenia ka�da linijka nadpisuje poprzedni�//
		a*=b;
		System.out.println(a);
		a/=b;
		System.out.println(a);
		a+=b;
		System.out.println(a);
		a-=b;
		System.out.println(a);
		
		System.out.println(a);
		System.out.println(a++); // inkrementacja wy�wietla i dodaje//
		System.out.println(++a);//dodaje i wy�wietla//
		System.out.println(a--);// inkrementacja wy�wietla i odejmuje//
		System.out.println(--a);
		
		
	}

}

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
		//bez reszty zdzielenia je¿eli a i b s¹ int liczy bez znaków po przecinku musi byæ doble doble da resztê z dzielenia// 
		System.out.println(c);	
		
		//2 sposób liczenia ka¿da linijka nadpisuje poprzedni¹//
		a*=b;
		System.out.println(a);
		a/=b;
		System.out.println(a);
		a+=b;
		System.out.println(a);
		a-=b;
		System.out.println(a);
		
		System.out.println(a);
		System.out.println(a++); // inkrementacja wyœwietla i dodaje//
		System.out.println(++a);//dodaje i wyœwietla//
		System.out.println(a--);// inkrementacja wyœwietla i odejmuje//
		System.out.println(--a);
		
		
	}

}

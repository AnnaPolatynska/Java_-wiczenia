package J59;
// -------------------------------------------------------------------------------------------------OK------------

/*
Napisz kasę zawierającą dwa pola: pierwsze typu double i drugie typu char.  
 Dopisz cztery przeciążone konstruktory:  pierwszy przyjmujący jeden argument typu double,  
drugi przyjmujący jeden argument typu char,  trzeci przyjmujący dwa argumenty – pierwszy typu double i drugi typu char  
 czwarty przyjmujący również dwa argumenty, ale w odwrotnej kolejności. 
 */
import PrzeciazanieMetod.Przeciazanie;

public class J59 {

	double pierwsze;
	char drugie;
		
	public J59(double pierwsze) {
		super();
		this.pierwsze = pierwsze;
		System.out.println(pierwsze);
	}
	public J59(char drugie) {
		super();
		this.drugie = drugie;
		System.out.println(drugie);
	}
	public J59(double pierwsze, char drugie) {
		super();
		this.pierwsze = pierwsze;
		this.drugie = drugie;
		System.out.println(pierwsze+" "+drugie);
	}
	public J59(char drugie, double pierwsze) {
		super();
		this.pierwsze = pierwsze;
		this.drugie = drugie;
		System.out.println(pierwsze+" "+drugie);
	}

	public static void main(String[] args) {
		J59 test1 = new J59(3.14);
		J59 test2 = new J59(3.14, 'K');
		J59 test3 = new J59('K', 3.14);
		J59 test4 = new J59('K');

	}

}


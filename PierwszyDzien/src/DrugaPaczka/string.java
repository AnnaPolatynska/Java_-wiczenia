package DrugaPaczka;

public class string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String hello= "witaj ";
		String world= " �wiecie";
		String powitanie= hello + world;
		System.out.println(powitanie); 
		
		
		//substring zwraca 5 pierwszych z poprzedniego ci�gu//
		String czesc = powitanie.substring(0, 6) + "uczniu";
		System.out.println(czesc);
		
		
	}

}

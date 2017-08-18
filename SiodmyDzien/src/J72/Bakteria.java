package J72;

public class Bakteria extends Organizam{

static String szkodliwosc;


	public String przypiszDna(String DNA){
	super.przypiszDna(DNA);
	return DNA;
	}


public void zmienSzkodliwosc(String szkodliwosc){
	this.szkodliwosc=szkodliwosc;
}



public static void main(String[] args) {
	// TODO Auto-generated method stub
		
	
	
	
	System.out.println("DNA"+ " " + szkodliwosc);
}


@Override
public void info() {
	// TODO Auto-generated method stub
	
}
	

}

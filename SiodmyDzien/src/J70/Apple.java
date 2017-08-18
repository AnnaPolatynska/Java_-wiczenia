package J70;

public class Apple extends Fruit{

	String nazwa;
	String odmiana;
	
	
	public Apple(String owoc) {
		super(owoc);
		this.nazwa = nazwa;
		this.odmiana = odmiana;
	}

	public void printInfo(){
		System.out.println(odmiana);
		System.out.println(nazwa);
	}
	
	
	
}

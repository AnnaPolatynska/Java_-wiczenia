package SpecyfikatoryDostêpu;

public class GetSet {

	private int a;// private niedostêpne w specyfikatory
	private String b;
	// za private siê ustawiamy by umo¿liwiæ dostêp  
	private boolean c;
	//dla boolina jest is a nie get
	private char znaczek;
	
	public char getZnaczek() {
		return znaczek;
	}

	public void setZnaczek(char znaczek) {
		this.znaczek = znaczek;
	}

	public boolean isC() {
		return c;
	}

	public void setC(boolean c) {
		this.c = c;
	}
	
	public int getA() {
		return a;
	}
	

	public void setA(int a) {
		this.a = a;
	}

	public String getB() {
		return b;
	}

	public void setB(String b) {
		this.b = b;
	}

	
	
	//konstruktor automatycznie
	public GetSet(int a, String b) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.znaczek = znaczek;
		}

	
	
	
}

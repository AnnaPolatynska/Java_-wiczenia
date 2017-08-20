package KlasaAbstrakcyjna;

public abstract class Owoce implements PraOwoc {
	// sta³a
	public static final String owoce = "owoc";
	// zmienna
	public boolean dojrzaly;
	// metada abstrakcyjna
	public abstract void printInfo();
	// metoda
	public void dojrzewanie(){
		this.dojrzaly = true; 
	}
	
}

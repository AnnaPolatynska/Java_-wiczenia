package Dziedziczenie;

public class Part {
	
static int id; //licznik iloœci produktów
final int NR; //NR jest sta³y nie musimy jego podawaæ w konstruktorze jest ju¿ podany
String nazwa,model,seria;

	public Part(String nazwa, String model, String seria)	{
		NR = id++;
		this.nazwa= nazwa;
		this.model= model;
		this.seria= seria; //kilka czêsci w 1 serii
		
		
	}
		
}

package Dziedziczenie;

public class Part {
	
static int id; //licznik ilo�ci produkt�w
final int NR; //NR jest sta�y nie musimy jego podawa� w konstruktorze jest ju� podany
String nazwa,model,seria;

	public Part(String nazwa, String model, String seria)	{
		NR = id++;
		this.nazwa= nazwa;
		this.model= model;
		this.seria= seria; //kilka cz�sci w 1 serii
		
		
	}
		
}

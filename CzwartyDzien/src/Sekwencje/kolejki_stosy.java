package Sekwencje;

import java.util.ArrayDeque;
import java.util.Queue;

public class kolejki_stosy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayDeque<String> stos = new ArrayDeque<String>();
		stos.add("napis1");
		stos.add("napis2");
		stos.add("napis3");
		stos.add("napis4");
		System.out.println(stos); 
		stos.addFirst("Ania"); ///           ----------------------dodanie jako 1
		System.out.println(stos); 
		stos.addLast("Ela");
		System.out.println(stos); 
		//inny sposób zapisu
		String a =stos.pollFirst();//pobiera 1 te¿ tak dzia³a String a =stos.poll();
		System.out.println(a); // zdjêcie 1 elementu
		String b =stos.pollLast();//pobiera ostatni
		System.out.println(b); 
		String c =stos.getLast(); //pobiera koñcowy 
		System.out.println(c); 
		
		System.out.println(stos); 
		System.out.println(stos.size()); 
		
		ArrayDeque<String> nowaKolejka = new ArrayDeque<String>(); 
		nowaKolejka.addLast("1"); 
		nowaKolejka.addFirst("2"); 
		nowaKolejka.addLast("3"); 
		System.out.println(nowaKolejka); 
		System.out.println(nowaKolejka.pollLast()); 
		nowaKolejka.removeLast(); 
		System.out.println(nowaKolejka.size()); 
		
	}

}

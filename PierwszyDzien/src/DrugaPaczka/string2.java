package DrugaPaczka;

public class string2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String words =" jeden dwa trzy cztery piêc szejsc siedem";
		String sub1 = words.substring(2, 7);
		String sub2= words.replaceAll("dwa", "hehe");
		String sub3= words.trim(); //trim do pustych znaków na koncu//
		char charat = words.charAt(2);
		
		String[] tab= {};
		
		
		System.out.println(words);
		System.out.println("words.substring(2, 7)");
		System.out.println(sub1);
		System.out.println("words.replaceAll(\"dwa\", \"hehe\")");
		System.out.println(sub2);
		System.out.println("words.trim()");
		System.out.println(sub3);
		System.out.println("words.charAt(2)");
		System.out.println(charat);
		
		// tworzymy nowy obiekt nowyBufor nie skasujemy starego ci¹gu//
		StringBuffer nowyBufor = new StringBuffer(words);
		nowyBufor.append("dodany ci¹g znakow");
		System.out.println(nowyBufor.toString());
		//mo¿e odwo³aæ siêdo stringu lub tablicy//
		System.out.println(tab);
		
		
		
	}

}

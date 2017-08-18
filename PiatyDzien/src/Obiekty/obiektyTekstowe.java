package Obiekty;


// projekt posiada pakiety a w pakietach s¹ klasy


public class obiektyTekstowe {

	
	static String p ="zmienna globalna";
	
	
	static void info(){
		int b =2;
		if(true){
			int c = 3;
		}
		
		System.out.println("jestem w metodzie info");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a =1; //a jest zmienn¹ globaln¹
		
		for(int i = 0; i<=9; i++){
			//zakres lokalny i w pêtli for
			System.out.println("w pêtli(i)" + 1);
			a=a+1; // a jest nadpisywana w pêtli
			System.out.println("w pêtli"+a );
		}
		
		// zmienna lokalna i jest niewidoczna
		
		System.out.println("poza pêtl¹"+a ); //a dostêpne poza pêtl¹
		
		
		// zmienna klasowa
		System.out.println("w main(p)"+p );// zmienna klasowa widoczna 
		
		// wywo³anie metody info nie wa¿na kolejnoœc metod
		info();
	}

}

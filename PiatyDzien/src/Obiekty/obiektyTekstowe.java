package Obiekty;


// projekt posiada pakiety a w pakietach s� klasy


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

		int a =1; //a jest zmienn� globaln�
		
		for(int i = 0; i<=9; i++){
			//zakres lokalny i w p�tli for
			System.out.println("w p�tli(i)" + 1);
			a=a+1; // a jest nadpisywana w p�tli
			System.out.println("w p�tli"+a );
		}
		
		// zmienna lokalna i jest niewidoczna
		
		System.out.println("poza p�tl�"+a ); //a dost�pne poza p�tl�
		
		
		// zmienna klasowa
		System.out.println("w main(p)"+p );// zmienna klasowa widoczna 
		
		// wywo�anie metody info nie wa�na kolejno�c metod
		info();
	}

}

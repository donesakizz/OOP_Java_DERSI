package Hafta3_2.örnek;


public class HesapmakinesiMain {


	public static void main(String[] args) {
		
		 HesapMakinesi islem1;
		 islem1 =new HesapMakinesi(1, 3 , "green");
		 System.out.println( islem1.number1 +"-" +islem1.number2 );
		 islem1.number1=6;//manuel olarak da constructordan bagımsız degişkenin değeri değiştirilebildi
		 System.out.println(islem1.number2+ "-" + islem1.number2 );
		 
		 

	}
}

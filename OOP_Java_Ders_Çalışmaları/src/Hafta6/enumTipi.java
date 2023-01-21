package Hafta6;

public class enumTipi {
	
	enum Level {
		LOW,
		MEDIUM,
		HIGH
		//en son degiskenlerdir.degeri degistililemez
	}

	public static void main(String[] args) {
		Level v=Level.MEDIUM;
		System.out.println(v);
		//bu sekilde sabit atama yapılır.
		//baska bir tanımlama da main icinde final static String v0="LOW"
		
	}

}

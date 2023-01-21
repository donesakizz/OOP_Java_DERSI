package Hafta2_ornek2;


public class Sınıf1 {
	
	public static void main(String[] args) {
		
		// sınıf oluşturma ve oluşturulan sınıftan  nesne üretmeye basiğt örnek kullanımı 	
			
		Hesaplama hesap1 = new Hesaplama();
		
		hesap1.sayi1=10;
		hesap1.sayi2=20;
		System.out.println( hesap1.sayi1);
		System.out.println( hesap1.sayi2);
		
		
		Hesaplama hesap2 = new Hesaplama();
		hesap2.sayi1= 5;
		hesap2.sayi2 = 15;
		System.out.println( hesap1.sayi1);
		System.out.println( hesap1.sayi2);
		

		}


}

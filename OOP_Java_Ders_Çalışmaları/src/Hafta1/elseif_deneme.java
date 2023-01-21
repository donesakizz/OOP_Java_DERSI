package Hafta1;

import java.util.Scanner;

public class elseif_deneme {
	
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		double  sayi1,sayi2,sonuc;
		int secim;
		
		System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme\n");
		System.out.println("İşlrminizi seçiniz:");
		secim=input.nextInt();
		
		System.out.println("2 sayı giriniz");
		sayi1=input.nextDouble();
		sayi2=input.nextDouble();
		
		if(secim==1)
			sonuc=sayi1+sayi2;
		else if(secim==2)
			sonuc=sayi1-sayi2;
		else if(secim==3)
			sonuc=sayi1*sayi2;
		else 
			sonuc=sayi1/sayi2;
		
		System.out.println("Yaptıgınız işlemin sonucu:" +sonuc);
		

	}


}

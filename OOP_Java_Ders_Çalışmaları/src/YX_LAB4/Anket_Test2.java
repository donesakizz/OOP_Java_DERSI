package YX_LAB4;

import java.util.Scanner;

public class Anket_Test2 {
	
	
public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("2.anket soruları: ");
		
		int dogru=0;
		
		String[] Cevaplar = new String[5];
		
		String[] dogruCevaplar = {"A","B","C","C","C"};
		
		System.out.println("1-) Cevreye en cok sera gazı yayan ülke hangisidir ");
		System.out.println("A-) Cin ");
		System.out.println("B-) Hindistan ");
		System.out.println("C-) Amerika ");
		System.out.println("D-) Japonya ");
		
		System.out.println("Cevabi giriniz: ");
		String cevap1 = input.next();
		Cevaplar[0]=cevap1;
		
		System.out.println("2-) Cevreyi temiz tutmak için aşagıdakilerden hangisinin yapılması YANLIŞTIR  ");
		System.out.println("A-) Yere çöp atmak");
		System.out.println("B-) Dogalgaz kullanmak ");
		System.out.println("C-) Fidan dikmek ");
		System.out.println("D-) Boşa giden suyu kapatmak ");
		
		System.out.println("Cevabi giriniz: ");
		String cevap2 = input.next();
		Cevaplar[1]=cevap2;
		
		System.out.println("3-) Hangi Tur ampul en az enerjiyi tuketir? ");
		System.out.println("A-) Akkor Ampul ");
		System.out.println("B-) Halojen Ampul ");
		System.out.println("C-) Kompakt Floresan Ampul ");
		System.out.println("D-) Bir degisik ampul ");
		
		System.out.println("Cevabi giriniz: ");
		String cevap3= input.next();
		Cevaplar[2]=cevap3;
		
		System.out.println("4-) Aşagıdakilerden hangisi iklim aktivistidir? ");
		System.out.println("A-) Greta Thuenberg");
		System.out.println("B-) Tesla  ");
		System.out.println("C-) Edison 	");
		System.out.println("D-) Mark Zuckerberg");
		
		System.out.println("Cevabi giriniz: ");
		String cevap4= input.next();
		Cevaplar[3]=cevap4;
		
		System.out.println("5-) Aşagıdakilerden hangisi nesli tükenmiş hayvandır ? ");
		System.out.println("A-) İstavrit ");
		System.out.println("B-) Mahmut ");
		System.out.println("C-) Fil");
		System.out.println("D-) Serçe ");
		
		System.out.println("Cevabi giriniz: ");
		String cevap5= input.next();
		Cevaplar[4]= cevap5;
		
		
		
		
		
		for(int i=0;i<Cevaplar.length;i++){
			if(Cevaplar[i].equals(dogruCevaplar[i])) dogru +=1;
					dogru +=i;					
		}
		
		if (dogru==5) System.out.println("Cok iyi");
		else if(dogru==4) System.out.println(" iyi");
		else System.out.println(" bilgilerinizi tazelemelisin");
		
	
		for(String cevap : Cevaplar) {
			System.out.println(cevap);
		}
		
	}

}

	


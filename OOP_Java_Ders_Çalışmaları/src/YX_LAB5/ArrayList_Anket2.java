package YX_LAB5;

import java.util.HashMap;
import java.util.Scanner;

public class ArrayList_Anket2 {

	public static void main(String[] args) {
		HashMap<String,Double> sorular = new HashMap<String,Double>();
		Scanner input = new Scanner (System.in);
		double a=0,b=0,c=0,d=0,e=0;
		System.out.println("Asagida bulunan konulara önem derecesine göre 1-10 arası puan veriniz.");
		
		int kontrol=1;
		double puan=0;
		int kisiSayisi=0;
		
		while(kontrol==1) {
			kisiSayisi++;
			
			while (puan<=0||puan>10) {
				System.out.println("1-Enflasyon: ");
				puan =input.nextDouble();
			}
			a+=puan;
			puan=0;
			while(puan<=0 || puan>10) {
				System.out.println("2- Hayvan Hakları");
				puan=input.nextDouble();
				}
			b+=puan;
			puan=0;
			
			while(puan<=0 || puan>10) {
				System.out.println("3-Küresel Isınma: ");
				puan=input.nextDouble(); 
			}
			c+=puan;
			puan=0;
			
			while(puan<=0 || puan>10) {
				System.out.println("4-Adalet Sistemi: ");
				puan=input.nextDouble(); 
			}
			d+=puan;
			puan=0;
			
			while(puan<=0 || puan>10) {
				System.out.println("5-Hava Kirliliği: ");
				puan=input.nextDouble(); 
			}
			e+=puan;
			puan=0;
			
			System.out.println("Teste girmek icin 1 //// testi bitirmek icin 2 ye basin ");
			kontrol = input.nextInt();
			}
		System.out.println("---------- Soruların  Puanları---------------");
		sorular.put("ENflasyon ",a);
		sorular.put("Hayvan Hakları",b);
		sorular.put("Küresel Isınma",c);
		sorular.put("Adalet Sistemi",d);
		sorular.put("Hava Kirliliği",e);
		
		
		for(String i:sorular.keySet()) {
			System.out.println(i+":"+sorular.get(i));
		}
		
		System.out.println("------------Ortalamalar-------------");
		
		HashMap<String,Double> ortalama = new HashMap<String,Double>();
		
		ortalama.put("Enflasyon", a/kisiSayisi);
		ortalama.put("Hayvan Hakları", b/kisiSayisi);
		ortalama.put("Küresel Isınma ", c/kisiSayisi);
		ortalama.put("Adalet  sistemi", d/kisiSayisi);
		ortalama.put("Hava  Kirliliği", e/kisiSayisi);
		
		for(String i:ortalama.keySet()) {
			System.out.println(i+":"+ortalama.get(i));
		}
		
	}


}

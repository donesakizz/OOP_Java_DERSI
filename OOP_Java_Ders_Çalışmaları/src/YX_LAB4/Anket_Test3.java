package YX_LAB4;

import java.util.Scanner;

public class Anket_Test3 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan =new Scanner(System.in);
		//1
		System.out.println("Aşagıdaki kelimelerden hangisi iklim ile ilgilidir?");
		System.out.println("A"+" Bilgisayar");
		System.out.println("B"+"Tablet");
		System.out.println("C"+"Buzdolabı");
		System.out.println("D"+" Defter");
		System.out.println("E"+"Küresel Isınma ");

		String soru1 = scan.nextLine();

		if(soru1.equals("E"))
		{
			System.out.println("dogru");
		}
		else
		{
			System.out.println("yanlis");
		};
		//2

		System.out.println( " Aşağidakilerden hangisi küresel isinmaya karşi alinabilecek onlemler arasinda değildir?");
		System.out.println("A"+" Ambalajları fazla olan ürünleri kullanmaktan kacınmak");
		System.out.println("B"+"Ev ve iş yerinde enerji yalitimi saglamak");
		System.out.println("C"+" Yenilenemez enerji kaynaklarini kullanmayi tercih etmek");
		System.out.println("D"+"Otomobillerin hava ve yakit filtrelerinin her zaman temiz olmasina dikkat etmek ");
		System.out.println("E"+"Evsel atiklari geri donusturmek");

		String soru2 = scan.nextLine();

		if(soru2.equals("C"))
		{
			System.out.println("dogru");
		}
		else
		{
			System.out.println("yanlis");
		};
		//3
		System.out.println("Dunya'ya Gunes'ten gelen isinlar, karbondioksit, metan ve su buhari gibi atmosferde bulunan gazlar tarafindan tutulur. Boylece Dunya'nin sicakligi artar.\r\n"
				+ "\r\n"
				+ "Güneş enerjisinin bu gazlar tarafından tutulması olayına ne ad verilir?");
		System.out.println("A"+" Güneş Tutulması");
		System.out.println("B"+"Sera Etkisi");
		System.out.println("C"+"Buzulların artması");
		System.out.println("D"+" Ozon Tabakasının Delinmesi");
		System.out.println("E"+" Dünya'nın Presizyon Hareketi");

		String soru3=scan.nextLine();

		if(soru3.equals("B"))
		{
			System.out.println("dogru");
		}
		else
		{
			System.out.println("yanlis");
		};
		//4

		System.out.println("Aşagıdaki Hayvanların hangisinin nesli tükenmektedir?");
		System.out.println("A"+" Serçe");
		System.out.println("B"+"Dinozor");
		System.out.println("C"+"Mamut");
		System.out.println("D"+" Panda");
		System.out.println("E"+"  Kedi");
			

		String soru4=scan.nextLine();
		if(soru4.equals("D"))
		{
			System.out.println("dogru");
		}
		else
		{
			System.out.println("yanlis");
		};
		//5
		System.out.println("Aşağıdakilerden hangisi cevreyi korumak için dogrudur?");
		System.out.println("A"+" Elektriği israf etmek");
		System.out.println("B"+"Gereksiz su kullanımı");
		System.out.println("C"+"Petrol tüketimini artırmak");
		System.out.println("D"+" Çöpleri geri dönüştürmemek");
		System.out.println("E"+"  Geri dönüşümün yaygınlaşmak"
				+ "");

		String soru5=scan.nextLine();

		if(soru5.equals("E"))
		{
			System.out.println("dogru");
		}
		else
		{
			System.out.println("yanlis");
		};

		int c = 0;

		if(c==5) {
			System.out.println("mukemmel");
		}
		else if(c==4) {
			System.out.println("cok iyi");
		}
		else if(c<=3) {
			System.out.println("kuresel isinma hakkindaki bilgilerini tazele");
		}else {
			
		}
		

		
	}

}

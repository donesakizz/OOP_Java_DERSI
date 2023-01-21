package YX_LAB4;

import java.util.Scanner;

public class Anket_Test4 {
	

	public static void main(String[] args) {
		int [] soru1 = {1,2,3,4};
		int [] soru2 = {1,2,3,4};
		int [] soru3 = {1,2,3,4};
		int [] soru4 = {1,2,3,4};
		int [] soru5 = {1,2,3,4};
		
		int cevap1=0, cevap2=0, cevap3=0, cevap4=0, cevap5=0;
		int dogru=0;
		System.out.println("a=1 b=2 c=3 d=4");
		
		System.out.println("Hangi ülke en çok sera gazı yaymaktadır? \n A)Çin B)Amerika C)Türkiye D)Hindistan");
		System.out.println("Cevabınız: ");
		Scanner scan = new Scanner(System.in);
		cevap1=scan.nextInt();
		
		if(cevap1==soru1[0]) {
			 dogru =dogru+1;
			System.out.println("Doğru Cevap");
			
		}
		 System.out.println("Hangisi küresel ısınmanın bir etkisi olabilir?\n A)Deniz seviyesinin yükselmesi B)Volkanik patlamalar C)Ada tarımı D)Daha fazla heyelan gerçekleşmesi");
		 System.out.println("Cevabınız: ");
		 Scanner scan2= new Scanner(System.in);
		 cevap2=scan2.nextInt();
		 
		 if(cevap2==soru2[0]) {
			 dogru =dogru+1;
			 System.out.println("Doğru cevap");
		 }
		 System.out.println("Hangi gezegenin atmosferi küresel ısınma ile yok edilmektedir?\n A)Jupiter B)Mars C)Neptün D)Venüs");
		 System.out.println("Cevabınız: ");
		 Scanner scan3= new Scanner(System.in);
		 cevap3=scan3.nextInt();
		 
		 if(cevap3==soru3[3]) {
			 dogru =dogru+1;
			 System.out.println("Doğru cevap");
		 }
		 System.out.println("Küresel ısınmaya karşı en savumasız hayvan hangisidir?\n A)Leopar B)Kutup ayısı C)Deniz Gergedanı D)Tukan");
		 System.out.println("Cevabınız: ");
		 Scanner scan4= new Scanner(System.in);
		 cevap4=scan4.nextInt();
		 
		 if(cevap4==soru4[2]) {
			 dogru =dogru+1;
			 System.out.println("Doğru cevap");
		 }
		
		
		System.out.println("Bunlardan hangisi toksik bir sera gazıdır? \n A)Nitrojen B)Oksijen C)Metan D)Karbonmonoksit");
		System.out.println("Cevabınız: ");
		 Scanner scan5= new Scanner(System.in);
		 cevap5=scan5.nextInt();
		 
		 if(cevap5==soru5[2]) {
			 dogru =dogru+1;
			 System.out.println("Doğru cevap");
		 }
		 if(dogru==5) {
			 System.out.println("Mükemmel");
			 dogru =dogru+1;
		 }
        if(dogru==4) {
        	System.out.println("Çok iyi");
        	dogru =dogru+1;
        }
        if(dogru<=3) {
        	System.out.println("Bilgilerini tazelemelisiniz");
        	dogru =dogru+1;
        	
        }
        
	}


}

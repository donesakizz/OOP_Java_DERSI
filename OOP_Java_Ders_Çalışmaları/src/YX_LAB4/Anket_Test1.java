package YX_LAB4;

import java.util.Scanner;

public class Anket_Test1 {
	
	public static void main(String[] args) {
		String[] que = {"a","b","c","d","a"};
		String[] a = new String[5];
		int i = 0;
		int count = 0;
		//1
		System.out.println("Bulunduğumuz zamandaki  iklim degisiklikleri ...... diye adlandırılır");
		System.out.println("a) Enflasyon ");
		System.out.println("b) Hayvan Hakları");
		System.out.println("c) Küresel ısınma");
		System.out.println("d) Sosyal medya bağımlılığı");
		Scanner sc = new Scanner(System.in);
			a[i] = sc.nextLine();
		if(que[i].equals(a[i])) 
		{
			count++;
			System.out.println("Doğru");
		}
		else
			System.out.println("Yanlis");
		i++;
		//2
		System.out.println("En çok sera gazı yayan ülke aşagıdakilerden hangisidir");
		System.out.println("a) ABD ");
		System.out.println("b) Çin");
		System.out.println("c) Hindistan");
		System.out.println("d) Japonya");
		 Scanner sasc = new Scanner(System.in);
			a[i] = sasc.nextLine();
		if(que[i].equals(a[i])) 
		{
			count++;
			System.out.println("Doğru");
		}
		else
			System.out.println("Yanlis");
		i++;
		//3
		System.out.println(" küresel ısınmadan dolayı yılda  ölen insan sayısı aşagıdakilerden hangisidir ?");
		System.out.println("a) 99-999 ");
		System.out.println("b) 999-4000");
		System.out.println("c) 4000-8000");
		System.out.println("d) 8000+");
		Scanner sc1 = new Scanner(System.in);
			a[i] = sc1.nextLine();
		if(que[i].equals(a[i])) 
		{
			count++;
			System.out.println("Doğru");
		}
		else
			System.out.println("Yanlis");
		i++;
		//4
		System.out.println("İklim değişikliğinden dolayı atmosferi  yok olan gezegen?");
		System.out.println("a) Jupiter ");
		System.out.println("b) Merkür");
		System.out.println("c) Venüs");
		System.out.println("d) Mars");
		Scanner s2c = new Scanner(System.in);
					a[i] = s2c.nextLine();
		if(que[i].equals(a[i])) 
		{
				count++;
				System.out.println("Doğru");
		}
		else
			System.out.println("Yanlis");
		i++;
		//5
		System.out.println("Aşagıdaki hayvanlardan hangisi küresel ısınmadan en çok etkilenir? ");
		System.out.println("a) Kar Leoparı ");
		System.out.println("b) Kutup Ayısı");
		System.out.println("c) Deniz Gergedanı");
		System.out.println("d) Tukan");
		Scanner seec = new Scanner(System.in);
			a[i] = seec.nextLine();
		if(que[i].equals(a[i])) 
		{
			count++;
			System.out.println("Doğru");
		}
		else
			System.out.println("Yanlis");
		i++;
		switch (count)
		{
		case 5:
			System.out.println("çok iyi ");
			break;
		case 4:
			System.out.println(" Iyi");
			break;
		default :
			System.out.println("Bilgileri tazelemelisin");
			
		}
		
		
	   }


}

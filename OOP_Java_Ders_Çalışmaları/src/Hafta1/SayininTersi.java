package Hafta1;

import java.util.Scanner;

public class SayininTersi {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		
		System.out.print("Sayiyi giriniz");
		int num=scan.nextInt();
		
		
		System.out.println("Sayinin tersi:" );
		while(num>0) {
			System.out.print(num%10);
			num /=10;
		}
		

	}


}

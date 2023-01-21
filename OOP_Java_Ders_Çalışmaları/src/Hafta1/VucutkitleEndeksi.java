package Hafta1;

import java.util.Scanner;

public class VucutkitleEndeksi {
	
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		double kilo,boy, bmi;
		System.out.println("kilonuzu yazınız:");
		kilo=input.nextDouble();
		System.out.println("boyunuzu yazınız:");
		boy=input.nextDouble();
		
		bmi =kilo/boy*boy;
		
		 if(bmi<18)
			 System.out.println("zayıf" +bmi);
		 else if(bmi>18 & bmi<25)
			 System.out.println("normal" +bmi);
		 else if(bmi<25 & bmi>30)
			 System.out.println("şişman"+bmi);
		 else if(bmi>30)
			 System.out.println("obez"+bmi);
		

	}


}

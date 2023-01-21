package Hafta1;

import java.util.Scanner;

public class DisplayOddNumbersExample3 {
	
	public static void main(String[] args) {
		int number, i;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the limit:");
		number= sc.nextInt();
		i=0;
		System.out.print("Lit of odd numbers: ");
		while(i<=number)
		{
			System.out.print(i + "");
			i=i+2;
			
		}
		


}
}

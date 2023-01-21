package Hafta1;

import java.util.Scanner;

public class CircleArea {
	

	
		public static void main(String[] args) {
			Scanner input =new Scanner(System.in);
			int r;
			double pi=3.14,area,circumference;
			System.out.println("Enter radius");
			r=input.nextInt();
			area=pi*r*r;
			circumference=2*pi*r;
			System.out.println("Circumference of circle:"+circumference );
			System.out.println("Area of circle  : " +area);
			
			

	

	}


}

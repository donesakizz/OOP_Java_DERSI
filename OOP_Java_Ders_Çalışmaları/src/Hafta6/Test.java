package Hafta6;

public class Test {

	
	// orn 1 : output 55
		/*public static void main(String[] args) {
			int result =sum(10);
			System.out.println(result);
		}
		public static int sum(int v) {
			if(v>0) 
				return v+sum(v-1);   //fonk icinde tekrar fonk cagirdi (recursive)
			
			else 
				return 0;
			
		}*/
		
		
		
		//ORN 2:faktoriyel output 120
		
		/*public static void main(String[] args) {
			int result = sum(5);
			System.out.println(result);
		}
		
		public static int sum(int v) {
			if(v>0)
				return v*sum(v-1);
			else
				return 1;
		}*/
		
		
		//ORN 3:Fibonacci koda bak hata verdi
		
		static int n0=0,n1=1,n3=0; // bu sekilde degiskenleri tanımlarsak global degisken olur.
		//gloval degiskenler static olan tüm metotlarda kullanılabilir.
		
		static void yazfibo(int count)
		{
			if(count>0) {
				n3=n0+n1;
				n0=n1;
				n1=n3;
				System.out.print(" " + n3);
				yazfibo(count-1);
			}
		}
			public static void main(String[] args)
			{
				int count=15;
				System.out.print(n0 + " " + n1 );
				yazfibo(count-2);
			}
		}
		
		
		


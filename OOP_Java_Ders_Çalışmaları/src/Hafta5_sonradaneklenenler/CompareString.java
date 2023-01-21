package Hafta5_sonradaneklenenler;

public class CompareString {
	

	public static void main(String[] args) {
		 String s1 = "Mehmet";
		 String s2 =  "Murat";
		 String s3 = "Ali";
		 String s4 = "Can";
		 String s5 = "İlhan";
		 String s6 = "Ahmet";
		 //s1 ile s2 karsılastirma:
		 System.out.println("s1 -s2 =" +s1.compareTo(s2) );
		 /* M=77, e=101 ,u=117, e-u=101-117=-16, e<u */
		 
		 //s1 ile s4 'u karsilastirma :
		 System.out.println("s1-s4 =" +s1.compareTo(s4) );
		 System.out.println("s5-s6 =" +s5.compareTo(s6));
	}


}

package Hafta2;

public class FaizHesaplama {
	public static void main(String[] args) {
		int anapara=1000;
		int ay=11;
		double r=0.05;
		double a=0;
		
		for (int i=1;i<11;i++) {
			a=anapara*Math.pow(1+0.05,ay);
			System.out.println("tutar: "+a);
			
		}
		System.out.println("yıl sonundaki depozito tutarı: " +a);

	}

}

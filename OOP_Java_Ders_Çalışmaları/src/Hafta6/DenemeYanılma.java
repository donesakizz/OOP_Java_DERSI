package Hafta6;

public class DenemeYanılma {

	public static void main(String[] args) {

		try {
			int[] number= {1,2,3,4,5};
			System.out.println(number[10]);//10. indexteki elemanı cagırmaya calıstık
			System.out.println("try devam ediyor");
		}catch(Exception e) {
			System.out.println("Index disina cikildi");
		}
		
		System.out.println("islemlere devam ediliyor...");
	}
     //try da dene hata varsa catch bloguna atlar 
	//exception e hata mesajını soyler
	//try da hata olustıgu anda catch e atlar bu nedenle hatanın altına yazılan kodlar çalışmaz..
}

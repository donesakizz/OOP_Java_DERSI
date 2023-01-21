package YX_OOP_Examples_inheritance2;


public class Test {
	
	public static void main(String[] args) {
		Calisan c = new Calisan();
		Akademisyen a = new Akademisyen();//type cast yapmayınca hata verdi
		Memurlar m = new Memurlar();
		m.giris();
		System.out.println(Akademisyen.giris1() );
		System.out.println(Akademisyen.giris1() );
		System.out.println(Memurlar.giris1() );
	}


}

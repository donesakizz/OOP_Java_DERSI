package YX_OOP_Examples_MetotOverriding;


public class Test {
	
	
	public static void main(String[] args) {
		Akademisyen a = new Akademisyen("Ahmet " ,"a@gmail.com" , 0505050000 ,"CENG" ,"Hoca","CENG 101");
		System.out.println(a.getAdSoyad() );
		
		OgretimUyesi o = new OgretimUyesi("mehmet " ,"a@gmail.com" , 0505050000 ,"CENG" ,"Hoca","CENG 101","Profesör");
		o.giris();
		
		Calisan c = new Calisan("mehmet " ,"a@gmail.com" , 0505050000 );
		c.giris();
		
		Memurlar m = new Memurlar("Veli " ,"a@gmail.com" , 0505050000 ,"Bilgi İşlem " , "Tam zamanlı");
		m.giris();
		//Memurlar sınıfında metot override yapılmadı .
		//O yüzden m.giriş kuzey taraftan yazmaz o.giriş gibi.
		
		
		System.out.println(a.girisSayisi() );
		System.out.println(c.girisSayisi() );
		System.out.println(a.girisSayisi() );
		
	}


}

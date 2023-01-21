package YX_OOP_Examples_inheritance;


public class Test {
	
	public static void main(String[] args) {
		Akademisyen a = new Akademisyen("Ahmet " ,"a@gmail.com" , 0505050000 ,"CENG" ,"Hoca","CENG 101");
		System.out.println(a.getAdSoyad() );
		
		OgretimUyesi o = new OgretimUyesi("mehmet " ,"a@gmail.com" , 0505050000 ,"CENG" ,"Hoca","CENG 101","Profesör");
		o.giris();
	}


}

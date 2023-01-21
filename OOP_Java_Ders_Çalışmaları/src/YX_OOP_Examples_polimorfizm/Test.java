package YX_OOP_Examples_polimorfizm;


public class Test {
	
	public static void main(String[] args) {
		Akademisyen a = new Akademisyen("Ahmet " ,"a@gmail.com" , 0505050000 ,"CENG" ,"Hoca","CENG 101");
		
		
		OgretimUyesi o = new OgretimUyesi("mehmet " ,"a@gmail.com" , 0505050000 ,"CENG" ,"Hoca","CENG 101","Profesör");
		
		
		Calisan c = new Akademisyen("mehmet " ,"a@gmail.com" , 0505050000 ,"CENG" ,"Hoca" ,"CENG 104");
		
		
		Memurlar m = new Memurlar("Veli " ,"a@gmail.com" , 0505050000 ,"Bilgi İşlem " , "Tam zamanlı");
		
		Akademisyen[] abc = {a,o}; //m yazsaydık hata verirdi.Çünkü m bu ikisi gibi birinin alt üst sınıfı değil
		
		Calisan[] girisListesi = {a,o,m}; //Calısan classından olursa m yi kabul ediyor
		Calisan.listele(girisListesi);
	}


}

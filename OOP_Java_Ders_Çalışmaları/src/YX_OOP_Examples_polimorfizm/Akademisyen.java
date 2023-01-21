package YX_OOP_Examples_polimorfizm;


public class Akademisyen extends Calisan{
	String bolum, gorevler;
	String  ders;
	
	
	//Akademisyen classın constructorı oluşturulurken super metodu ile extend edildiği classın değişkenlerini alır.
	//Parametre olarak hem kendi hem de extend edildiği classın değişkenlerini alır. 
	public Akademisyen (String adSoyad, String email, int telefon,String bolum,String gorevler , String ders) {
		super(adSoyad,email,telefon);
		this.bolum=bolum;
		this.gorevler=gorevler;
		this.ders=ders;
	}

	
	public void derseGir() {
		System.out.println("Derse girildi");
	}
	
	//Metotoverride yapıldı extend edildiği classdan 
	public String giris() {
		return super.giris() +" kuzeyden";
	}

	
	// Kodu yazarken ata class hariç diger classların getter ve setterları oluşturuldu.
	//Alt sınıfların  get ve setterı olmasa da calışıyor kod ama encapsulation ilkesine uysun diye eklenildi
	

	public String getBolum() {
		return bolum;
	}


	public void setBolum(String bolum) {
		this.bolum = bolum;
	}


	public String getGorevler() {
		return gorevler;
	}


	public void setGorevler(String gorevler) {
		this.gorevler = gorevler;
	}


	public String getDers() {
		return ders;
	}


	public void setDers(String ders) {
		this.ders = ders;
	}
	
	
}

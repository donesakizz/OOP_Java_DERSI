package YX_OOP_Examples_MetotOverriding;

//Ata class Calisan classdır
public class Calisan {
	 protected String adSoyad ,email;
	 protected int telefon;
	 public int girisSayisi;// Akademisyen classında Override edececeğim method için gerekli değişkendi
	
	
	
	public Calisan(String adSoyad, String email, int telefon) {
		//super();
		this.adSoyad = adSoyad;
		this.email = email;
		this.telefon = telefon;
	}


  // Akademisyen classında Override edilecek  dönüşşsüz Syso ile yazılan method
	public void giris() {
		System.out.println( this.adSoyad +"Calişan giriş yaptı");
	}
	
	//bu method return ile değer döndüren bir methodun Akademisyen classında override edilişini göstermek için yazdım 
	public int girisSayisi() {
		return ++girisSayisi;
	}

	// constructorı ve giris metodunu yazdıktan sonra  Getter ve Setter metodları oluşturuluyor bu kısımda 
	//Getter ve Setterlar bu classın sub classlarınada gider,erişiliebilinir olur
	public String getAdSoyad() {
		return adSoyad;
	}



	public void setAdSoyad(String adSoyad) {
		this.adSoyad = adSoyad;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public int getTelefon() {
		return telefon;
	}



	public void setTelefon(int telefon) {
		this.telefon = telefon;
	}
	
	
}

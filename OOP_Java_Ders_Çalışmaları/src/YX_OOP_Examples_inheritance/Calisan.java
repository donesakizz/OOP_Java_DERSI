package YX_OOP_Examples_inheritance;


//Ata class Calisan classdır
public class Calisan {
	 protected String adSoyad ,email;
	 protected int telefon;
	
	
	
	public Calisan(String adSoyad, String email, int telefon) {
		//super();
		this.adSoyad = adSoyad;
		this.email = email;
		this.telefon = telefon;
	}



	protected void giris() {
		System.out.println( this.adSoyad +"Calişan giriş yaptı");
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

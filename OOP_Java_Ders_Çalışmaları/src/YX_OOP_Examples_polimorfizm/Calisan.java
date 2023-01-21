package YX_OOP_Examples_polimorfizm;

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


// Akademisyen classında Override edilecek  dönüş degeri olan yazılan method
	public String giris() {
		return this.adSoyad +" giriş yaptı";
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

	//static ile bu classdan nesne üretmeden metot ile cağırabilinir
	// bu method ile Test sınıfında üretilen nesneler parametre olarak gönderilir 
	//ve bu metot listeleme yapar
	public static void listele(Calisan[ ]girisYapanlar) {
		for(Calisan c : girisYapanlar) {
			System.out.println(c.giris() );
		}
		
	}
		
	}
	


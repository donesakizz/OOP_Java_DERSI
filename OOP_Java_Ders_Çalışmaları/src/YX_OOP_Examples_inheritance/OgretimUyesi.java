package YX_OOP_Examples_inheritance;


public class OgretimUyesi extends Akademisyen{
	String unvan;

	public OgretimUyesi(String adSoyad, String email, int telefon, String bolum, String gorevler, String ders,
			String unvan) {
		super(adSoyad, email, telefon, bolum, gorevler, ders);
		this.unvan = unvan;
	}
   
	
	//Kodu yazarken ata class hariç diger classların getter ve setterları oluşturuldu.
	//Alt sınıfların  get ve setterı olmasa da calışıyor kod ama encapsulation ilkesine uysun diye eklenildi
	public String getUnvan() {
		return unvan;
	}

	public void setUnvan(String unvan) {
		this.unvan = unvan;
	}
	
}
	
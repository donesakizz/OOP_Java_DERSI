package YX_OOP_Examples_inheritance;



public class Guvenlik extends Memurlar{
	String belge;

	public Guvenlik(String adSoyad, String email, int telefon, String departman, String mesai, String belge) {
		super(adSoyad, email, telefon, departman, mesai);
		this.belge = belge;
	}
    
	
	// Kodu yazarken ata class hariç diger classların getter ve setterları oluşturuldu.
	//Alt sınıfların  get ve setterı olmasa da calışıyor kod ama encapsulation ilkesine uysun diye eklenildi
	public String getBelge() {
		return belge;
	}

	public void setBelge(String belge) {
		this.belge = belge;
	}
	

}

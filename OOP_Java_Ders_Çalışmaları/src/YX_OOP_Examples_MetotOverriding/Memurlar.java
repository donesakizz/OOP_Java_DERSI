package YX_OOP_Examples_MetotOverriding;


public class Memurlar extends Calisan{
	String departman ,mesai;

	public Memurlar(String adSoyad, String email, int telefon, String departman, String mesai) {
		super(adSoyad, email, telefon);
		this.departman = departman;
		this.mesai = mesai;
	
	}
	
	
	// Kodu yazarken ata class hariç diger classların getter ve setterları oluşturuldu.
	//Alt sınıfların  get ve setterı olmasa da calışıyor kod ama encapsulation ilkesine uysun diye eklenildi
	public String getDepartman() {
		return departman;
	}

	public void setDepartman(String departman) {
		this.departman = departman;
	}

	public String getMesai() {
		return mesai;
	}

	public void setMesai(String mesai) {
		this.mesai = mesai;
	}

}

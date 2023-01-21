package YX_OOP_Examples_MetotOverriding;


public class BilgiIslem extends Memurlar{
	String gorev;

	public BilgiIslem(String adSoyad, String email, int telefon, String departman, String mesai, String gorev) {
		super(adSoyad, email, telefon, departman, mesai);
		this.gorev = gorev;
	}
	
	
	// Kodu yazarken ata class hariç diger classların getter ve setterları oluşturuldu.
	//Alt sınıfların  get ve setterı olmasa da calışıyor kod ama encapsulation ilkesine uysun diye eklenildi
	public String getGorev() {
		return gorev;
	}

	public void setGorev(String gorev) {
		this.gorev = gorev;
	} 
	

}

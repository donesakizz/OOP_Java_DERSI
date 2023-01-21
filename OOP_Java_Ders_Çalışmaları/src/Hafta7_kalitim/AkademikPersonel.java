package Hafta7_kalitim;

public class AkademikPersonel extends person{
	
	protected String departman;

	protected AkademikPersonel(String adi, String soyadi, String email, String departman) {
		super(adi, soyadi, email);
		this.departman = departman;
	}

	protected String getDepartman() {
		return departman;
	}

	protected void setDepartman(String departman) {
		this.departman = departman;
	}
	
	protected String giris() {
		return "Fakulte Kapisindan Giris Yapti";
	}
	
	
	//Asagıdaki method abstract edildi ama error verdiğinden  abstract silindi. remove 
	protected  String cikis() {
		return null;
	}
	

}

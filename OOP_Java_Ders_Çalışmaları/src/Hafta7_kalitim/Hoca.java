package Hafta7_kalitim;

public class Hoca extends AkademikPersonel{
	
	protected String unvan;

	protected Hoca(String adi, String soyadi, String email, String departman, String unvan) {
		super(adi, soyadi, email, departman);
		this.unvan = unvan;
	}

	protected String getUnvan() {
		return unvan;
	}

	protected void setUnvan(String unvan) {
		this.unvan = unvan;
	}
	
	protected String giris() {
		return "Fakulte A Kapisindan Giris Yapti";
	}
	
	protected String cikis() {
		return "Fakulte A Kapisidan Cikis Yapti";
	}


}

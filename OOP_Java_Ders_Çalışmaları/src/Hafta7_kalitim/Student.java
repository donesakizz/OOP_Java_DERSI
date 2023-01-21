package Hafta7_kalitim;

public class Student extends person{
	
	protected int ogrId;

	protected Student(String adi, String soyadi, String email, int ogrId) {
		super(adi, soyadi, email);
		this.ogrId = ogrId;
	}

	protected int getOgrId() {
		
		return ogrId;
	}

	protected void setOgrId(int ogrId) {
		this.ogrId = ogrId;
	} 
	
	protected String giris() {
		return super.giris();
	}


}

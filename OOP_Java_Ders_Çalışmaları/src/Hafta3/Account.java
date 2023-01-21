package Hafta3;

public class Account {
	public String name;
	private String surname;
	private int yas;
	
	
	//Getter ve Setter ,Constructor kavramı anlatıldı bu ders,
	public Account(String name, String surname, int yas) {// constructor oluşturmazsak sınıf ile kurucu adı aynı,tanıttık
		
		this.name = name;
		this.surname = surname;
		this.yas = yas;
	}
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public int getYas() {
		return yas;
	}
	
	public void setYas(int yas) {
		this.yas = yas;
	}
	
	

}

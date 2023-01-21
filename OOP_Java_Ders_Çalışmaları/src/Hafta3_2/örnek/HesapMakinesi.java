package Hafta3_2.örnek;

public class HesapMakinesi {
	
	public int number1;
	public int number2;
	public String color;
	
	//constructor
	HesapMakinesi(int number1 , int number2 , String color){
		this.number1=number1;
		this.number2=number2;
		this.color=color;
		
	}
    // nesneye bagımlı üretildikleri için bu metotlarda static belirleyicisi kullanılmadı	
	public  int toplama() {
		return this.number1 + this.number2 ;
		
	}
	
	public int cikarma() {
		return this.number1 - number2;
	}
	
	public int carpma() {
		return this.number1 * number2;
	}
	
	public int bolme() {
		return this.number1 / number2;
	}
	
	
	
	

}

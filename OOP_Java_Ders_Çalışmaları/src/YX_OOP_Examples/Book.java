package YX_OOP_Examples;

public class Book {
	
	
	public String name,author ,publisher;
	private int numberOfPage;
	
	Book(String name , String author ,String publisher , int numberOfPage){
		this.name=name;
		this.author=author;
		this.publisher=publisher;
		// numberOfPage değişkenini almadan önce negatif deger girilip girilmediğini kontrol etmek için
		//constructor if else ile kontrol saglandı.
		if(numberOfPage < 1) {
			this.numberOfPage = 5;
			
		}else {
		this.numberOfPage=numberOfPage;
		
		}
	}
	
	//numberOfPage private değişken olduğu için başka class tarafından görülemez.
	//O yüzden değişken olarak onu alan bir metot oluşturduk  
	public void pageSize() {
		System.out.println(numberOfPage);
	}
	//private tanımlanan değişkenleri ancak tanımlandığı sınıftaki metotdaki kodlar  ile erişimi değiştirilebilir
	


}

package YX_OOP_Examples;

public class Test {
	
	public static void main(String[] args) {
		Book b1 = new Book("War and Peace" ,"rowling", "Tolstoy" , 750);
		
		//System.out.println(b1.pageSize())  //Bunu yazınca hata verir .Çünkü Metotda Syso var ve yine Syso içinde yazılamaz.
		
		b1.pageSize(); //  pageSize metodunun dogru kullanımıdır

	}

}

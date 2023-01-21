package Hafta3;


public class AccountTest {
	

	public static void main(String[] args) {
		String isim ="Deniz";
		String soyisim="Skz";
		int yas=20;
		int yas2=30;
		Account person=new Account(isim,soyisim,yas);
		
		System.out.println("Hosgeldiniz "+person.getName()+" "+person.getSurname());
		System.out.println("Yaşınız=" +person.getYas());
		
		//adı degiştirebiliyoruz 
		person.setName("Hasan ");
		person.setSurname("Yılmaz");
		person.setYas(yas2);
		
		System.out.println("hosgeldiniz"+person.getName()+" "+person.getSurname());
		System.out.println("Yaşınız=" +person.getYas());
		
		Account person2=new Account("Ali","veli",25);
		
		System.out.println("hosgeldiniz"+person2.getName()+" "+person2.getSurname());
		System.out.println("Yaşınız=" +person2.getYas());
	    //person2.name ile sadece isme ulasamayız.çünkü private ile kilitledik .buna kapsülezin deniliyor
		System.out.println(person2.name);
	
	}


}

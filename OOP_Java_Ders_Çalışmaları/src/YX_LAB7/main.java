package YX_LAB7;


public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fish d = new Fish();
		Cat  c = new Cat("FLUFFY",4,4);
		Animal a = new Fish();
		Animal e = new Spider(6);
		Pet p = new Fish();	
		p.walk();
		c.eat();
		d.play();
		//e.eat(); //eat metodu animalda olmadığı için hata verir bu satır
		
		
	}

}
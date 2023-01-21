package YX_LAB7;

public class Fish extends Animal implements Pet{
	
	String name = "balık";
	
	public Fish() {
		super(0);
	}
	
	public String getName()  {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void play(){
		System.out.println("balık yuz");
	}
	
	public void walk() {
		System.out.println("blık yurumez");
	}
	
	public void eat() {
		System.out.println("balık ye");
	}
	 
}
package YX_LAB7;

public class Cat extends Animal implements Pet {
	
	private String name;
	private int legsCat;


	
	
	Cat(String name, int legs,int legsCat) {
		super( legs);
		this.name = name;
		this.legsCat=legsCat;
		
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	public int getLegsCat() {
		return legsCat;
	}

	public void setLegsCat(int legsCat) {
		this.legsCat = legsCat;
	}

	
	
	public void walk() {
		System.out.println("kedi yuru");
	}
	
	public void eat() {
		System.out.println("kedi ye");
	}
	public void info() {
		System.out.println("be");
	}
	
}
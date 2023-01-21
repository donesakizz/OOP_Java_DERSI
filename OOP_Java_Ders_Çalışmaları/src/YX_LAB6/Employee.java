package YX_LAB6;

public class Employee {
	
	private String name;
	private String surname;
	private String tc;
	
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

	public String getTc() {
		return tc;
	}

	public void setTc(String tc) {
		this.tc = tc;
	}

	public Employee(String name, String surname, String tc) {
		super();
		this.name = name;
		this.surname = surname;
		this.tc = tc;
	}
	
	public String write() {
		return "benim adim "+ name + "soy adim: "+ surname + "tc: "+tc;
	}

}

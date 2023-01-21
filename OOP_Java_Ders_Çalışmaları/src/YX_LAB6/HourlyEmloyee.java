package YX_LAB6;



public class HourlyEmloyee extends Employee{
	public HourlyEmloyee(String name, String surname, String tc,int hour, int wage) {
		super(name, surname, tc);
		this.wage = wage;
		this.hour = hour;
		// TODO Auto-generated constructor stub
	}


	private int hour;
	private int wage;
	
	public String getBilgi() {
		return super.write()+" maasim: "+hour*wage;
	}
	
}

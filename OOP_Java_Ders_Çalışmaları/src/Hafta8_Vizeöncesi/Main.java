package Hafta8_Vizeöncesi;


public class Main {
	
	public static void main(String[] args) {
		employee Ahmet =new employee("Ahmet","Mehmet");
		employee Hasan=new employee("Hasan","Hüseyin",6500);
		employee Leyla=new Engineer("Leyla","Mecnun");
		employee Ali=new Engineer ("Ali","Veli",15001);
		Engineer Alican=new Engineer ("Ali","Veli",15001);
		Ahmet.info();
        Hasan.info();
        Leyla.info();
        Ali.info();
	}
	
	

}

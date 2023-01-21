package Hafta8_Vizeöncesi;

public class employee {
	
	protected String ayrac= "-----------------------------";
	protected String name,surname,job;
	protected int salary ,annualPermit;
	
	public employee(String name, String surname) {
		
		this.name = name;
		this.surname = surname;
		this.job="Çalışan";
		this.salary=5500;
		this.annualPermit=10;
		
	}
	public employee(String name, String surname, int salary) {
		
		this.name = name;
		this.surname = surname;
		this.salary = salary;
		this.annualPermit=10;
		if(salary>6000) {
			this.job="Kıdemli çalışan";
			annualPermit+=3;
		}
		else if(salary>0 && salary <=6000) {
			this.job="Çalışan";
			
		}else {
			this.job="Stajer";
			
		}
	}
	protected employee() {}
		
	public int makeRaise(int howMuch) {
			salary+=howMuch;
			return salary;
		}
	public int makeRaise(double howMuch) {
		double money=(double)salary*howMuch;
		makeRaise((int )money);
		return salary;
	}
	public void setJob(String job) {
		this.job=job;
	}
	public void setSalary(int salary) {
		this.salary=salary;
	}
	public void setAnnualPermit(int permit) {
		this.annualPermit=permit;
		
	}
	public String getJob() {
		return job;
	}
	public int getSalary() {
		return salary;
	}
	public int getAnnualPermit() {
		return annualPermit;
	}
	public void info() {
		System.out.println(getJob()+ " Bilgileri\n" +ayrac+ "\nÇalışan ismi :"+name +"\n Çalışan Soyismi : "+surname + "\n"
	   +getSalary()+"\n İzin günü :"+getAnnualPermit()+"iş Günü \n" +ayrac );
		
	}
	public void raiseinfo() {
		System.out.println(getJob()+" Zam Uygulaması \n"+ayrac+"\nYeni verilecek Maaş:");
	}
	

}

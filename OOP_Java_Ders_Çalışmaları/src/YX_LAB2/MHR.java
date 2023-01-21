package YX_LAB2;

import java.util.Scanner;

public class MHR {

	
	public String name;
	public String surname;
	public int dogumtarihi;
	
	
	


       MHR(String name, String surname, int dogumtarihi) {
		this.name = name;
		this.surname = surname;
		this.dogumtarihi = dogumtarihi;
	}

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

	public int getDogumtarihi() {
		return dogumtarihi;
	}

	public void setDogumtarihi(int dogumtarihi) {
		this.dogumtarihi = dogumtarihi;
	}

	
	
	public void show() {
		int mhr =220;
		int result= mhr -this.dogumtarihi;
		System.out.println("Adınız"+ this.name);
		System.out.println("soyadınız"+this.surname);
		System.out.println("yas"+this.dogumtarihi);
		System.out.println("thrniz" + result);
		
	
	}
	
	
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		String name;
		String surname ;
		int dogumtarihi;
	    
		
		System.out.println("adınızı giriniz" );
	     name=input.nextLine();
		System.out.println("soyadınız giriniz" );
	    surname=input.nextLine();
		System.out.println("dogum tarihinizi giriniz" );
		dogumtarihi=input.nextInt();
		int mhr =220 - dogumtarihi;
		
		System.out.println("adınız : " +name +"soyadınız  :"+surname +"mhrniz  :" +mhr);
		
       
        			
        }



}

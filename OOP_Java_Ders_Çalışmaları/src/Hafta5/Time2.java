package Hafta5;

public class Time2 {
	
	private int hour;
	private int  minute;
	private int second;
	
	public Time2 ()
	{
		
	}
	public Time2 (int saat)
	{
		this.hour=saat;
	}
	
	public Time2(int saat, int dakika)
	{
		this.minute =dakika;
		this.hour =saat;
	}
	public Time2(int saat,int dakika,int saniye)
	{
		this.minute=dakika;
		this.hour=saat;
		this.second=saniye;
	}
	
	public void setSaat(int saat)
	{
		if(hour<0 || hour>23 ) 
		{
			System.out.println("Yanlis saat degerleri giriniz");
		}
		this.hour=saat;
	}
	
	
	public void setSaatDakika(int saat,int dakika)
	{
		if(hour<0 || hour>23 || minute<0 || minute>60 ) 
		{
			System.out.println("Yanlis saat degerleri giriniz");
		}
		this.hour=saat;
		this.minute=dakika;
	}
		

	
	public void setSaatDakikaSaniye(int saat,int dakika,int saniye)
	{
		if(hour<0 || hour>23 || minute<0 || minute>60 || second<0 || second>60) 
		{
			System.out.println("Yanlis saat degerleri giriniz");
		}
		this.hour=saat;
		this.minute=dakika;
		this.second =saniye;

	}
	public String saat()
	{
		return String.format("%02d:%02d:%02d", hour ,minute ,second);
	}
	


}

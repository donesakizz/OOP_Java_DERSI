package Hafta5;

public class Time1 {
	
	private int hour ;
	private int minute;
	private int second;
	public static int count=0;
	
	public void setTime(int hour,int minute,int second) {
		
		if(hour<0 || hour>23 || minute<0 || minute>60 || second<0 || second>60) 
		{
			System.out.println("Yanlis saat degerleri giriniz");
		}
		this.hour=hour;
		this.minute=minute;
		this.second =second;
		count++;
	}
	
	public String saat() {
		
		return String.format("%02d:%02d:%02d", hour ,minute ,second);
	}
	 public static int getCount()
	 {
		 return count;
	 }
	
	


}

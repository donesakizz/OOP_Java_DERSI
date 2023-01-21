package Y_GUI_JOptionpane;

import javax.swing.JOptionPane;

public class TakvimOluşturma {
	
	public static void main(String[] args) 
	{//yili gir
		String yilGir = JOptionPane.showInputDialog("Yılı tam sayı olarak gir:");
		int yil=Integer.parseInt(yilGir);//yili tam sayiya cevirme
		
		String ayGir = JOptionPane.showInputDialog("Ay için 1 ile 12 arasında bir sayı gir:");
		int ay=Integer.parseInt(ayGir);//Ay 'i tam sayiya cevirme
		// takvimi yaz;
		Yaz(yil,ay);
		
	}
	static void Yaz(int yil,int ay)
	{
		AyinIsminiYaz( yil , ay);
		AyinGunleriniYaz( yil, ay);
	}
	static void AyinIsminiYaz(int yil,int ay)
	{
		System.out.println("   Ay :" + AyinIsminiAl(ay) );
		System.out.println("  Yıl :" + yil );
		System.out.println(" ------------------------------------------------\n  ");
		System.out.println("paz    pte    sal    çar    per    cum    cte" );
	}
	static String AyinIsminiAl(int ay)
	{
		String ayinIsmi =null;
		switch(ay)
		{
		case 1:ayinIsmi = "Ocak" ;break;
		case 2:ayinIsmi = "Şubat" ;break;
		case 3:ayinIsmi = "Mart" ;break;
		case 4:ayinIsmi = "Nisan" ;break;
		case 5:ayinIsmi = "Mayıs" ;break;
		case 6:ayinIsmi = "Haziran" ;break;
		case 7:ayinIsmi = "Temmuz" ;break;
		case 8:ayinIsmi = "Agustos" ;break;
		case 9:ayinIsmi = "eylül" ;break;
		case 10:ayinIsmi = "Ekim" ;break;
		case 11 :ayinIsmi = "Kasım" ;break;
		case 12:ayinIsmi = "Aralık" ;break;
		}
		return ayinIsmi;
	}
	
	static void AyinGunleriniYaz(int yil,int ay)
	{
		int BaslamaGunu= IlkGunuAl( yil , ay );
		int AydakiGunSayisi = AydakiGunSayisiniAl( yil , ay);
		
		int i;
		for(i=0; i<BaslamaGunu; i++)	
			System.out.print("         ");
		for(i=1; i<= AydakiGunSayisi ;i++)
		{
			if(i<10)
				System.out.print("      " +i);
			else
				System.out.print("      " +i);
			if((i  +  BaslamaGunu) % 7 ==0)
				System.out.println();
		}
		System.out.println();
	}
	
	static int IlkGunuAl(int yil , int ay)
	{
		int IlkGun1800 = 3;
		int GunlerinToplamSayisi = GunlerinToplamSayisiniAl( yil ,ay);
		return (GunlerinToplamSayisi + IlkGun1800) %7 ;
		
	}
	
	static int GunlerinToplamSayisiniAl(int yil,int ay)
	{
		int Toplam =0;
		for(int i =1800; i<yil ;i++)
			if(ArtikYil(i) )
				Toplam =Toplam +366;
			else 
				Toplam =Toplam +365;
		
		for(int i= 1; i<ay ; i++)
			Toplam =Toplam + AydakiGunSayisiniAl( yil , i);
		
		return Toplam;
		
	}
	
	static int AydakiGunSayisiniAl(int yil ,int ay)
	{
		if(ay==1 || ay ==3 || ay == 5 || ay ==7 || ay ==8 || ay ==10 || ay==12 )
			return 31;
		if(ay == 4 || ay ==6 || ay ==9 ||ay ==11)
			return 30;
		if(ay ==2) return(ArtikYil(yil)) ? 29 :28 ;
		return 0;
		
	}
	static boolean ArtikYil(int yil)
	{
		return(yil %400 ==0 || (yil % 4==0 && yil %100 !=0) );
		
	}

}

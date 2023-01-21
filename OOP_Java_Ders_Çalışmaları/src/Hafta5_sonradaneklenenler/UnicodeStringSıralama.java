package Hafta5_sonradaneklenenler;

import java.text.Collator;
import java.util.Locale;

public class UnicodeStringSıralama {
	
	static String [] s= { "Mehmet", "Colpan","Murat","Önder","Şeyma","Ali","Ahmet","İlhan","Ahmet"};
	static String yedek ;
	
	public static void sirala(Collator coll,String[] s)
	{
		for(int i=0;i<10;i++)
		{
			for(int j=i+1;j<10;j++)
				if(coll.compare(s[i],s[j] )< 0 )  continue;
				else
				{
					yedek =s[i];
			        s[i]=s[j];
			        s[j]=yedek;
		        }
		
	}
	}
	

	public static void main(String[] args) {
		Collator kar =Collator.getInstance(new Locale("tr"));
		
		sirala(kar,s);
		for(int i=0;i<10;i++)
			System.out.println( i+ ".sirada :" +s[i]  );

	}


}

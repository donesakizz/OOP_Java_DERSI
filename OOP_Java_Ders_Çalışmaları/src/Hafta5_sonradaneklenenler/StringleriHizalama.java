package Hafta5_sonradaneklenenler;

public class StringleriHizalama {
	

	public static void main(String[] args) {
		String [] s= {"Mehmet","Colpan","Murat","Önder","Ali","Ahmet","Can","İlhan"};
		
        String yedek;
        for(int i=0;i<8;i++)
        {
        	for(int j=i+1;j<8;j++)
        		if(s[i].compareTo( s[j] ) <0 ) continue;
        		else
        		{
        			yedek =s[i];
        			s[i]=s[j];
        			s[j]=yedek;
        			
        		}
        }
        for(int i=0;i<8;i++)
        	System.out.println(i+".sirada :" + s[i] );
	}


}

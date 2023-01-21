package YX_LAB5;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_Anket1 {
	
	public static void tablo_yazdir()
	{
		for(int i=0;i<5;i++) {
			System.out.println();
		}
	}
	
	static int[][] tablo = new int [5][10];
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<String>item= new ArrayList<String>();
		item.add("soru 1:Enflasyon");
		item.add("soru 2:Hayvan Hakları");
		item.add("soru 3:Küresel ısınma ");
		item.add("soru 4:Adalet");
		item.add("soru 5:Hava kirliliği");
		
		for(int k=0;k<5;k++)
		{
			System.out.println(item.get(k) + " Sizdeki önem derecesi nedir?");
			System.out.println("  önem derecenize göre 1-10   arası puan veriniz ");
			int derece = sc.nextInt();
			for(int l=0;l<5;l++)
			{
				if(derece==1)
				{
					tablo[k][1]=tablo[k][l]+1;
				}
				
				
				
				
				
				
			}
			
			
			
		}	
		
		
	}


}

package YX_LAB10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class odevsolve {
	
	static String odevCoz(String value, int i) {
		char[] chars = value.toCharArray();
		for (int a = 0;a<chars.length;a++) {
			chars[a] = (char) (chars[a]+i);
		}
		
		return String.valueOf(chars);
	}
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		File f = new File("kullanici.csv");
		Scanner f2 = new Scanner(f);
		
		while(f2.hasNextLine()) {
			String Line = f2.nextLine();
			String[] split = Line.split(";");
			for (int i=1;i<100;i++) {
				System.out.println(odevCoz(split[0],i));
				System.out.println();
				System.out.println(odevCoz(split[0],-i));
				
			}
			
			///password bomb
			
			System.out.print("\n");
			
			
		}
	}

}

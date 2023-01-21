package YX_LAB10;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class csvIO {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	    FileWriter fw;
		ArrayList<String[]> values = new ArrayList();
	    File f2 = new File("dosya.txt");
	    Scanner s2 = new Scanner(f2);
	    while (s2.hasNextLine()) {
	    	String Line = s2.nextLine();
	    	String[] split = Line.split(" ");
	    	values.add(split);
	    }
	    
		File f = new File("deneme.csv");
		if (!f.exists()) 
			f.createNewFile();
		
		fw = new FileWriter(f,false); // 
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("id;name;surname;balance\n");
		for (int i=0;i<values.size();i++) {
			String[] values2 = values.get(i);
			bw.write(values2[0]+";"+values2[1]+";"+values2[2]+";"+values2[3]+"\n");
		}
		
		
		
		bw.close();
		// csv okuma --
		Scanner s = new Scanner(f);
		while (s.hasNextLine()) {
			String line = s.nextLine();
			String[] split = line.split(";");
			for (String data : split) {
				System.out.print(data+" ");
			}
			System.out.print("\n");
		}
	}


}

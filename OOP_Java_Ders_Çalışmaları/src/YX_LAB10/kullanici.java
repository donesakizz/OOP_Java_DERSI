package YX_LAB10;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class kullanici {
	
	static String OdevCode(String value) {
		char[] chars = value.toCharArray();
		for (int i=0;i<chars.length;i++)
			chars[i] = (char) (chars[i]-5);
		
		return String.valueOf(chars);
	}
	
	static String OdevDecode(String value) {
		char[] chars = value.toCharArray();
		for (int i=0;i<chars.length;i++)
			chars[i] = (char) (chars[i]+5);
		
		return String.valueOf(chars);
	}
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter fw;
		
		File file = new File("kullanici.csv");
		if (!file.exists())
			file.createNewFile();
		
		Scanner read = new Scanner(file);

		

		
		
		Scanner reqs = new Scanner(System.in);
		String req="";
		while (!req.equals("q")) {
			
			System.out.println("kayıt olmak icin 1");
			System.out.println("giris yapmak icin  2");
			System.out.println("kullanicilari gor 3");
			
			req = reqs.next();
			
			if (req.equals("1")) {
				fw = new FileWriter(file,true); //
				BufferedWriter bw = new BufferedWriter(fw);
				
				System.out.println("kullanici adi giriniz: ");
				String name = reqs.next();
				System.out.println("sifre girin: \n");
				String passwd = reqs.next();
				System.out.println("sifre tekrar girin: \n");
				String passwd2 = reqs.next();
				
				if (!passwd.equals(passwd2)) {
					System.out.println("sifreler eslemiyo \n");
					continue;
				} 
				
				bw.write(OdevCode(name)+";"+OdevCode(passwd)+"\n");
				
				bw.close();
			}
			
			if (req.equals("2")) {
				
				
				System.out.println("kullanici adi giriniz: ");
				String name = reqs.next();
				System.out.println("sifre giriniz: ");
				String passwd = reqs.next();
				
				while (read.hasNextLine()) {
					String Line = read.nextLine();
					String[] split = Line.split(";");
					if (split[0].equals(OdevCode(name)) && split[1].equals(OdevCode(passwd))) {
						System.out.println("giris basarili \n");
						System.out.println("burda bir takim islemler \n");
					} 
				}
				
				System.out.println("basarisiz giris \n");
				
				
			}
			
			if (req.equals("3")) {
				System.out.println("kullanicilar: \n");
				Scanner rd = new Scanner(file);
				while (rd.hasNextLine()) {
					String Line = rd.nextLine();
					String[] split = Line.split(";");
					System.out.println(OdevDecode(split[0])+" "+OdevDecode(split[1]));
				}
				
			}
		}
		
		
		
	}


}

package YX_LAB10;

import java.io.FileNotFoundException;

public class Main {
	
	public static void main(String[] args) throws FileNotFoundException  {
		// TODO Auto-generated method stub
		
		String name = "Sakız";
		char[] s = name.toCharArray();
		for (int i=0;i<s.length;i++) 
			s[i] = (char) (s[i]+1);

  }

}

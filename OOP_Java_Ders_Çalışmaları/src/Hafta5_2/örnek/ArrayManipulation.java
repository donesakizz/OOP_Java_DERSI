package Hafta5_2.örnek;

import java.util.Arrays;

public class ArrayManipulation {
	

	public static void main(String[] args) {
		
		
	//ORN 1	
		
	double[]doubleArray= {8.4,9.3,0.2,7.9,3.4};
	Arrays.sort(doubleArray);
	System.out.println("%n doubleArray :");
		
	for (double value:doubleArray ) {
	System.out.printf("%1f",value);
}
		int[] filledIntArray = new int[10];
		Arrays.fill(filledIntArray,7);
		displayArray(filledIntArray,"filledIntArray,");
		
		//ORN2
		
		int[] intArray = {1,2,3,4,5,6};
		int[] intArrayCopy = new int[intArray.length];
		System.arraycopy (intArray, 0,intArrayCopy, 0,intArray.length);  //ikisininde 0. indeksinden baslayarak birbirine kopyala
		displayArray(intArray,"intArray");
		displayArray(intArrayCopy,"intArrayCopy");

		boolean b=Arrays.equals(intArray,intArrayCopy);
		System.out.printf("%n%n intArray %s intArrayCopy %n",(b ? "==" : "!=")); //bu özel bir islemdir
		
		//ORN3 binary fonk kullanarak array icindeki neyi bulduguna bak
		
		
		
		
		
		
	}
	public static void displayArray(int[] array, String description)
	{
		System.out.printf("%n%s:" ,description);
		for(int value: array) {
			System.out.printf("%d",value);
		}
	}


}

package Hafta6;

import java.util.LinkedList;

public class LinkedListe {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	   LinkedList<String> cars = new LinkedList<String>();
		
		cars.add("Volvo");
		cars.add("Mercedes");
		cars.add("BMW");
		cars.add("Mazda");
		cars.add(1,"Fiat");//bu sekilde de ekleme yapılabilir.1.indeks ikinci elemana karsilik gelir.
		System.out.println(cars);

	}

}

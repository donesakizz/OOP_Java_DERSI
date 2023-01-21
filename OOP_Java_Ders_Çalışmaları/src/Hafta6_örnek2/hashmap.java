package Hafta6_örnek2;

import java.util.Iterator;
import java.util.LinkedList;

public class hashmap {
	
public static void main(String[] args) {

		
		//ORN 1:
	/*	HashMap<String,Integer> people = new HashMap<String,Integer>();
		people.put("Ahmet",32);
		people.put("Mehmet", 40);
		people.put("Ali", 25);
		for(String i:people.keySet()) {
			System.out.println("key: " + i + " Value " + people.get(i) );
		}*/
		
		
		//ORN 2:
	/*	LinkedList<String> cars= new LinkedList<String>();
		cars.add("volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		cars.add("BMW");  //iki bmw nin hashcode ları farklıdır
		cars.add(1,"Fiat");
		System.out.println(cars.get(0).hashCode());//volvo degiskeninin hashCode() u
		System.out.println(cars.get(1).hashCode());
		String a= cars.get(1);//1. indeksteki degiskenin hashcode u bu sekilde de yazılabilir
		System.out.println(a.hashCode());
		if(a=="BMW") //adresler ayni mi diye kontrol eder
			System.out.println("esitlik saglandi");
		else if(a.equals(cars.get(1))) // degisken degerleri yani icerikleri ayni öi diye kontrol eder.
			System.out.println("equals saglandi");
		else
			System.out.println("esitlik saglanamadi");
		
		
		
		if(a=="Fiat") //adresler ayni mi diye kontrol eder
			System.out.println("esitlik saglandi");
		else if(a.equals(cars.get(1))) // degisken degerleri yani icerikleri ayni öi diye kontrol eder.
			System.out.println("equals saglandi");
		else
			System.out.println("esitlik saglanamadi");
		
		
		String b="Fiat";
		if(a==b) //adresler ayni mi diye kontrol eder
			System.out.println("esitlik saglandi");
		else if(a.equals(cars.get(1))) // degisken degerleri yani icerikleri ayni öi diye kontrol eder.
			System.out.println("equals saglandi");
		else
			System.out.println("esitlik saglanamadi");
		
		
		if(a=="BMW") //adresler ayni mi diye kontrol eder
			System.out.println("esitlik saglandi");
		else if(b.equals(cars.get(1))) // degisken degerleri yani icerikleri ayni öi diye kontrol eder.
			System.out.println("equals saglandi");
		else
			System.out.println("esitlik saglanamadi");*/
		
		
		
		//ORN 3:
		
		Double a=5.0;
		Character c='A';
		
		LinkedList<String> cars= new LinkedList<String>();
		cars.add("volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		cars.add("BMW");  //iki bmw nin hashcode ları farklıdır
		cars.add(1,"Fiat");
		Iterator<String> it = cars.iterator();
		System.out.println(it.next());
		
		//iteratorde her next dediğimizde bir indeks kaydırır.
		
		/*System.out.println(it.next());
		System.out.println(it.next());
		
		System.out.println(it.hasNext());//sonrasında bir eleman var mı onu kontrol eder boolean deger dondurur
		
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());/*/  //degislkenler bu sekilde bastırılır
	/*	6 elemanı bastırdıktan sonra System.out.println(it.hasNext()); yaparsan
		error verir çunku bu elemandan sonra eleman yok*/
		
	
		
		
		/*System.out.println(it.hasNext());
		it.next();
		System.out.println(it.hasNext());
		it.next();
		System.out.println(it.hasNext());
		it.next();
		System.out.println(it.hasNext());
		it.next();
		System.out.println(it.hasNext());
		it.next();
		System.out.println(it.hasNext());
		it.next();
		System.out.println(it.hasNext());*/    // bu blok ful boolean deger dondurur
		
		
		System.out.println(a.doubleValue());
		System.out.println(c.charValue());
		
		
		
		
		
	}

}

package datastructure;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Iterator;
public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */
		int[] a = new int[5];
		ArrayList<String> cars = new ArrayList<String>();
		System.out.println("Size of ArrayList at creation: " + cars.size());
		//Adding to the ArrayList
		cars.add("Acura");
		cars.add("Audi");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Hyundai");
		System.out.println("Size of ArrayList after adding elements: " + cars.size());
		System.out.println("List of elements: " + cars);
		//Removing from ArrayList
		cars.remove(0);
		System.out.println("Size of arrayList after removing an element: " + cars.size());
		System.out.println("List after removing an element " + cars);
		//Again adding
		cars.add("Volvo");
		System.out.println("Size of arrayList after adding an element: " + cars.size());
		System.out.println("List after adding an element: " + cars);
		//Retrieving an element of the ArrayLIst
		System.out.println("Retrieved an ArrayList element: " + cars.get(2));

		for(String i:cars){
			System.out.println(i);
		}
		System.out.println("\nIterator:");
		Iterator<String> iterator = cars.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}

	}
}


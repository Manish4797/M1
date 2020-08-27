package day10_2;

import java.util.*;

public class Collection101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Array?
		//Colelction
		//size dyanmic;
		
		//ArrayList
		//indexing
		//duplicate
		//insertion order
		
//		ArrayList<String>  list = new ArrayList<>();
//		list.add("Kajal");
//		list.add("Manish");
//		list.add("Monika");
//		list.add("Sagar");
//		list.add("Prabesh");
//		list.add("Prabesh");
//		
//		//list.
//		
//		System.out.println(list);
//		
//		System.out.println(list.get(5));
//		
		
		
		//HashSet
		//indexing gardaina -->  " Hashing " hash table? // random data store;
		//insertion order miantain gardaina
		//uniqu huna parxa;
		
//		
//		HashSet<String> set= new HashSet<>();
//		set.add("Kajal");
//		set.add("Manish");
//		set.add("Monika");
//		set.add("Sagar");
//		set.add("Prabesh");
//		set.add("Prabesh");
//		
//		System.out.println(set);
//		System.out.println("*****");
//		//for loop
//			//index compulsary
//		
//		//for each loop
//		for(String data : set) {
//			System.out.println(data );
//		}
		
	
		//HashMap
		//Key value
		
		
		//key uniyqe, 
		HashMap<Integer, String>  students = new HashMap<>();
		
		students.put(1, "Apple");

		students.put(2, "Banana");

		students.put(3, "CAt");

		students.put(4, "Dog");
		
		
	//	System.out.println(students);
//		
//		
//		System.out.println(students.get(3));
		
		System.out.println(students.entrySet());
		
		for(Map.Entry m : students.entrySet()) {
			
			System.out.println("Key Value pair in hash Map: " + m);
			System.out.println(m.getKey());
			
			System.out.println(m.getValue());
			System.out.println("-------");
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}

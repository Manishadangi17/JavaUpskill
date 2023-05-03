package com.collectionList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;


public class ArrayListDescendingDemo {
	 public static void main(String[] args) {
	        ArrayList<Integer> numbers = new ArrayList<>();
	        numbers.add(5);
	        numbers.add(2);
	        numbers.add(8);
	        numbers.add(1);
	        numbers.add(3);
	        numbers.add(3);
	        numbers.add(3);
	        
	        Collections.sort(numbers,Comparator.reverseOrder());
	        System.out.println("ArrayList in descending order: " + numbers);
	        
	        HashSet<Integer>removeDuplicate = new HashSet<>(numbers);
	        
	        numbers.clear();
	        numbers.addAll(removeDuplicate);
			 System.out.println("LinkedList without duplicates: " + numbers);

}
}

package com.collectionList;
import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;

public class ArrayListAscendingDemo {
	 public static void main(String[] args) {
	        ArrayList<Integer> numbers = new ArrayList<>();
	        numbers.add(5);
	        numbers.add(2);
	        numbers.add(8);
	        numbers.add(1);
	        numbers.add(3);
	        
	        Collections.sort(numbers);
	        System.out.println(numbers);
	        
	        numbers.add(3);
	        System.out.println(numbers);
	        
	        

}
}
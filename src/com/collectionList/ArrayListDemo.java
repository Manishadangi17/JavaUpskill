package com.collectionList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(12);
		list.add(23);
		list.add(44);
		list.add(33);
		list.add(43);
		list.add(44);
		list.add(33);
		list.add(44);  // allow in duplicate on list
		//System.out.println(Arrays.asList());
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
		//Collections.synchronizedlist();//ArrayList is not thread-safe
		System.out.println(list.isEmpty());
		System.out.println(list.remove(2));
		System.out.println(list.containsAll(list));
		System.out.println(list.contains(11));
		//System.out.println(list.lastIndexOf(list));
		System.out.println(list.size());
		System.out.println(list.get(0));
		System.out.println(list.hashCode());
		
		// Remove duplicate in list help with SetInterfcae
		
		 HashSet<Integer>removeDuplicate = new HashSet<>(list);
		 
		 list.clear();
		 list.addAll(removeDuplicate);
		 System.out.println("ArrayList without duplicates: " + list);
	}

}

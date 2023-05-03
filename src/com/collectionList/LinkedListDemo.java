package com.collectionList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<Integer> linklist = new LinkedList<>();
		linklist.add(12);
		linklist.add(92);
		linklist.add(32);
		linklist.add(42);
		linklist.add(62);
		linklist.add(82);
		System.out.println(linklist);
		
		//List.copyOf(linklist);
		
		linklist.remove(2);
		System.out.println(linklist);
		
		for(int i=0; i<linklist.size();i++){
			System.out.print(linklist.get(i) + " ");
			
			//Iterator<Integer> iterator = linklist.descendingIterator();
			
//			while(iterator.hasNext()) {
//				System.out.println(iterator.next());
//			}
			
		}
	}

}

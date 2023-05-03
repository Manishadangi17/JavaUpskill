package com.collectionList;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
        Stack<String> stk = new Stack<>();

        
        stk.push("Java");
        stk.push("Python");
        stk.push("C++");
        stk.push("Advance Java");
        stk.push("Code Python");
        stk.push("C");
        
        System.out.println("Stack: " + stk);
        
        String topElement = stk.pop();
        System.out.println("Popped element: " + topElement);
        
        String peekElement = stk.peek();
        System.out.println("Peeked element: " + peekElement);
        
        boolean isEmpty = stk.isEmpty();
        System.out.println("Is stack empty? " + isEmpty);
        
        int size = stk.size();
        System.out.println("Size of the stack: " + size);

}
}
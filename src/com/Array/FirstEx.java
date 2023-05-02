package com.Array;

import java.util.Arrays;
import java.util.Scanner;

public class FirstEx {
	static int i=4;


	public static void main(String[] args) {
		System.out.println(i);
	Scanner sc= new Scanner(System.in);
	System.out.print("Enter array");
	int num  = sc.nextInt();
	int arr[]= new int[num];
	
//	for taking array input values
	for(int i=0;  i<num ; i++) {
		arr[i] = sc.nextInt();
		
	}
	}
}

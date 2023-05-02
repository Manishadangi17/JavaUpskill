package com.Array;

import java.util.Arrays;
import java.util.Scanner;

public class FirstEx {
	static int i=4;
//	public static void main(String[] args) {
//		Scanner sc= new Scanner(System.in);
//		System.out.print("Enter num");
//		int n = sc.nextInt();
//		int arr[] = new int [10];
//		for(int i =0; i<10;i++) {
//			arr[i]=n*(i+1);
//			
//		
//			System.out.println(arr[i]);
//		}
//		//stem.out.println(Arrays.toString(arr));
//		
//	}

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
//	find number of duplicate elements
//	for(int i=0; i<num;i++) {
//		for(int j=i+1; j<num; j++) {
//			if(arr[i]==arr[j]) {
//				System.out.println(arr[i]);
//				break;
//			}
//			
//		}
	//}
	
	
	
	
//	for printing array
	for(int i = 0; i<num; i++) {
		System.out.print(arr[i]+" ,");
	}
}
	
	public static void fake() {
		static n =97;
		i =2;
		i++;
		i++;
		
	}
}
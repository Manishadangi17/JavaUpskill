//package OOPsConcept;
//
//import java.util.Scanner;
//
////public class Test {
////
////	public static void main(String[] args) {
////		// TODO Auto-generated method stub
////		MathsClass md = new MathsClass("Manisha", 66, 999999);
////		md.setPassword(323273, "Manisha");
//////		System.out.println(md.password);
////
////	}
////
////}
//
////public class Test{
////	public static void main(String args[]) {
////		Scanner sc=new Scanner (System.in);
////		 String str1 = sc.nextLine();
//////		 System.out.println(str1.length());
////		 String count;
////		 for(int i=str1.length()-1; i>=0; i--) {
////			 System.out.println(str1.charAt(i));
////		 }
////	}
////	
////	
////}
//
////public class Test {
////	public static void main(String args[]) {
////		Scanner sc=new Scanner (System.in);
////		 System.out.println("Enter your String");
////		 String str1 = sc.nextLine();
////		
////		 for(int i =str1.length();i<=0;i++) {
////			 for(int j =str1.length()+1;j<=i;j++) {
////				 System.out.print(str1.repeat(str1.length()));
////				 
////			 }
////			 
////		 }
////		class  Test {
////
////			public static void main(String args[]) {
////			Scaler s = new Scaler(5);
////			}
////			}
////			class Main2{
////			Main2(){
////			System.out.println(" Welcome to Main2 ");
////			}
////		
////			}
////			class Scaler extends Main2{
////			Scaler(){
////				
////			System.out.println(" Welcome to Scaler  ");
////			}
////			Scaler(int x){
////			this();
////			//super();
////			System.out.println(" Welcome to Scaler 2");
////}
////			}
////	
//////}
//////}
//
//public class Test {
//	public static void main(String args[]) {
//		int n, i, j, space = 1;
//		System.out.print("Enter the number of rows: ");
//		Scanner s = new Scanner(System.in);
//		n = s.nextInt();
//		space = n - 1;
//		for (j = 1; j <= n; j++) {
//			for (i = 1; i <= space; i++) {
//				System.out.print(" ");
//			}
//			space--;
//			for (i = 1; i <= 2 * j - 1; i++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
//		space = 1;
//		for (j = 1; j <= n - 1; j++) {
//			for (i = 1; i <= space; i++) {
//				System.out.print(" ");
//			}
//			space++;
//			for (i = 1; i <= 2 * (n - j) - 1; i++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
//	}
//}


package OOPsConcept;

import java.util.Scanner;
public class Test {
	
public static void main(String args[]) {
	try {
		int a = 6;
		int b = 0;
		System.out.println(a/b);
		
	}
	catch(ArithmeticException f) {
		System.out.println(f.getMessage());
	}
	catch(Exception e) {
		System.out.println(e.getMessage());
	}
	
	finally {
		System.out.println("dina");
	}
	
	
	
	
}
}

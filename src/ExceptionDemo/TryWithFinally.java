package ExceptionDemo;

public class TryWithFinally {

	 public static int method()  {
		 try {
			 System.out.println("First block");
			 int a =10;
			 int b=2;
			 int c= a/b;
			 System.out.println(c);
			 return 10;
		 }
		 catch(ArithmeticException e ) {
			 System.out.println("Denominator cannot be zero");
		 }
		 
		 finally{
			 System.out.println("Finally last");
		
			 
		 }
		 return 0;
	 }
		 public static void main(String args[]) {
			 System.out.println(method());
		 }
		
	

}

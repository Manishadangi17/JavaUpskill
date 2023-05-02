package ExceptionDemo;

public class ThridDemo {
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

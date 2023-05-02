package ExceptionDemo;

public class ExitDemo {
	public static void main(String arsg[]) {
		try {
			int a = 1/0;
			System.out.println("Try run");
			
		}
		catch(Exception e){
			System.out.println("Catch run");
			System.exit(1000);
		}
		finally{
			
			System.out.println("Always run");
		}
		
	}

}

//class Man extends Exception{
//	public Man(String msg){
//		super(msg);
//		
//	}
//}

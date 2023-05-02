package Anonymous;


public class InnerClass {
	
	
	static class InnerDog{
		
		public void show() {
			System.out.println("abc");
		}
		
		
	}
	
	
	public static void main(String arsg[]){
		System.out.println("aaaaaa");
		
		InnerDog dog= new InnerDog();
		dog.show();
		
		
	}

}

package Anonymous;
abstract class Dog{
	public abstract void show(); 
	
}

public class AbstractAnonymousInnerClass {
	public static void main(String args[]) {
		Dog dog =  new Dog() {
			public void show() {
				System.out.println("Abstract clsss of inner class");
			}
		};
		dog.show();
		
	}
	
	

}

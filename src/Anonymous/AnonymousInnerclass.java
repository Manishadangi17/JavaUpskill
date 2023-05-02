package Anonymous;

class A{
	public void show() {
		System.out.println("Outer class");
	}
}

public class AnonymousInnerclass {
	public static void main(String args[]) {
		A obj = new A() 
		{
			@Override
			public void show() {
				System.out.println("inner class");
			}
			
		};
		obj.show();
	}

}

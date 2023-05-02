package FunctinalInterface;

interface A  {
	void show();
	
}
//class man implements A{
//	public void show() {
//		System.out.println("Class b ");
//	}
//}
public class FunInterfaceDemo {
	public static void main(String[] args) {
		A a = new A() {
			public void show() {
				System.out.print(" Annonumes Inner Class");
			}
		};
		a.show();
	}

}

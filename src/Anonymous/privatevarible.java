package Anonymous;
class A{
	private int  a = 2;
	private int b = 2;
	public void main() {
		
	}
	class B{
		public void show() {
			int c = a+b;
			System.out.println(c);
			
		}
		
	}
	public static B B() {
		// TODO Auto-generated method stub
		return null;
	}
}


public class privatevarible {
	public static void main(String[] args) {
		Anonymous.A.B ab = A.B();
		ab.show();
		
	}

}

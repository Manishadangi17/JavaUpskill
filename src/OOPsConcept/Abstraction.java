package OOPsConcept;

public abstract class Abstraction {

	public abstract void doWork();
	
	public void walk() {
		System.out.println("Im walking");
	}
}

class Manisha extends Abstraction{
	
	public void doWork() {
		System.out.println("I'm doing work");
	}
	public static void main(String[] dsp) {
		Manisha m = new Manisha();
		m.doWork();
	}
	
}

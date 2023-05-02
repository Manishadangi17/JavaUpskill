package Anonymous;
enum status{
	jan,feb,march;
}
public class Enum {
	public static void main(String[] args) {
		status [] ss = status.values();
		//System.out.println(s.ordinal());
		for(status s : ss) {
			System.out.println(s + " : " + s.ordinal());
		}
		
	}

}

package SecondDay;

public class StringMethodsDemo {
	public  static void main(String args[]) {
		String str = "I am learning java";
		String str1 = "JAVA";
		String str2 = "learning";
		String str3 = "java";
			System.out.println("After Concat:" +str.concat(" React "));
			System.out.println("Char at index 2(third position): " + str.charAt(4));
			System.out.println("After Concat:" +str.indexOf(str1, 1));
			System.out.println("Checking equals ignoring:" +str.equalsIgnoreCase(str1));
			System.out.println(" Converting to lower case" + str.toLowerCase());
			System.out.println("Converting to upper case " + str.toUpperCase());
			System.out.println("searching s1 in targetString: " + str.contains(str1));
			System.out.println("searching s2 in targetString: " + str.contains(str2));
			System.out.println("Triming string: " + str3.trim());
			System.out.println("Checking equals with case: " +str2.equals(str1));
			System.out.println("Checking Length: "+ str.length());
			System.out.println("Replace function: "+ str.replace("java", "JAVA"));

		
	}

}

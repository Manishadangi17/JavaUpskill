package OOPsConcept;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Person {
	private String name;
	private int age;
	private String gender;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(String name, int age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	 public boolean isEligibleToVote()  {
		 return age >= 18;
	}

}

public class EligibleforVote {
	public static void main(String args[]) {
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		System.out.print(num);
		
		List<Person> persons = new ArrayList<>();
		    persons.add(new Person("Alice", 25, "Female"));
	        persons.add(new Person("Bob", 17, "Male"));
	        persons.add(new Person("Charlie", 30, "Male"));
	        persons.add(new Person("Dave", 16, "Male"));
	        persons.add(new Person("Eve", 20, "Female"));
	        persons.add(new Person("Frank", 19, "Male"));
	        persons.add(new Person("Grace", 22, "Female"));
	        persons.add(new Person("Harry", 28, "Male"));
	        persons.add(new Person("Isabel", 18, "Female"));
	        persons.add(new Person("Jack", 15, "Male"));
	        
	        System.out.println("Names of those who are eligible to vote:");
	        for (Person person : persons) {
	            if (person.isEligibleToVote()) {
	                System.out.println(person.getName());
	            }
	        }

//		Person person = new Person();
//
//		person.Man();

	}

}

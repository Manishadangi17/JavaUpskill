package OOPsConcept;
import java.util.ArrayList;
import java.util.List;
class Student{
	private String name;
	private int roll_no;
	private int[] marks;
	public Student(String name, int roll_no, int[] marks) {
		
		super();
		this.name = name;
		this.roll_no = roll_no;
		this.marks = marks;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}
	public int[] getMarks() {
		return marks;
	}
	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	 public double getPercentage() {
	        int totalMarks = 0;
	        for (int mark : marks) {
	            totalMarks += mark;
	        }
	        double percentage = (double) totalMarks / marks.length;
	        return percentage;
	    }
	}


public class StudentPercentage {
	 public static void main(String[] args) {
	        List<Student> students = new ArrayList<>();
	        students.add(new Student("Alice", 101, new int[]{80, 90, 85}));
	        students.add(new Student("Bob", 102, new int[]{70, 80, 75}));
	        students.add(new Student("Charlie", 103, new int[]{90, 95, 92}));
	        students.add(new Student("David", 104, new int[]{60, 70, 65}));
	        students.add(new Student("Emma", 105, new int[]{85, 90, 87}));

	        for (Student student : students) {
	            System.out.println(student.getName() + ": " + student.getPercentage());
	        }
	    }
}

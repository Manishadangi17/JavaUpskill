package OOPsConcept;
import java.util.ArrayList;
import java.util.List;
class Animal {
	
    private String name;
    private String type;
	public Animal(String name, String type) {
		super();
		this.name = name;
		this.type = type;
		
	}
	public Animal() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	 public boolean isDomestic() {
	        if (type.equalsIgnoreCase("dog") || type.equalsIgnoreCase("cat") || type.equalsIgnoreCase("cow") || type.equalsIgnoreCase("sheep")) {
	            return true;
	        } else {
	            return false;
	        }
	    }
    
    
}

public class AnimalDemo {
	 public static void main(String[] args) {
	        List<Animal> animals = new ArrayList<>();
	        animals.add(new Animal("Max", "Dog"));
	        animals.add(new Animal("Mittens", "Cat"));
	        animals.add(new Animal("Bessie", "Cow"));
	        animals.add(new Animal("Dolly", "Sheep"));
	        animals.add(new Animal("Lion", "Wild"));
	        

	        System.out.println("List of Domestic Animals:");
	        for (Animal animal : animals) {
	            if (animal.isDomestic()) {
	                System.out.println(animal.getName());
	            }
	        }
	    }
	
}

package OOPsConcept;

import java.util.ArrayList;
import java.util.List;

class Car {
    private String make;
    private String model;
    private int year;
	public Car(String make, String model, int year) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
    
    
    
}
public class CarModelProperties {
	
	public static void main(String[] args) {
        // create a list of 5 cars
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Toyota", "Corolla", 2010));
        cars.add(new Car("Honda", "Civic", 2015));
        cars.add(new Car("Ford", "Mustang", 2018));
        cars.add(new Car("Chevrolet", "Impala", 2013));
        cars.add(new Car("BMW", "X5", 2019));
        
        System.out.println("Car Details:");
        for(Car car : cars) {
        	System.out.println("Make: " + car.getMake());
            System.out.println("Model: " + car.getModel());
            System.out.println("Year: " + car.getYear());
            System.out.println();
        	
        }

}
}

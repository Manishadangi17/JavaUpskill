package OOPsConcept;

import java.util.ArrayList;
import java.util.List;

class Product{
	private String name;
    private double price;
    private int quantity;
	public Product(String name, double price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
    
	 public double getTotalCost() {
	        return price * quantity;
	    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	 
}
public class ProductTotalCost {
	public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 800.00, 2));
        products.add(new Product("Phone", 400.00, 3));
        products.add(new Product("Headphones", 50.00, 4));
        products.add(new Product("Tablet", 300.00, 1));
        products.add(new Product("Keyboard", 25.00, 5));
        
        double totalCost = 0.0;
        for( Product  product : products) {
        	totalCost += product.getTotalCost();
        	
        }
        System.out.println("Total cost of all products: " + totalCost);

}
}

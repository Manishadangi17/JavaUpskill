package OOPsConcept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

class Shape{
	private String type;
	private String color;
	public Shape(String type, String color) {
		super();
		this.type = type;
		this.color = color;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
}

public class ShapeDemo {
	 public static void main(String[] args) {
	        List<Shape> shapes = new ArrayList<>();
	        shapes.add(new Shape("circle", "red"));
	        shapes.add(new Shape("triangle", "green"));
	        shapes.add(new Shape("rectangle", "blue"));
	        shapes.add(new Shape("circle", "yellow"));
	        shapes.add(new Shape("triangle", "red"));

	        Map<Shape, Long> counts = shapes.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));
	        System.out.println(counts);
	        for (Shape keys : counts.keySet())  
	        {
	           System.out.println(keys + ":"+ counts.get(keys));
	        }
}
}


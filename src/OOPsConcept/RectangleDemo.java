package OOPsConcept;
import java.util.ArrayList;
import java.util.List;
class Rectangle {
    private double length;
    private double breadth;
	public Rectangle(double length, double breadth) {
		
		super();
		this.length = length;
		this.breadth = breadth;
	}
	public Rectangle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getBreadth() {
		return breadth;
	}
	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}
    
	public double getPerimeter() {
        return 2 * (length + breadth);
    }
	public int getArea() {
		// TODO Auto-generated method stub
		return 0;
	}
}
public class RectangleDemo {
	public static void main(String[] args) {
        List<Rectangle> rectangles = new ArrayList<>();
        rectangles.add(new Rectangle(5, 6));
        rectangles.add(new Rectangle(10, 4));
        rectangles.add(new Rectangle(7, 8));
        rectangles.add(new Rectangle(9, 2));
        rectangles.add(new Rectangle(3, 12));
        

        Rectangle maxAreaRectangle = rectangles.get(0);
        for (int i = 1; i < rectangles.size(); i++) {
            if (rectangles.get(i).getArea() > maxAreaRectangle.getArea()) {
                maxAreaRectangle = rectangles.get(i);
            }
        }

        System.out.println("Rectangle with the largest area:");
        System.out.println("Length: " + maxAreaRectangle.getLength());
        System.out.println("Breadth: " + maxAreaRectangle.getBreadth());
        System.out.println("Area: " + maxAreaRectangle.getArea());
        System.out.println("Perimeter: " + maxAreaRectangle.getPerimeter());
    }

}

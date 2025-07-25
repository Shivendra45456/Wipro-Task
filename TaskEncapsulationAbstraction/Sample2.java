package TaskEncapsulationAbstraction;


abstract class Shape{
	abstract double area();
}

class Circle extends Shape{

	double radius;

    Circle(double radius) {
        this.radius = radius;
    }
	
	double area() {
        return Math.PI * radius * radius;
    }
	
}

class Rectangle extends Shape{
	
	double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

	
	double area() {
        return length * width;
    }
	
}
public class Sample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    Shape s1 = new Circle(5);
	        Shape s2 = new Rectangle(4, 6);

	        System.out.println("Area of Circle: " + s1.area());
	        System.out.println("Area of Rectangle: " + s2.area());
	}

}


//Task 4: Abstract Class - Shape
// Abstract class: Shape
// Abstract method: double area()
// Derived classes: Circle, Rectangle
// Calculate and print area for each.
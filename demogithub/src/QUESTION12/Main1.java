package QUESTION12;

public class Main1 {
	
	    public static void main(String[] args) {
	        // Create objects of Circle and Triangle
	        Circle circle = new Circle(5);
	        Triangle triangle = new Triangle(3, 4, 5);

	        // Calculate and print area and perimeter of circle
	        System.out.println("Circle:");
	        System.out.println("Area: " + circle.calculateArea());
	        System.out.println("Perimeter: " + circle.calculatePerimeter());

	        // Calculate and print area and perimeter of triangle
	        System.out.println("\nTriangle:");
	        System.out.println("Area: " + triangle.calculateArea());
	        System.out.println("Perimeter: " + triangle.calculatePerimeter());
	    }
	}




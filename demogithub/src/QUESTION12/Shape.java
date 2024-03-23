package QUESTION12;


          abstract class Shape {
	    // Abstract methods
	    public abstract double calculateArea();
	    public abstract double calculatePerimeter();
	}

	class Circle extends Shape {
	    // Member variable
	    private double radius;

	    // Constructor
	    public Circle(double radius) {
	        this.radius = radius;
	    }

	    // Implement abstract method to calculate area
	    @Override
	    public double calculateArea() {
	        return Math.PI * radius * radius;
	    }

	    // Implement abstract method to calculate perimeter
	    @Override
	    public double calculatePerimeter() {
	        return 2 * Math.PI * radius;
	    }
	}

	class Triangle extends Shape {
	    // Member variables
	    private double side1;
	    private double side2;
	    private double side3;

	    // Constructor
	    public Triangle(double side1, double side2, double side3) {
	        this.side1 = side1;
	        this.side2 = side2;
	        this.side3 = side3;
	    }

	    // Implement abstract method to calculate area using Heron's formula
	    @Override
	    public double calculateArea() {
	        double s = (side1 + side2 + side3) / 2;
	        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	    }

	    // Implement abstract method to calculate perimeter
	    @Override
	    public double calculatePerimeter() {
	        return side1 + side2 + side3;
	    }
	}




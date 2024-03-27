abstract class Shape {
    public abstract double calculateArea(); // Corrected method name

    public void displayShape() {
        System.out.println("This is a Shape");
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() { 
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double length;
    private double breadth; 

    public Rectangle(double length, double breadth) { 
        this.length = length;
        this.breadth = breadth; 
    }

    public double calculateArea() { 
        return length * breadth;
    }
}

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(4.5);
        circle.displayShape();
        System.out.println("Area of circle: " + circle.calculateArea());

        Rectangle rectangle = new Rectangle(3.5, 6.7);
        rectangle.displayShape();
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
    }
}

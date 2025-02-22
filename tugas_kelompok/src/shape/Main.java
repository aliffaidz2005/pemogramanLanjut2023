// Kelas abstrak Shape
package shape;
abstract class Shape {
    // Metode abstrak untuk menghitung luas
    public abstract double calculateArea();

    // Metode abstrak untuk menghitung keliling
    public abstract double calculatePerimeter();
}

// Subkelas Rectangle
class Rectangle extends Shape {
    private double length;
    private double width;

    // Konstruktor untuk Rectangle
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

// Subkelas Circle
class Circle extends Shape {
    private double radius;

    // Konstruktor untuk Circle
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

// Subkelas Triangle
class Triangle extends Shape {
    private double base;
    private double height;
    private double side1;
    private double side2;
    private double side3;

    // Konstruktor untuk Triangle
    public Triangle(double base, double height, double side1, double side2, double side3) {
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }

    @Override
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }
}

// Kelas utama untuk menguji
public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5.0, 3.0);
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());

        Shape circle = new Circle(7.0);
        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Circle Perimeter: " + circle.calculatePerimeter());

        Shape triangle = new Triangle(6.0, 4.0, 3.0, 4.0, 5.0);
        System.out.println("Triangle Area: " + triangle.calculateArea());
        System.out.println("Triangle Perimeter: " + triangle.calculatePerimeter());
    }
}
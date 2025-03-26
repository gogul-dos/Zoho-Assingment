import java.util.*;

class Shape {
    protected double width, height;

    public Shape() {}

    public Shape(double width, double height) {
        this.width = width;
        this.height = height;
    }

    double area() {
        return 0;
    }

    double area(double width, double height) {
        return width * height;
    }

    double area(double side1, double side2, double side3) {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    double perimeter() {
        return 0;
    }

    double perimeter(double width, double height) {
        return 2 * (width + height);
    }

    double perimeter(double side1, double side2, double side3) {
        return side1 + side2 + side3;
    }
}

class Rectangle extends Shape {
    public Rectangle(double width, double height) {
        super(width, height);
    }

    double area() {
        return area(width, height);
    }

    double perimeter() {
        return perimeter(width, height);
    }
}

class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }
}

class Triangle extends Shape {
    private double side1, side2, side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    double area() {
        return area(side1, side2, side3);
    }

    double perimeter() {
        return perimeter(side1, side2, side3);
    }
}

public class Q1 {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(4, 6);
        System.out.println("Rectangle Area: " + rectangle.area());
        System.out.println("Rectangle Perimeter: " + rectangle.perimeter());

        Shape square = new Square(4);
        System.out.println("Square Area: " + square.area());
        System.out.println("Square Perimeter: " + square.perimeter());

        Shape triangle = new Triangle(3, 4, 5);
        System.out.println("Triangle Area: " + triangle.area());
        System.out.println("Triangle Perimeter: " + triangle.perimeter());
    }
}

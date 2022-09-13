
import java.util.Scanner;
abstract class pr1 {
    String color;
    boolean filled;
    // Date dateCreated;

    protected pr1() {
    }

    public pr1(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    // public Date getDateCreated() {
    //     return dateCreated;
    // }

    abstract public double getArea();

    abstract public double getPerimeter();
}

class Circle extends pr1 {
    double radius;

    public Circle() {
        radius = 0;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;

    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getDiameter() {
        return 2 * radius;
    }

    public double getArea() {
        return (radius * radius * 3.14);
    }

    public double getPerimeter() {
        return (2 * 3.14 * radius);
    }
}

class Rectangle extends pr1 {
    double width;
    double height;

    public Rectangle() {
        width = 0;
        height = 0;
    }

    public Rectangle(String color, boolean filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {

        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        return (height * width);
    }

    public double getPerimeter() {
        return (2 * (height + width));
    }
}

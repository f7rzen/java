package java.lab4_1;

public class Rectangle extends Shape{
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }

    @Override
    public String getType() {
        return "Rectangle";
    }

    @Override
    public String toString() {
        return "This is " + getType() + "\n" +
                "Area = " + getArea() +
                " Perimeter = " + getPerimeter();
    }
}

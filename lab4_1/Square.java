package java.lab4_1;

public class Square extends Shape{
    private double side;
    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side*side;
    }

    @Override
    public double getPerimeter() {
        return 2 * (side + side);
    }

    @Override
    public String getType() {
        return "Square";
    }

    @Override
    public String toString() {
        return "This is " + getType() + "\n" +
                "Area = " + getArea() +
                " Perimeter = " + getPerimeter();
    }
}

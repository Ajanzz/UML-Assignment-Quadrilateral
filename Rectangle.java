public class Rectangle extends Quadrilateral {
    public Rectangle(double length, double width) {
        super(length, width, length, width);
    }

    @Override
    public double calculateArea() {
        return side1 * side2;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (side1 + side2);
    }
}

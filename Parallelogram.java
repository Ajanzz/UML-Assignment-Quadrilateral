public class Parallelogram extends Quadrilateral {
    private double height;

    public Parallelogram(double base, double height, double side) {
        super(base, side, base, side);
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return side1 * height;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (side1 + side2);
    }
}

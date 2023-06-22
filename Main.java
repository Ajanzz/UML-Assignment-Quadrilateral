public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4, 5);
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());

        Parallelogram parallelogram = new Parallelogram(6, 8, 5);
        System.out.println("Parallelogram Area: " + parallelogram.calculateArea());
        System.out.println("Parallelogram Perimeter: " + parallelogram.calculatePerimeter());

        Square square = new Square(5);
        System.out.println("Square Area: " + square.calculateArea());
        System.out.println("Square Perimeter: " + square.calculatePerimeter());

        Rhombus rhombus = new Rhombus(6, 8);
        System.out.println("Rhombus Area: " + rhombus.calculateArea());
        System.out.println("Rhombus Perimeter: " + rhombus.calculatePerimeter());
    }
}

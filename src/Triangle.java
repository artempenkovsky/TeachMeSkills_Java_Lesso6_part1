public class Triangle extends Figure {

    private static final String NAME = "Triangle";

    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double getArea() {
        double p = (sideA + sideB + sideC) / 2; // полупериметр триугольника
        double area = Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC)); // формула Герона
        return area;
    }
    @Override
    public double getPerimeter() {
        double perimeter = sideA + sideB + sideC;
        return perimeter;
    }
    @Override
    public String getName() {
        return NAME;
    }
}
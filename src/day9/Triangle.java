package day9;

public class Triangle extends Figure {
    private int sideA;
    private int sideB;
    private int sideC;

    public Triangle(int sideA, int sideB, int sideC, String color) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double area() {
        return 0.5 * sideA * sideB;
    }

    @Override
    public double perimeter() {
        return sideA + sideB + sideC;
    }
}

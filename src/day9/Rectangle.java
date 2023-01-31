package day9;

public class Rectangle extends Figure {
    private int height;
    private int width;
    public Rectangle(int height, int width, String color) {
        super(color);
        this.height = height;
        this.width = width;
    }

    @Override
    public double area() {
        return height * width;
    }

    @Override
    public double perimeter() {
        return 2 * (height + width);
    }
}

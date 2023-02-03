package day9;

public class TestFigures {
    public static void main(String[] args) {
        Figure[] figures = {new Triangle(10, 10, 10, "Red"),
                new Triangle(10, 20, 30, "Green"),
                new Triangle(10, 20, 15, "Red"),
                new Rectangle(5, 10, "Red"),
                new Rectangle(40, 15, "Orange"),
                new Circle(4, "Red"),
                new Circle(10, "Red"),
                new Circle(5, "Blue")};

        System.out.println("Сумма периметров красных фигур равна: " + TestFigures.calculateRedPerimeter(figures));
        System.out.println("Сумма площадей красных фигур равна: " + TestFigures.calculateReadArea(figures));
    }

    public static double calculateRedPerimeter(Figure[] figures) {
        double perimeter = 0;
        for (Figure figure : figures) {
            if ("Red".equals(figure.getColor())) {
                perimeter += figure.perimeter();
            }
        }
        return perimeter;
    }

    public static double calculateReadArea(Figure[] figures) {
        double area = 0;
        for (Figure figure : figures) {
            if ("Red".equals(figure.getColor())) {
                area += figure.area();
            }
        }
        return area;
    }
}



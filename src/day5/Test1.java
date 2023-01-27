package day5;

public class Test1 {
    public static void main(String[] args) {
        Car lada = new Car();
        lada.setModel("приора");
        System.out.println("Модель автомобиля - " + lada.getModel());
        lada.setColor("чёрный");
        System.out.println("Цвет автомобиля - " + lada.getColor());
        lada.setReleaseYear(2010);
        System.out.println("Год выпуска автомобиля - " + lada.getReleaseYear());
    }
}

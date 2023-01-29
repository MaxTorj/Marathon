package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car(2020);
        car.info();
        System.out.println("Разница между переданым годом " +
                           "и годом выпуска автомобиля (лет): "
                           + car.yearDifference(2001));
    }
}

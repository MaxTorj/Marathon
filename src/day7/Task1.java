package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Boeing", 2005, 35, 40000);
        Airplane airplane2 = new Airplane("Su", 2019, 42, 45000);

        Airplane.compareAirplanes(airplane1, airplane2);
    }
}

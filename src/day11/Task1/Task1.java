package day11.Task1;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Picker picker = new Picker(warehouse);
        Courier courier = new Courier(warehouse);

        businessProcess(picker);
        businessProcess(courier);

        System.out.println("\n" + warehouse);
        System.out.println(picker);
        System.out.println(courier + "\n");

        Warehouse warehouse1 = new Warehouse();
        Picker picker1 = new Picker(warehouse);
        Courier courier1 = new Courier(warehouse);

        businessProcess(picker1);
        businessProcess(courier1);

        System.out.println(warehouse);
        System.out.println(picker1);
        System.out.println(courier1);
    }

    public static void businessProcess(Worker worker) {
        for (int i = 0; i < 10000; i++) {
            worker.doWork();
        }
        worker.bonus();
    }
}

package day11.Task1;

public class Picker implements Worker {
    private double salary;
    private boolean isPayed;
    private Warehouse warehouse;

    public double getSalary() {
        return salary;
    }

    public boolean getIsPayed() {
        return isPayed;
    }

    public String toString() {
        return "Сборщик заработал " + getSalary() + ". Премия получена? (true = да/false = нет): " + getIsPayed();
    }

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    @Override
    public void doWork() {
        salary += 80.00;
        warehouse.countPickedOrders();
    }

    @Override
    public void bonus() {
        if (isPayed) {
            System.out.println("Бонус сборщику уже был выплачен");
        } else if (warehouse.getCountPickedOrders() % 10000 == 0) {
            salary += 70000.00;
            isPayed = true;
        } else {
            System.out.println("Бонус сборщику еще не доступен");
            isPayed = false;
        }
    }
}
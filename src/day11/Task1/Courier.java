package day11.Task1;

public class Courier implements Worker {
    private double salary;
    private boolean isPayed;
    Warehouse warehouse;

    public double getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }

    public String toString() {
        return "Курьер заработал: " + getSalary() + ". Премия получена? (true = да/false = нет): " + isPayed;
    }

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    @Override
    public void doWork() {
        salary += 100.00;
        warehouse.countDeliveredOrders();
    }

    @Override
    public void bonus() {
        if (isPayed) {
            System.out.println("Бонус курьеру уже был выплачен");
        } else if (warehouse.getCountDeliveredOrders() % 10000 == 0) {
            salary += 50000.00;
            isPayed = true;
        } else {
            System.out.println("Бонус курьеру еще не доступен");
            isPayed = false;
        }
    }
}
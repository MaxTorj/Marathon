package day11.Task1;

public class Warehouse {
    private int countPickedOrders;  //поле - количество собраных заказов
    private int countDeliveredOrders; //поле - количество доставленых заказов

    public int getCountPickedOrders() {
        return countPickedOrders;
    }

    public int getCountDeliveredOrders() {
        return countDeliveredOrders;
    }

    public String toString() {
        return "Количество собраных заказов составляет: " + countPickedOrders + " " +
                "Количество доставленых заказов составляет: " + countDeliveredOrders;
    }

    public void countPickedOrders() {
        countPickedOrders++;
    }

    public void countDeliveredOrders() {
        countDeliveredOrders++;
    }
}

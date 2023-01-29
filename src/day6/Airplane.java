package day6;

public class Airplane {
    private String manufacturer;
    public int releaseYear;
    public int length;
    public int weight;
    public int fuelAmount = 0;
    public int n;

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setFuelAmount(int fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public int getFuelAmount() {
        return fuelAmount;
    }

    public Airplane(String manufacturer, int releaseYear, int length, int weight, int fuelAmount) {
        this.manufacturer = manufacturer;
        this.releaseYear = releaseYear;
        this.length = length;
        this.weight = weight;
        this.fuelAmount = fuelAmount;
    }

    void info() {
        System.out.println("Изготовитель " + manufacturer + " год выпуска " + releaseYear + "г." +
                           " длина " + length + " метров" + " вес " + weight + " тонн" +
                           " количество топлива в баке " + fuelAmount + " литров");
    }

    public void setN (int n) {
        this.n = n;
    }

    public int getN() {
        return n + fuelAmount;
    }
    void fillUp() {
        System.out.println("Самолет дозаправлен на " + getN() + " литров");
    }
}

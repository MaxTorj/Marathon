package day7;

public class Airplane {
    private String manufacturer;
    private int releaseYear;
    private int length;
    private int weight;
    private int fuelAmount;

    public Airplane(String manufacturer, int releaseYear, int length, int weight) {
        this.manufacturer = manufacturer;
        this.releaseYear = releaseYear;
        this.length = length;
        this.weight = weight;
        this.fuelAmount = 0;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setFuelAmount(int fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public int getFuelAmount() {
        return fuelAmount;
    }

    public void info() {
        System.out.println("Изготовитель: " + getManufacturer() + ", год выпуска: " + getReleaseYear() + "г." +
                           ", длина: " + getLength() + " метров" + ", вес: " + getWeight() + " тонн" +
                           ", количество топлива в баке: " + getFuelAmount() + " литров");
    }

    public void fillUp(int inputFuel) {
        fuelAmount += inputFuel;
    }

    public static void compareAirplanes(Airplane airplane1, Airplane airplane2) {
        if (airplane1.getLength() > airplane2.getLength()) {
            System.out.println(airplane1.getManufacturer() + " длиннее " + airplane2.getManufacturer());
        } else if (airplane2.getLength() > airplane1.getLength()) {
            System.out.println(airplane2.getManufacturer() + " длиннее " + airplane1.getManufacturer());
        } else {
            System.out.println("Длины самолетов равны");
        }
    }
}

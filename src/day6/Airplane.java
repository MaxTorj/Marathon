package day6;

public class Airplane {
    private String manufacturer;
    private int releaseYear;
    private int length;
    private int weight;
    private int fuelAmount;

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getFuelAmount() {
        return fuelAmount;
    }

    public void setFuelAmount(int fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public Airplane(String manufacturer, int releaseYear, int length, int weight) {
        this.manufacturer = manufacturer;
        this.releaseYear = releaseYear;
        this.length = length;
        this.weight = weight;
        this.fuelAmount = 0;
    }

    public void info() {
        System.out.println("Изготовитель: " + getManufacturer() + ", год выпуска: " + getReleaseYear() + "г." +
                           ", длина: " + getLength() + " метров" + ", вес: " + getWeight() + " тонн" +
                           ", количество топлива в баке: " + getFuelAmount() + " литров");
    }

    public void fillUp(int inputFuel) {
        fuelAmount += inputFuel;
    }


}

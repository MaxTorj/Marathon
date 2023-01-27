package day5;

class Motorbike {

    private String model;
    private String color;
    private int releaseYear;

    public Motorbike(String model, String color, int releaseYear) {
        this.model = model;
        this.color = color;
        this.releaseYear = releaseYear;

        System.out.println("Модель мотоцикла - " + getModel() +
                           ", цвет молоцикла - " + getColor() +
                           ", год выпуска мотоцикла - " + getReleaseYear());
    }

    public String getModel() {
        return model;
    }
    public String getColor() {
        return color;
    }
    public int getReleaseYear() {
        return releaseYear;
    }
}

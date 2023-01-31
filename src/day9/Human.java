package day9;

public class Human {
    private String name;

    public String getName() {
        return name;
    }

    public void printInfo() {
        System.out.println("Этот человек с именем " + getName());
    }
}

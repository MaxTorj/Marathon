package day11.Task2;

public class Warrior extends Hero {

    public Warrior() {
        physDef = 0.8;
        physAtt = 30;
    }

    public String toString() {
        return "Здоровье воина: " + health;
    }
}

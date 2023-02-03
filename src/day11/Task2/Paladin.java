package day11.Task2;

public class Paladin extends Hero implements Healer {
    private static final int PALADIN_PERSONAL_HEAL = 25;
    private static final int PALADIN_TEAMMATE_HEAL = 10;

    public Paladin() {
        physDef = 0.5;
        magicDef = 0.2;
        physAtt = 15;
    }
    @Override
    public void healHimself() {
        if (health + PALADIN_PERSONAL_HEAL > MAX_HEALTH) {
            health = MAX_HEALTH;
        } else {
            health += PALADIN_PERSONAL_HEAL;
        }
    }
    @Override
    public void healTeammate(Hero hero) {
        if (hero.health + PALADIN_TEAMMATE_HEAL > 100) {
            hero.health = MAX_HEALTH;
        } else {
            hero.health += PALADIN_TEAMMATE_HEAL;
        }
    }

    public String toString() {
        return "Здоровье паладина: " + health;
    }
}

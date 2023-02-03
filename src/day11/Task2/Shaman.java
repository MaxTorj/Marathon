package day11.Task2;

public class Shaman extends Hero implements Healer, MagicAttack {
    private static final int SHAMAN_PERSONAL_HEAL = 50;
    private static final int SHAMAN_TEAMMATE_HEAL = 30;
    private double magicAtt;
    public Shaman() {
        physAtt = 10;
        magicAtt = 15;
        physDef = 0.2;
        magicDef = 0.2;
    }

    @Override
    public void healHimself() {
        if (health + SHAMAN_PERSONAL_HEAL > MAX_HEALTH) {
            health = MAX_HEALTH;
        } else {
            health += SHAMAN_PERSONAL_HEAL;
        }
    }

    @Override
    public void healTeammate(Hero hero) {
        if (hero.health + SHAMAN_TEAMMATE_HEAL > MAX_HEALTH) {
            hero.health = MAX_HEALTH;
        } else {
            hero.health += SHAMAN_TEAMMATE_HEAL;
        }
    }

    @Override
    public void magicalAttack(Hero hero) {
        double shamanMagicDamageEffect = hero.health - magicAtt * (1 - magicDef);
        if (hero.health - shamanMagicDamageEffect < 0) {
            hero.health = MIN_HEALTH;
        } else {
            hero.health -= shamanMagicDamageEffect;
        }
    }

    public String toString() {
        return "Здоровье шамана: " + health;
    }
}

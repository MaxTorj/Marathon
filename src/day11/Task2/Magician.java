package day11.Task2;

public class Magician extends Hero implements MagicAttack {
    private double magicAtt;
    public Magician() {
        physAtt = 5;
        magicAtt = 20;
        magicDef = 0.8;
        physDef = 0;
    }
    @Override
    public void magicalAttack(Hero hero) {
        double magicianMagicDamageEffect = magicAtt * (1 - hero.magicDef);
        if (hero.health - magicianMagicDamageEffect < 0) {
            hero.health = MIN_HEALTH;
        } else {
            hero.health -= magicianMagicDamageEffect;
        }
    }

    public String toString() {
        return "Здоровье мага: " + health;
    }
}
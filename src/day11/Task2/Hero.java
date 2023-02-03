package day11.Task2;

public abstract class Hero implements PhysAttack {
    static final int MAX_HEALTH = 100;
    final static int MIN_HEALTH = 0;
    public double health;
    public double physAtt;
    public double magicDef;
    public double physDef;

    public Hero() {
        this.health = 100;
    }

    @Override
    public void physicalAttack(Hero hero) {
        double physDamageEffect = physAtt * (1 - hero.physDef);
        if (hero.health - physDamageEffect < MIN_HEALTH) {
            hero.health = MIN_HEALTH;
        } else {
            hero.health -= physDamageEffect;
        }
    }
}

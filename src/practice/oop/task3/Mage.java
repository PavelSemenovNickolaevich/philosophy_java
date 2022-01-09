package practice.oop.task3;

import practice.oop.task3.generic.MagicWeapon;

public class Mage<T extends MagicWeapon> extends Hero<T>{

    public Mage(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " attacks enemy " + enemy.getName());
        enemy.takeDamage(getDamage());
    }
}

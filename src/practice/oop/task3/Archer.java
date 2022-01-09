package practice.oop.task3;

import practice.oop.task3.generic.RangeWeapon;

import javax.sound.midi.Soundbank;

public class Archer<T extends RangeWeapon> extends Hero<T>{

    private Wolf wolf;

    public Archer(String name, int damage) {
        super(name, damage);
        this.wolf = new Wolf("Wolf", 7);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " attacks enemy " + enemy.getName());
      //  enemy.takeDamage(getDamage());
        wolf.attackEnemy(enemy);
    }

    class Wolf{

        private String name;
        private int damage;

        public Wolf(String name, int damage) {
            this.name = name;
            this.damage = damage;
        }

        public void attackEnemy(Enemy enemy) {
            System.out.println(name + " и " + Archer.this.getName() + " наносят совметсный урон");
            enemy.takeDamage(damage + Archer.this.getDamage());
        }
    }
}

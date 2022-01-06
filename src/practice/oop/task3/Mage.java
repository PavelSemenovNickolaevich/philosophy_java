package practice.oop.task3;

public class Mage extends Hero{

    public Mage(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " attacks enemy " + enemy.getName());
        enemy.takeDamage(getDamage());
    }
}

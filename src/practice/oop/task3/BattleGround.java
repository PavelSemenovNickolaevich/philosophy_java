package practice.oop.task3;

public class BattleGround {
    public static void main(String[] args) {

        Enemy enemy = new Enemy("Test", 100);
     //   Enemy enemy2 = new Enemy("Test2", 200);
        Enemy enemy1 = new Enemy("Test1", 200);

        Mage mage = new Mage("Mage", 15);
        Archer archer = new Archer("Archer", 20);
        Warrior warrior = new Warrior("Warrior", 40);

        mage.attackEnemy(enemy);
        System.out.println(enemy.isAlive());
        mage.attackEnemy(enemy);
        System.out.println(enemy.isAlive());
        mage.attackEnemy(enemy);
        System.out.println(enemy.isAlive());
        System.out.println("---------------------------------------------");

        warrior.attackEnemy(enemy1);
        archer.attackEnemy(enemy1);
        System.out.println(enemy1.isAlive());
    }
}

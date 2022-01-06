package practice.oop.task3;

public class TrainingGround {

    public static void main(String[] args) {


//        Hero hero = new Hero("Vasia");
//        hero.attackEnemy(enemy);

        Hero mage = new Mage("Mage", 5);
      //  mage.attackEnemy(enemy);

        Hero warrior = new Warrior("Warrior", 10);
       // warrior.attackEnemy(enemy);

        Hero archer = new Archer("Archer", 20);
     //   archer.attackEnemy(enemy);

        Enemy enemy = new Enemy("Zombie",100);

        attackEnemy(enemy, mage, warrior, archer);
    }

    public static void attackEnemy(Enemy enemy, Hero... heroes) {
        while (enemy.isAlive()) {
            for (Hero hero: heroes) {
                if(enemy.isAlive()) {
                    hero.attackEnemy(enemy);
                }
            }
        }
    }
}

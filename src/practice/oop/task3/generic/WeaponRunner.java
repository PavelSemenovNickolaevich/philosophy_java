package practice.oop.task3.generic;

import practice.oop.task3.Archer;
import practice.oop.task3.Hero;
import practice.oop.task3.Mage;
import practice.oop.task3.Warrior;

public class WeaponRunner {

    public static void main(String[] args) {

        Archer<Bow> archer = new Archer<>("Legolas", 10);
        archer.setWeapon(new Bow());

        Warrior<Sword> warrior = new Warrior<>("Boromir", 15);
        warrior.setWeapon(new Sword());

        Mage<Wand> mage = new Mage<>("Gandalf", 25);
        mage.setWeapon(new Wand());

        printWeaponDamage(archer);
        anotherPrintWeaponDamage(warrior);
        anotherSuperPrintWeaponDamage(mage);
    }

    public static <T extends Weapon> void printWeaponDamage(Hero<T> hero) {
        System.out.println(hero.getWeapon().getDamage());
    }

    public static void anotherPrintWeaponDamage(Hero<? extends Weapon> hero) {
        System.out.println(hero.getWeapon().getDamage());
    }

    public static void anotherSuperPrintWeaponDamage(Hero<? super Wand> hero) {
        System.out.println(hero.getWeapon().getDamage());
    }
}

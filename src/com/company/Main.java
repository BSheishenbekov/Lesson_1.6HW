package com.company;

public class Main {

    public static void main(String[] args) {

        Boss boss = new Boss();
        boss.setHealth(700);
        boss.setDamage(50);
        System.out.println(boss.info());
        Weapon weapon = new Weapon();
        boss.setWeapon(fireArms);

    }
}

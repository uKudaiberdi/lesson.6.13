package com.company;

import java.lang.reflect.Type;

public class Main {

    public static void main(String[] args) {
    Boss boss = new Boss();
    boss.setHealth(500);
    boss.setDamage(100);
        System.out.println("Boss health" + "  " +  boss.getHealth() + "   " + "Boss damage" + "   " +  boss.getDamage());
        boss.weapon1.setAxe("axe");
        System.out.println("Boss Weapon" + " " + boss.getWeapon());
    }
}

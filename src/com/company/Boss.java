package com.company.obj;

import java.util.Random;

public class Boss {
    int Health;
    int Damage;
    int DefenceTipy;

    public int getHealth() {
        return Health;
    }

    public void setHealth(int health) {
        Health = health;
    }

    public int getDamage() {
        return Damage;
    }

    public void setDamage(int damage) {
        Damage = damage;
    }

    public int getDefenceTipy() {
        return DefenceTipy;
    }

    public void setDefenceTipy(int defenceTipy) {
        DefenceTipy = defenceTipy;
    }
    public static void changeBossDefence() {
        Random r = new Random();
        int randomIndex = r.nextInt();
    }
}
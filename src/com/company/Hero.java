package com.company;

public class Hero {
    int Health;
    double Damage;
    String Superpower;

    public Hero(int health,double damage,String superpower) {
        Health = health;
        Damage = damage;
        Superpower = superpower;
    }

    public int getHealth() {
        return Health;
    }

    public void setHealth(int health) {
        Health = health;
    }

    public double getDamage() {
        return Damage;
    }

    public void setDamage(double damage) {
        Damage = damage;
    }

    public String getSuperpower() {
        return Superpower;
    }

    public void setSuperpower(String superpower) {
        Superpower = superpower;
    }
}

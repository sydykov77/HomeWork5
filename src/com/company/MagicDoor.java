package com.company;

public class MagicDoor {
    public  Hero[] CreateHeroes  () {
        Hero[] heroes = new Hero[4];
        Hero hero1 = new Hero(100, 20, "1");
        heroes[0] = hero1;
        Hero hero2 = new Hero(100, 20, "2");
        heroes[1] = hero2;
        Hero hero3 = new Hero(100, 20, "3");
        heroes[2] = hero3;
        Hero hero4 = new Hero(100, 20, "4");
        heroes[3] = hero4;
        return heroes;
    }
    }
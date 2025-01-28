package entities;

import java.util.ArrayList;

public class Monsters {

    private ArrayList<Monster> monsters = new ArrayList<Monster>();

    public  ArrayList<Monster> createMonsters(){
        for (int i = 0; i < 5; i++) {
            Monster monster = Monster.createMonster();
            monsters.add(monster);
        }
        System.out.println(monsters.size());
        return monsters;
    }
}

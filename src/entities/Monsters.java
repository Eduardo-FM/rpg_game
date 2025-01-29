package entities;

import java.util.ArrayList;

public class Monsters {

    private ArrayList<Monster> monsters = new ArrayList<Monster>();

    public  ArrayList<Monster> createMonsters(){
        monsters.clear();
        for (int i = 0; i < 5; i++) {
            Monster monster = Monster.createMonster();
            monsters.add(monster);
        }
        System.out.println(monsters.size());
        return monsters;
    }

    public Integer size() {
        return monsters.size();
    }

    public Monster get(Integer place) {
        return monsters.get(place);
    }
}

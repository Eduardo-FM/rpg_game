package entities;

import java.util.Scanner;

public class Monster extends Character {

    public Monster() {
        super(10.00, 5);
    }

    public final static Monster createMonster(Player player){
        Monster monster = new Monster();
        System.out.printf("A monster is attacking %s", player.getName());
        System.out.println("");
        return monster;
    }

}

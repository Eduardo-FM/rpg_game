package entities;

import java.util.Scanner;

public class Monster extends Character {

    public Monster() {
        super(10.00, 5);
    }

    public final static Monster createMonster(){
        Monster monster = new Monster();
        return monster;
    }

}

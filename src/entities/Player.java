package entities;

import java.util.Scanner;

public class Player extends Character{

    private String name;

    public Player(String name) {
        super(10.00, 7);

        this.name = name;
    }

    public String getName() {
        return name;
    }

    public final static Player createPlayer(){
        System.out.println("Choose your character name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("You have entered the dungeon.");
        Player player = new Player(name);
        return player;
    }


}

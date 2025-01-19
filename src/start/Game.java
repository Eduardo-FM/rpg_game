package start;

import entities.Monster;
import entities.Player;

import java.util.Scanner;

public abstract class Game {

    public static void start(){
        System.out.println("Choose your character name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("You have entered the dungeon.");

        Player player = new Player(name);
        Monster monster = new Monster();
        System.out.printf("A monster is attacking %s", name);
        System.out.println("");

        while (monster.getLifePoints() > 0){
            System.out.println("""
                    Choose your action:
                    0 - run
                    1 - attack
                    """);
            Integer action = scanner.nextInt();
            if (action == 1) {
                if (monster.getLifePoints() != 0) {
                    monster.lifeDemage(player.getAttack());
                    System.out.println("Monster life points" + monster.getLifePoints());
                } else {
                    System.out.println("The monster was destroy");
                }
            }
        }

        System.out.println("You have beet your enemy and survive");
    }
}

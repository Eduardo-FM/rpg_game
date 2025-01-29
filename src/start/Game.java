package start;

import entities.Monster;
import entities.Monsters;
import entities.Player;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Game {


    public static void start() {
        Player player = Player.createPlayer();
        Monsters monsters = new Monsters();
        monsters.createMonsters();

        while (player.getLifePoints() > 0) {
            for (int i = 0; i < monsters.size(); i++) {
                Monster currentMonster = monsters.get(i);
                System.out.println("A new monster appears!");

                while (currentMonster.getLifePoints() > 0 && player.getLifePoints() > 0) {
                    playerOptions();
                    Scanner scanner = new Scanner(System.in);
                    Integer action = scanner.nextInt();

                    switch (action) {
                        case 0:
                            System.out.println("You ran away!");
                            return;
                        case 1:
                            battle(player, currentMonster);
                        default:
                            System.out.println("Invalid action. Choose 0 or 1.");
                    }
                }

                if (player.getLifePoints() <= 0) {
                    System.out.println("You were defeated!");
                    return;
                }

                System.out.println("Monster defeated!");
            }

            System.out.println("You defeated all the monsters! Another wave is coming...");
            monsters.createMonsters();
        }

        System.out.println("Game over! You ran out of life points.");
    }


    private static void playerOptions() {
        System.out.println("""
                    Choose your action:
                    0 - run
                    1 - attack
                    """);
    }

    private static void battle(Player player, Monster monster){
        if (monster.getLifePoints() != 0) {
            monster.lifeDemage(player.getAttack());
            System.out.println("Monster life points " + monster.getLifePoints());
            player.lifeDemage(monster.getAttack());
            System.out.println("Player life points " + player.getLifePoints());
        } else {
            System.out.println("The monster was destroy");
        }
    }
}
